package admonArbol;

import javax.swing.table.DefaultTableModel;
import modelo.Libro;
import vista.Vista;

public class ArbolBinario {

    private Nodo raiz;

    //Asignar cabecera y valores a la tabla tblparcial de la vista
    String cabecera[] = {"Clave", "Título", "Autor", "ISBN"};
    String datos[][] = {};
    DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);

    public ArbolBinario(Vista vis) {
        //Asignación del modelo a ala tabla
        vis.getTblDatos().setModel(modelo);
    }

    public boolean insertar(int clave, Libro libro) {
        ResultadoInsercion resultado = insertarRecursivo(raiz, clave, libro);
        raiz = resultado.nodo;
        return resultado.exito;
    }

    private ResultadoInsercion insertarRecursivo(Nodo actual, int clave, Libro libro) {
        if (actual == null) {
            return new ResultadoInsercion(new Nodo(clave, libro), true);
        }

        if (clave < actual.clave) {
            ResultadoInsercion resultado = insertarRecursivo(actual.izquierda, clave, libro);
            actual.izquierda = resultado.nodo;
            return new ResultadoInsercion(actual, resultado.exito);
        } else if (clave > actual.clave) {
            ResultadoInsercion resultado = insertarRecursivo(actual.derecha, clave, libro);
            actual.derecha = resultado.nodo;
            return new ResultadoInsercion(actual, resultado.exito);
        } else {
            System.out.println(" No se puede insertar, la clave " + clave + " ya existe.");
            return new ResultadoInsercion(actual, false);
        }
    }

    public void inOrden() {
        
        //Izquiera - Raiz - Derecha
        limpiarTabla();
        inOrdenRecursivo(raiz);
    }

    private void inOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierda);
            //System.out.println("Clave: " + nodo.clave + ", Libro: " + nodo.libro);
            tabla(nodo);
            inOrdenRecursivo(nodo.derecha);
        }
    }

    public void preOrden() {
        limpiarTabla();
        preOrdenRecursivo(raiz);
        //System.out.println();
    }

    private void preOrdenRecursivo(Nodo nodo) {
        //Raiz - Izquierda - Derecha
        if (nodo != null) {
            //System.out.println("Clave: " + nodo.clave + ", Libro: " + nodo.libro);
            tabla(nodo);
            preOrdenRecursivo(nodo.izquierda);
            preOrdenRecursivo(nodo.derecha);
        }
    }

    public void postOrden() {
        
        //Izquiera - Derecha - Raiz
        limpiarTabla();
        postOrdenRecursivo(raiz);
        //System.out.println();
    }

    private void postOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            postOrdenRecursivo(nodo.izquierda);
            postOrdenRecursivo(nodo.derecha);
            //System.out.println("Clave: " + nodo.clave + ", Libro: " + nodo.libro);
            tabla(nodo);
        }
    }

    public Libro buscar(int clave) {
        return buscarRecursivo(raiz, clave);
    }

    private Libro buscarRecursivo(Nodo actual, int clave) {
        if (actual == null) {
            return null;
        }
        if (clave == actual.clave) {
            return actual.libro;
        }
        return clave < actual.clave 
                ? buscarRecursivo(actual.izquierda, clave)
                : buscarRecursivo(actual.derecha, clave);
    }

    public int profundidad() {
        return calcularProfundidad(raiz);
    }

    private int calcularProfundidad(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        int izquierda = calcularProfundidad(nodo.izquierda);
        int derecha = calcularProfundidad(nodo.derecha);
        return Math.max(izquierda, derecha) + 1;
    }

    public Libro eliminar(int clave) {
        ResultadoEliminacion resultado = eliminarRecursivo(raiz, clave);
        raiz = resultado.nodo;
        return resultado.libroEliminado;
    }

    private ResultadoEliminacion eliminarRecursivo(Nodo actual, int clave) {
        if (actual == null) {
            return new ResultadoEliminacion(null, null); // No se encontró la clave
        }

        if (clave < actual.clave) {
            ResultadoEliminacion resultado = eliminarRecursivo(actual.izquierda, clave);
            actual.izquierda = resultado.nodo;
            return new ResultadoEliminacion(actual, resultado.libroEliminado);
        } else if (clave > actual.clave) {
            ResultadoEliminacion resultado = eliminarRecursivo(actual.derecha, clave);
            actual.derecha = resultado.nodo;
            return new ResultadoEliminacion(actual, resultado.libroEliminado);
        } else {
            // Nodo encontrado
            Libro libroEliminado = actual.libro;

            if (actual.izquierda == null && actual.derecha == null) {
                return new ResultadoEliminacion(null, libroEliminado);
            } else if (actual.izquierda == null) {
                return new ResultadoEliminacion(actual.derecha, libroEliminado);
            } else if (actual.derecha == null) {
                return new ResultadoEliminacion(actual.izquierda, libroEliminado);
            } else {
                Nodo sucesor = encontrarMinimo(actual.derecha);
                actual.clave = sucesor.clave;
                actual.libro = sucesor.libro;
                ResultadoEliminacion resultado = eliminarRecursivo(actual.derecha, sucesor.clave);
                actual.derecha = resultado.nodo;
                return new ResultadoEliminacion(actual, libroEliminado);
            }
        }
    }

    private Nodo encontrarMinimo(Nodo nodo) {
        while (nodo.izquierda != null) {
            nodo = nodo.izquierda;
        }
        return nodo;
    }

    public void tabla(Nodo n) {
        //Asignación de los datos a la tabla
        Object contenido[] = {n.clave, n.libro.getTitulo(), n.libro.getAutor(), n.libro.getIsbn()};
        modelo.addRow(contenido);
    }

    public void limpiarTabla() {
        modelo.setRowCount(0);
    }

    //Clase para validar si se realiza la inserción (true) o (false) no se realiza la inserción
    private class ResultadoInsercion {

        Nodo nodo;
        boolean exito;

        ResultadoInsercion(Nodo nodo, boolean exito) {
            this.nodo = nodo;
            this.exito = exito;
        }
    }

    //Clase para validar si se realiza la eliminación del nodo devolviendolos datos del libro eliminado
    private class ResultadoEliminacion {

        Nodo nodo;
        Libro libroEliminado;

        ResultadoEliminacion(Nodo nodo, Libro libroEliminado) {
            this.nodo = nodo;
            this.libroEliminado = libroEliminado;
        }
    }
}
