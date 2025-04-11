
package modelo;


public class Modelo {

     private float valorCompra;
    private int formaPago;
    private String ideCli;
    private String NomCLi;
    private String apellido;

    public Modelo() {
    }

    public Modelo(float valorCompra, int formaPago, String ideCli, String NomCLi, String apellido) {
        this.valorCompra = valorCompra;
        this.formaPago = formaPago;
        this.ideCli = ideCli;
        this.NomCLi = NomCLi;
        this.apellido = apellido;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(int formaPago) {
        this.formaPago = formaPago;
    }

    public String getIdeCli() {
        return ideCli;
    }

    public void setIdeCli(String ideCli) {
        this.ideCli = ideCli;
    }

    public String getNomCLi() {
        return NomCLi;
    }

    public void setNomCLi(String NomCLi) {
        this.NomCLi = NomCLi;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    // Método para obtener el porcentaje de descuento o financiamiento
    public float financiacion(int formaPago) {
        float fin= 0;
        
        if(formaPago == 1)
            fin = 20;
        else if(formaPago == 2)
            fin = 5;
        else if(formaPago == 3)
            fin = 10;
        else if(formaPago == 4)
            fin = 15;
        else if(formaPago == 5)
            fin = 20;
        else if(formaPago == 6)
            fin = 30;
        else 
            fin = 0;
        
        return fin;
    }
    
    

    // Método para calcular el valor del descuento o incremento
    public float calcularDescuentoOIncremento(float valorCompra, float descuento) {
        return (valorCompra * descuento) / 100;
    }
    
    public float descuento(float val1, float val2){
    return val1 - val2;
    }
    
    public float añadido(float val1, float val2){
    return val1 + val2;
    }
    
    // Método para calcular el total a pagar
    public float calcularTotalPagar(float valorCompra, float añadido) {
        return valorCompra + añadido;
    }

}
