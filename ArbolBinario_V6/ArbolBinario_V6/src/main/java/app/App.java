

package app;

import admonArbol.ArbolBinario;
import admonArbol.Nodo;
import controlador.Controlador;
import modelo.Libro;
import validar.Validar;
import vista.Vista;



public class App {

    public static void main(String[] args) {
        Libro lib           = new Libro();
        Nodo  nod           = new Nodo();
        Vista vis           = new Vista();
        ArbolBinario arbBin = new ArbolBinario(vis); 
        Validar val         = new Validar();
        Controlador con     = new Controlador(lib, nod, arbBin, val, vis);
        con.titulo();
        con.dehabilitarBtn();
    }
}
