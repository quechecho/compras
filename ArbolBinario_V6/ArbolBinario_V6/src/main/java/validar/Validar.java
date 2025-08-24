package validar;

public class Validar {

    //Validar cadena
    public boolean validarCadena(String cad) {
        return cad.matches("^([A-Za-záéíóúÁÉÍÓÚ]+)$");
    }
    
    public boolean validarIsbn(String cad) {
        return cad.matches("^([0-9\\-]+)$");
    }
    
    //Validar número entero positivo 
    public boolean validarNumeroEnteroPositivo(String num) {
        return num.matches("^[0-9]+$");
    }
}
