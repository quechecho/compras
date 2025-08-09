package admonCola;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.estudiantes;
import view.VistaCola;

public class AdmonCola {

    // Declarar la cola de personas
    public Queue<estudiantes> cola;

    //Asignar cabecera y valores a la tabla tblparcial del panel SalidaParcial
    String cabecera[] = {"Identificación", "Nombres", "Apellidos", "Valor Matrícula", "Promedio", "Valor Subsidio"};
    String datos[][] = {};
    DefaultTableModel modelo1 = new DefaultTableModel(datos, cabecera);

    //Constructor
    public AdmonCola(VistaCola visCol) {

        //Asignar el modelo a la tabla
        visCol.getTblestudiante().setModel(modelo1);
    }

    //Método get
    public Queue<estudiantes> getCola() {
        return cola;
    }

    //Crear la cola
    public void crearCola() {
        cola = new LinkedList<>();
    }

    //Insertar un objeto de la clase persona a la cola
    public void adicionar(estudiantes per) {
        cola.add(per);
        JOptionPane.showMessageDialog(null, "estudiante adicionado a la cola");
    }

    public void recorrerCola() {
        if (!cola.isEmpty()) {
            modelo1.setRowCount(0);
            for (estudiantes p : cola) {
                float porcentajeSubsidio = p.determinarPorcentajeSubsidio(p.getProSem());
                float valorSubsidio = p.valorSubsidio(p.getValMatSem(), porcentajeSubsidio);
                Object contenido[] = {
                    p.getIdeEst(),
                    p.getNomEst(),
                    p.getApeEst(),
                    p.getValMatSem(),
                    p.getProSem(),
                    valorSubsidio
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
            float porcentajeSubsidio = p.determinarPorcentajeSubsidio(p.getProSem());
            float valorSubsidio = p.valorSubsidio(p.getValMatSem(), porcentajeSubsidio);
            Object contenido[] = {
                p.getIdeEst(),
                p.getNomEst(),
                p.getApeEst(),
                p.getValMatSem(),
                p.getProSem(),
                valorSubsidio
            };
            modelo1.addRow(contenido);
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }
    }

    public void eliminar() {
        if (!cola.isEmpty()) {
            estudiantes p = cola.poll();
            JOptionPane.showMessageDialog(null, "Estudiante eliminado de la cola: " + p.getNomEst() + " " + p.getApeEst());
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }
    }
}
