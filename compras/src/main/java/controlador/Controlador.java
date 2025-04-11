package controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo;
import validar.Validar;
import vista.VistaEntrada;
import vista.VistaParcial;
import vista.VistaTotal;
import vista.Vista_Principal;

public class Controlador {
    
    private Modelo mod;
    private Validar val;
    private VistaEntrada ent;
    private VistaParcial par;
    private VistaTotal tot;
    private Vista_Principal vis;
    
    // Variables para cálculos individuales (por compra)
    private float valDes, valAum, porDes, porAum, ValNet, totDesc = 0;
    private float valorCompra;  // Valor ingresado por el usuario
    private String formaPago;   // Tipo de forma de pago seleccionada

    // Variables para acumuladores y estadísticas generales
    private float totalFinanciamiento = 0;  // Total recargo por financiación
    private float totalComprasNetas = 0;    // Suma de los valores netos de todas las compras

    // Contadores para cada tipo de pago
    private int numContado = 0, numCredito8 = 0, numCredito15 = 0;
    private int numCredito30 = 0, numCredito60 = 0, numCredito90 = 0;
    private int totalCompras = 0; // Total de compras realizadas

    // Acumuladores de financiación por tipo de crédito
    private float totalFinanciamiento8 = 0, totalFinanciamiento15 = 0;
    private float totalFinanciamiento30 = 0, totalFinanciamiento60 = 0;
    private float totalFinanciamiento90 = 0;

    // Variables para calcular porcentajes de uso de cada forma de pago
    private float porcentajeContado = 0, porcentajeCredito8 = 0, porcentajeCredito15 = 0;
    private float porcentajeCredito30 = 0, porcentajeCredito60 = 0, porcentajeCredito90 = 0;

    //formatos de salida
    DecimalFormat f1 = new DecimalFormat("###,###,###.##");
    DecimalFormat f2 = new DecimalFormat("#########.#%");
    DecimalFormat f3 = new DecimalFormat("$###,###,###.##");
    
