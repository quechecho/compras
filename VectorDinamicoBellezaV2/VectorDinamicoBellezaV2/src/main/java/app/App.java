
package app;

import admonArray.AdministradorArray;
import controller.ControladorBelleza;
import model.ModeloBelleza;
import validate.Validar;
import view.DatoEntrada;
import view.SalidaParcial;
import view.SalidaTotal;
import view.VerVector;
import view.VistaBelleza;

public class App {

    public static void main(String[] args) {
        ModeloBelleza modBel      = new ModeloBelleza();
        Validar val               = new Validar();
        VistaBelleza visBel       = new VistaBelleza();
        DatoEntrada datEnt        = new DatoEntrada();
        SalidaParcial salPar      = new SalidaParcial();
        SalidaTotal salTot        = new SalidaTotal();
        VerVector verVec          = new VerVector();
        AdministradorArray admArr = new AdministradorArray();
        ControladorBelleza conBel = new ControladorBelleza(modBel, val, visBel, datEnt, salPar, salTot, verVec, admArr);
        conBel.titulo();
        visBel.setVisible(true);
        conBel.deshabilitarBtnVisBelDatEnt();
        conBel.showPane(datEnt);
        datEnt.getTxtIdeCli().requestFocus();
    }
}
