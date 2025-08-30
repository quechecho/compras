package controlador;
import modelo.Cuenta;
import view.VistaConsola;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorBanco implements Runnable {
    private Cuenta cuenta;
    private VistaConsola vista;
    private boolean esControladorPrincipal;
    
    // Constructor para el controlador principal (maneja eventos)
    public ControladorBanco(Cuenta cuenta, VistaConsola vista, boolean esControladorPrincipal) {
        this.cuenta = cuenta;
        this.vista = vista;
        this.esControladorPrincipal = esControladorPrincipal;
        
        if (esControladorPrincipal) {
            configurarEventos();
            configurarVistaInicial();
        }
    }
    
    // Constructor para hilos de trabajo (solo ejecutan retiros)
    public ControladorBanco(Cuenta cuenta, VistaConsola vista) {
        this.cuenta = cuenta;
        this.vista = vista;
        this.esControladorPrincipal = false;
    }
    
    private void configurarVistaInicial() {
        // Configurar campos iniciales
        vista.getjTextSaldo().setText("500000.0");
        vista.getjTextSaldo().setEditable(false);
        vista.getjTextEstado().setText("Listo");
        vista.getjTextEstado().setEditable(false);
        vista.getjTextHilo().setText("0");
        vista.getjTextHilo().setEditable(false);
        vista.getjTextsimulacion().setEditable(false);
        vista.getjTextsimulacion().setFont(new java.awt.Font("Monospaced", 0, 12));
    }
    
    private void configurarEventos() {
        // Configurar botón Iniciar
        vista.getBtnIniciar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarSimulacion();
            }
        });
        
        // Configurar botón Nuevo (Limpiar)
        vista.getBtnNuevo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarResultados();
            }
        });
        
        // Configurar botón Ver Saldo
        vista.getBtnSaldo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarSaldoActual();
            }
        });
    }
    
    private void iniciarSimulacion() {
        // Reiniciar cuenta
        cuenta = new Cuenta();
        vista.getjTextsimulacion().setText("");
        mostrarMensaje("=== INICIANDO SIMULACIÓN BANCARIA ===");
        mostrarMensaje("Saldo inicial: $" + cuenta.getSaldo());
        mostrarMensaje("Creando hilos para realizar retiros...\n");
        
        vista.getjTextEstado().setText("Ejecutando");
        vista.getjTextSaldo().setText(cuenta.getSaldo().toString());
        
        // Crear controladores SOLO para los hilos de trabajo (sin eventos)
        ControladorBanco trabajador1 = new ControladorBanco(cuenta, vista);
        ControladorBanco trabajador2 = new ControladorBanco(cuenta, vista);
        ControladorBanco trabajador3 = new ControladorBanco(cuenta, vista);
        
        // Crear y ejecutar hilos
        Thread hilo1 = new Thread(trabajador1, "Cliente-1");
        Thread hilo2 = new Thread(trabajador2, "Cliente-2");
        Thread hilo3 = new Thread(trabajador3, "Cliente-3");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        // Actualizar contador de hilos activos
        vista.getjTextHilo().setText("3");
        
        // Crear un hilo para monitorear cuando terminen todos
        new Thread(() -> {
            try {
                hilo1.join();
                hilo2.join();
                hilo3.join();
                
                SwingUtilities.invokeLater(() -> {
                    vista.getjTextEstado().setText("Completado");
                    vista.getjTextHilo().setText("0");
                    mostrarMensaje("\n=== SIMULACIÓN TERMINADA ===");
                    mostrarSaldoFinal(cuenta.getSaldo());
                });
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
    
    private void limpiarResultados() {
        vista.getjTextsimulacion().setText("");
        vista.getjTextEstado().setText("Listo");
        vista.getjTextHilo().setText("0");
        vista.getjTextSaldo().setText("500000.0");
    }
    
    private void mostrarSaldoActual() {
        if (cuenta != null) {
            mostrarMensaje("Saldo actual: $" + cuenta.getSaldo());
            vista.getjTextSaldo().setText(cuenta.getSaldo().toString());
        }
    }
    
    private void mostrarMensaje(String mensaje) {
        SwingUtilities.invokeLater(() -> {
            vista.getjTextsimulacion().append(mensaje + "\n");
            vista.getjTextsimulacion().setCaretPosition(vista.getjTextsimulacion().getDocument().getLength());
        });
    }
    
    @Override
    public void run() {
        // Este método solo se ejecuta para los hilos de trabajo
        if (!esControladorPrincipal) {
            for (int x = 0; x < 5; x++) {
                hacerRetiro(100000.0);
                
                // Verificar si la cuenta está sobregirada
                if (cuenta.getSaldo() < 0) {
                    mostrarCuentaSobregirada();
                }
                
                try {
                    Thread.sleep(100); // Pequeña pausa entre retiros
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }
    
    private void hacerRetiro(Double cantidad) {
        String nombreHilo = Thread.currentThread().getName();
        
        // Sincronización mejorada para evitar condiciones de carrera
        synchronized (cuenta) {
            if (cuenta.validarSaldo(cantidad)) {
                mostrarRetiroIniciado(nombreHilo);
                
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    return;
                }
                
                cuenta.retirar(cantidad);
                mostrarRetiroCompletado(nombreHilo);
            } else {
                mostrarSaldoInsuficiente(nombreHilo);
            }
        }
    }
    
    // Métodos de visualización como los del vista banco
    public void mostrarRetiroIniciado(String nombreHilo) {
        SwingUtilities.invokeLater(() -> {
            mostrarMensaje(nombreHilo + " va a retirar");
        });
    }
    
    public void mostrarRetiroCompletado(String nombreHilo) {
        SwingUtilities.invokeLater(() -> {
            mostrarMensaje(nombreHilo + " ha retirado");
            vista.getjTextSaldo().setText(cuenta.getSaldo().toString());
        });
    }
    
    public void mostrarSaldoInsuficiente(String nombreHilo) {
        SwingUtilities.invokeLater(() -> {
            mostrarMensaje(nombreHilo + " no ha podido retirar por falta de saldo");
        });
    }
    
    public void mostrarCuentaSobregirada() {
        SwingUtilities.invokeLater(() -> {
            mostrarMensaje("La cuenta está sobregirada");
        });
    }
    
    public void mostrarSaldoFinal(double saldo) {
        SwingUtilities.invokeLater(() -> {
            mostrarMensaje("Saldo final: $" + saldo);
            vista.getjTextSaldo().setText(String.valueOf(saldo));
        });
    }
}