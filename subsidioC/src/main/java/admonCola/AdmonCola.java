package admonCola;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.estudiantes;
import view.VistaCola;

public class AdmonCola {

    
    public Queue<estudiantes> cola;
    
     DecimalFormat f1 = new DecimalFormat("###,###,###.##");
    DecimalFormat f2 = new DecimalFormat("#########.#%");
    DecimalFormat f3 = new DecimalFormat("$###,###,###.##");
    
    String cabecera1[] = {"Identificación", "Nombres", "Apellidos", "Valor Matrícula", "Promedio",};
    String datos1[][] = {};
    DefaultTableModel modelo1 = new DefaultTableModel(datos1, cabecera1);
    

    
    public AdmonCola(VistaCola visCol) {
        visCol.getTblestudiante().setModel(modelo1);
    }

    
    public Queue<estudiantes> getCola() {
        return cola;
    }

    
    public void crearCola() {
        cola = new LinkedList<>();
    }

    public void adicionar(estudiantes per) {
        cola.add(per);
        JOptionPane.showMessageDialog(null, "estudiante adicionado a la cola");
    }

    public void recorrerCola() {
        if (!cola.isEmpty()) {
            modelo1.setRowCount(0);
            for (estudiantes p : cola) {
                float porcentajeSubsidio = p.determinarPorcentajeSubsidio(p.getProSem());               
                Object contenido[] = {
                    p.getIdeEst(),
                    p.getNomEst(),
                    p.getApeEst(),
                    f3.format(p.getValMatSem()),
                    f1.format(p.getProSem()),
                };
                modelo1.addRow(contenido);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }
    }

    public void primero() {
        if (!cola.isEmpty()) {
            modelo1.setRowCount(0);
            estudiantes p = cola.peek();
            Object contenido[] = {
                p.getIdeEst(),
                p.getNomEst(),
                p.getApeEst(),
                f3.format(p.getValMatSem()),
                f1.format(p.getProSem()),   
            };
            modelo1.addRow(contenido);
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }
    }

    public void eliminar() {
        modelo1.setRowCount(0);
        if (!cola.isEmpty()) {
            estudiantes p = cola.poll();
            JOptionPane.showMessageDialog(null, "Estudiante eliminado de la cola: " + p.getNomEst() + " " + p.getApeEst());
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }
    }    
   
    public estudiantes buscarPorIdentificacion(String ideEst) {
        for (estudiantes est : cola) {
            if (est.getIdeEst().equals(ideEst)) {
                return est;
            }
        }
        return null;
    }
    
    public ArrayList<estudiantes> buscarPorApellido(String apellido) {
        ArrayList<estudiantes> resultado = new ArrayList<>();
        for (estudiantes est : cola) {
            if (est.getApeEst().equalsIgnoreCase(apellido)) {
                resultado.add(est);
            }
        }
        return resultado;
    }
    
    public ArrayList<estudiantes> buscarPorNombre(String nombre) {
        ArrayList<estudiantes> resultado = new ArrayList<>();
        for (estudiantes est : cola) {
            if (est.getNomEst().equalsIgnoreCase(nombre)) {
                resultado.add(est);
            }
        }
        return resultado;
    }
    
  
    public ArrayList<estudiantes> buscarPorPromedio(float promedio) {
        ArrayList<estudiantes> resultado = new ArrayList<>();
        for (estudiantes est : cola) {
            if (est.getProSem() == promedio) {
                resultado.add(est);
            }
        }
        return resultado;
    }
    
  
    public ArrayList<estudiantes> buscarPorValorMatricula(float valorMatricula) {
        ArrayList<estudiantes> resultado = new ArrayList<>();
        for (estudiantes est : cola) {
            if (est.getValMatSem() == valorMatricula) {
                resultado.add(est);
            }
        }
        return resultado;
    }
    
  
    public void mostrarResultadosBusqueda(ArrayList<estudiantes> resultados) {
        if (resultados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontraron resultados");
            return;
        }
        
        modelo1.setRowCount(0);
        for (estudiantes p : resultados) {
            
            Object contenido[] = {
                p.getIdeEst(),
                p.getNomEst(),
                p.getApeEst(),
                f3.format(p.getValMatSem()),
                f1.format(p.getProSem()),            
            };
            modelo1.addRow(contenido);
        }
    }
    
   
    public int getTamanoCola() {
        return cola.size();
    }
}