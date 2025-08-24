
package admonArbol;

import modelo.Libro;


public class Nodo {
    public int clave;
    public Libro libro;
    public Nodo izquierda;
    public Nodo derecha;

    public Nodo() {
    }
    
    public Nodo(int clave, Libro libro) {
        this.clave = clave;
        this.libro = libro;
        this.izquierda = null;
        this.derecha = null;
    }
}
