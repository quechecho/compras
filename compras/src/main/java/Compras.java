
import controlador.Controlador;
import modelo.Modelo;
import vista.VistaEntrada;
import vista.VistaParcial;
import vista.VistaTotal;
import vista.Vista_Principal;
import validar.Validar;


public class Compras {

    public static void main(String[] args) {
        Modelo mod         = new Modelo();
        Validar val           = new Validar();
        VistaEntrada ent      = new VistaEntrada();
        VistaParcial par      = new VistaParcial();
        VistaTotal tot        = new VistaTotal();
        Vista_Principal vis   = new Vista_Principal();

        // Crear el controlador y pasar las instancias necesarias
        Controlador con = new Controlador(mod, val, ent, par, tot, vis);

        // Configurar la interfaz inicial

        vis.setVisible(true);
        con.showPane(ent);
    }
}

