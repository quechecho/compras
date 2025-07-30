
package model;


public class ModeloBelleza {
    
    //Atributos de la clase, datos de entrada
    private String ideCli;
    private String nomCli;
    private String apeCli;
    private int tipCli;
    private int antCli;
    private float valCom;
    
    //Constructores

    public ModeloBelleza() {
    }

    public ModeloBelleza(String ideCli, String nomCli, String apeCli, int tipCli, int antCli, float valCom) {
        this.ideCli = ideCli;
        this.nomCli = nomCli;
        this.apeCli = apeCli;
        this.tipCli = tipCli;
        this.antCli = antCli;
        this.valCom = valCom;
    }
    
    //Métodos getters y setters

    public String getIdeCli() {
        return ideCli;
    }

    public void setIdeCli(String ideCli) {
        this.ideCli = ideCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
    }

    public int getTipCli() {
        return tipCli;
    }

    public void setTipCli(int tipCli) {
        this.tipCli = tipCli;
    }

    public int getAntCli() {
        return antCli;
    }

    public void setAntCli(int antCli) {
        this.antCli = antCli;
    }

    public float getValCom() {
        return valCom;
    }

    public void setValCom(float valCom) {
        this.valCom = valCom;
    }
    
    //Métodos adicionales
    
    //Método para determinar el porcentaje de decuento
    public float determinarPorcentaje(int tipCli, int antCli, float valCom){
        float porDes= 0;
        
        if((tipCli == 1)&& (antCli >= 5))
            porDes = 30;
        else if((tipCli == 1)&& (antCli >= 2) && (antCli < 5))
            porDes = 20;
        else if((tipCli == 1)&& (antCli < 2))
            porDes = 10;
        else if((tipCli == 2)&& (antCli >= 5))
            porDes = 25;
        else if((tipCli == 2)&& (antCli >= 2) && (antCli < 5))
            porDes = 15;
        else if((tipCli == 2)&& (antCli < 2))
            porDes = 5;
        else if((tipCli == 3) && (valCom >= 5000000))
            porDes = 15;
        else if((tipCli == 3) && (valCom >= 2500000) && (valCom < 5000000))
            porDes = 10;
        else if((tipCli == 3) && (valCom >= 1000000) && (valCom < 2500000))
            porDes = 5;
        else
            porDes = 0;
        
        return porDes;
    }

    //Méto para multiplicar 2 valores y dividirlo entre otro valor
    public float valorDescontar(float valCom, float porDes) {
        return (valCom * porDes) / 100;
    }

    //Método para restar 2 valores
    public float valorPagar(float valCom, float valDes) {
        return valCom - valDes;
    }

    //Método para sumar 2 valores float
    public float sumar2Valores(float val1, float val2) {
        return val1 + val2;
    }

    //Método para sumar 2 valores int
    public int sumar2Valores(int val1, int val2) {
        return val1 + val2;
    }

    //Método para sumar 3 valores enteros
    public int sumar3Valores(int val1, int val2, int val3) {
        return val1 + val2 + val3;
    }

    //Método para calcular el porcentaje
    public float calcularPorcentaje(int val1, float val2) {
        return (val1 * 100) / val2;
    }
    
}
