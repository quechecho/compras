
package app;

import modelo.estudiantes;
import view.SalidasPariales;
import view.Totales;
import view.VistaCola;
import view.VistaSubsidios;
import validar.Validar;
import controlador.ControladorCola;

public class App {

    public static void main(String[] args) {
        estudiantes est        = new estudiantes();
        VistaSubsidios VisSub  = new VistaSubsidios();
        Totales tot              = new Totales();
        SalidasPariales SalPar   = new SalidasPariales();
        Validar val            = new Validar();
        VistaCola        ent = new VistaCola();
        ControladorCola  conCol = new ControladorCola(est, VisSub, SalPar, tot, val, ent);
        conCol.titulo();
        ent.setVisible(true);
        VisSub.setVisible(true);
        ent.getTextideEst().requestFocus();
        VisSub.getBtnCalcular().setEnabled(false);
        VisSub.getBtnTotalizar().setEnabled(false);
        VisSub.setVisible(true);
        
    }
}
