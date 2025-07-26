
package modelo;

public class Producto {
    private String nombre;
    private double precio;
    private String descripcion;
    private int id;

    public Producto(String nombre, double precio, String descripcion, int id) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.id = id;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public class stock {
    private Producto producto;
    private int id;
    
    public stock(Producto producto, int id){
    this.producto = producto;
    this.id = id;
    
    }

        public Producto getProducto() {
            return producto;
        }

        public void setProducto(Producto producto) {
            this.producto = producto;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
      
    
}


}

    