    //Asignar cabecera y valores a la tabla tblparcial del panel Parcial
    String cabecera[] = {"Ident.", "Nombres", "Apellidos", "Val. compra", "% Desc./Inc.", "Val. Desc./Inc.", "Val. Pagar"};
    String datos[][] = {};
    DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);

    public Controlador(Modelo mod, Validar val, VistaEntrada ent, VistaParcial par, VistaTotal tot, Vista_Principal vis) {
        this.mod = mod;
        this.val = val;
        this.ent = ent;
        this.par = par;
        this.tot = tot;
        this.vis = vis;
        
        this.vis.getBtnValidar().addActionListener(e -> {btnValidar();});
        this.vis.getBtnCalcuar().addActionListener(e -> {btnCalcular();});
        this.vis.getBtnTotalizar().addActionListener(e -> {btnTotalizar();});
        this.vis.getBtnLimpiar().addActionListener(e -> {btnLimpiar();});
        this.vis.getBtnSalir().addActionListener(e -> {System.exit(0);});
        this.par.getBtnVolver().addActionListener(e -> {btnVolver();});
        this.tot.getBtnVolver().addActionListener(e -> {btnVolver();});
    }

    private void btnValidar() {
        if (val.validarNumeroEnteroPositivo(ent.getTxtIdeCli().getText())) {
            mod.setIdeCli(ent.getTxtIdeCli().getText());
            if (val.validarNombre(ent.getTxtNomCli().getText())) {
                mod.setNomCLi(ent.getTxtNomCli().getText());
                if (val.validarApellido(ent.getTxtApellido().getText())) {
                    mod.setApellido(ent.getTxtApellido().getText());
                    if (val.validarNumeroRealPositivo(ent.getTxtValorCompra().getText())) {
                        mod.setValorCompra(Float.parseFloat(ent.getTxtValorCompra().getText()));
                        JOptionPane.showMessageDialog(null, "Datos validados correctamente", "Datos OK", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        error(ent.getTxtValorCompra(), "El valor de compra no es válido. Ingrese un valor válido.");
                    }
                } else {
                    error(ent.getTxtApellido(), "El apellido no es válido, su contenido no es válido");
                }
            } else {
                error(ent.getTxtNomCli(), "El nombre no es válido, su contenido no es válido");
            }
        } else {
            error(ent.getTxtIdeCli(), "La identificación no es válida, su contenido no es válido");
        }
    }

    private void btnCalcular() {
        // Obtener datos desde la vista
        valorCompra = Float.parseFloat(ent.getTxtValorCompra().getText());
        formaPago = ent.getCmbTipPag().getSelectedItem().toString();

        // Asignar al modelo
        mod.setValorCompra(valorCompra);

        // Determinar la forma de pago
        int tipoPago = switch (formaPago) {
            case "Contado" -> 1;
            case "Crédito 8 días" -> 2;
            case "Crédito 15 días" -> 3;
            case "Crédito 30 días" -> 4;
            case "Crédito 60 días" -> 5;
            case "Crédito 90 días" -> 6;
            default -> 0;
        };

        mod.setFormaPago(tipoPago);

        // Obtener el porcentaje de descuento o financiamiento
        float porcentaje = mod.financiacion(tipoPago);
        
        // En caso de contado, el porcentaje es negativo (descuento)
        if (tipoPago == 1) {
            porcentaje = -porcentaje;
        }
        
        // Calcular el valor del descuento o incremento
        float valorDescuentoOIncremento = mod.calcularDescuentoOIncremento(valorCompra, Math.abs(porcentaje));
        
        // Calcular el total a pagar
        float totalPagar;
        if (porcentaje < 0) {
            // Si es descuento (contado)
            totalPagar = mod.descuento(valorCompra, valorDescuentoOIncremento);
            totDesc += valorDescuentoOIncremento;
            numContado++;
        } else {
            // Si es incremento (crédito)
            totalPagar = mod.añadido(valorCompra, valorDescuentoOIncremento);
            totalFinanciamiento += valorDescuentoOIncremento;
            
            // Actualizar contadores y acumuladores según el tipo de crédito
            switch (tipoPago) {
                case 2 -> { totalFinanciamiento8 += valorDescuentoOIncremento; numCredito8++; }
                case 3 -> { totalFinanciamiento15 += valorDescuentoOIncremento; numCredito15++; }
                case 4 -> { totalFinanciamiento30 += valorDescuentoOIncremento; numCredito30++; }
                case 5 -> { totalFinanciamiento60 += valorDescuentoOIncremento; numCredito60++; }
                case 6 -> { totalFinanciamiento90 += valorDescuentoOIncremento; numCredito90++; }
            }
        }

        // Actualizar acumuladores
        totalCompras++;
        totalComprasNetas += totalPagar;

        // Agregar fila a la tabla
        modelo.addRow(new Object[]{
            mod.getIdeCli(),                // Identificación
            mod.getNomCLi(),                // Nombre
            mod.getApellido(),              // Apellido
            f3.format(valorCompra),         // Valor de la compra
            f2.format(Math.abs(porcentaje) / 100), // Porcentaje de descuento/incremento
            f3.format(valorDescuentoOIncremento),  // Valor del descuento/aumento
            f3.format(totalPagar)           // Valor a pagar final
        });

        // Asignar modelo actualizado a la tabla
        par.getTabla().setModel(modelo);

        // Mostrar la Vista Parcial
        showPane(par);
    }

    private void btnTotalizar() {
        if (totalCompras > 0) {
            porcentajeContado = (float) numContado / totalCompras * 100;
            porcentajeCredito8 = (float) numCredito8 / totalCompras * 100;
            porcentajeCredito15 = (float) numCredito15 / totalCompras * 100;
            porcentajeCredito30 = (float) numCredito30 / totalCompras * 100;
            porcentajeCredito60 = (float) numCredito60 / totalCompras * 100;
            porcentajeCredito90 = (float) numCredito90 / totalCompras * 100;
        }

        try {
            // Actualizar estadísticas en la vista total
            tot.getTxtComContado().setText(String.valueOf(numContado));
            tot.getTxtCom8().setText(String.valueOf(numCredito8));
            tot.getTxtCom15().setText(String.valueOf(numCredito15));
            tot.getTxtCom30().setText(String.valueOf(numCredito30));
            tot.getTxtCom60().setText(String.valueOf(numCredito60));
            tot.getTxtCom90().setText(String.valueOf(numCredito90));
            tot.getTxtNeto().setText(String.valueOf(totalCompras));

            tot.getTxtFinContado().setText(f3.format(0));
            tot.getTxtFin8().setText(f3.format(totalFinanciamiento8));
            tot.getTxtFin15().setText(f3.format(totalFinanciamiento15));
            tot.getTxtFin30().setText(f3.format(totalFinanciamiento30));
            tot.getTxtFin60().setText(f3.format(totalFinanciamiento60));
            tot.getTxtFin90().setText(f3.format(totalFinanciamiento90));
            tot.getTxtTotPagFin().setText(f3.format(totalFinanciamiento));

            tot.getTxtPorContado().setText(f2.format(porcentajeContado / 100));
            tot.getTxtPor8().setText(f2.format(porcentajeCredito8 / 100));
            tot.getTxtPor15().setText(f2.format(porcentajeCredito15 / 100));
            tot.getTxtPor30().setText(f2.format(porcentajeCredito30 / 100));
            tot.getTxtPor60().setText(f2.format(porcentajeCredito60 / 100));
            tot.getTxtPor90().setText(f2.format(porcentajeCredito90 / 100));

            tot.getTxtTotDesCli().setText(f3.format(totDesc));
            tot.getTxtTotPagFin().setText(f3.format(totalFinanciamiento));
            tot.getTxtNeto().setText(f3.format(totalComprasNetas));

            // Calcular y mostrar los valores pagados por cada tipo de pago
            tot.getTxtValPagContado().setText(f3.format(calcularValorPagadoTipo(1)));
            tot.getTxtValPag8().setText(f3.format(calcularValorPagadoTipo(2)));
            tot.getTxtValPag15().setText(f3.format(calcularValorPagadoTipo(3)));
            tot.getTxtValPag30().setText(f3.format(calcularValorPagadoTipo(4)));
            tot.getTxtValPag60().setText(f3.format(calcularValorPagadoTipo(5)));
            tot.getTxtValPag90().setText(f3.format(calcularValorPagadoTipo(6)));

            showPane(tot);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar totales: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private float calcularValorPagadoTipo(int tipo) {
        float factor = switch (tipo) {
            case 1 -> 0.8f;  // 20% descuento
            case 2 -> 1.05f; // 5% incremento
            case 3 -> 1.10f; // 10% incremento
            case 4 -> 1.15f; // 15% incremento
            case 5 -> 1.20f; // 20% incremento
            case 6 -> 1.30f; // 30% incremento
            default -> 1;
        };

        int cantidad = switch (tipo) {
            case 1 -> numContado;
            case 2 -> numCredito8;
            case 3 -> numCredito15;
            case 4 -> numCredito30;
            case 5 -> numCredito60;
            case 6 -> numCredito90;
            default -> 0;
        };

        if (cantidad == 0) return 0;
        float valorBase = totalComprasNetas / totalCompras;
        return valorBase * cantidad;
    }

    public void showPane(JPanel p) {
        p.setSize(800, 500);
        p.setLocation(0, 0);
        vis.getContenedor().removeAll();
        vis.getContenedor().add(p, BorderLayout.CENTER);
        vis.getContenedor().revalidate();
        vis.getContenedor().repaint();
    }

    private void btnLimpiar() {
        ent.getTxtIdeCli().setText("");
        ent.getTxtNomCli().setText("");
        ent.getTxtApellido().setText("");
        ent.getTxtValorCompra().setText("");
        ent.getTxtIdeCli().requestFocus();
    }
    
    private void btnVolver() {
        showPane(ent);
        btnLimpiar();
    }
    
    public void error(javax.swing.JTextField txtName, String msg) {
        // Cambiar el color del texto del JOptionPane a rojo
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.RED));
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
        txtName.setText("");
        txtName.requestFocus();

        // Resetear el color a su valor original (opcional)
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.BLACK));
    }
}




