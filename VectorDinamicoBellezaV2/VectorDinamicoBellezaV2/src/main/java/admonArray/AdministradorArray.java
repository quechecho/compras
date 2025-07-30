
package admonArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.ModeloBelleza;


public class AdministradorArray {
    //Declaración del vector
    private ArrayList<ModeloBelleza> vecBel;

    //Método getter 
    public ArrayList<ModeloBelleza> getVecBel() {
        return vecBel;
    }

    //Crear el AreayList
    public void crearVector(){
        vecBel = new ArrayList();
    }
    
    //Insertar un objeto de la clase Modelo al ArrayList
    public void adicionar(ModeloBelleza modBel){
        vecBel.add(modBel);
    }
    
    //Buscar por identificación en el vector
    public int buscarIdeCli(String ideCli){
        boolean sw = false;
        int i = 0;
        while (!sw && i < vecBel.size()) {
            if (vecBel.get(i).getIdeCli().equals(ideCli)) {
                sw = true;
            } else {
                i += 1;
            }
        }
        
        if(sw)
            return i;
        else
            return -1;
    }
       
    //Buscar clientes por apellidos
    public ArrayList<ModeloBelleza> buscarApeCli(String apeCli) {
        ArrayList<ModeloBelleza> resultado;
        resultado = new ArrayList();
        
        for(ModeloBelleza m: vecBel ){
            if(m.getApeCli().equals(apeCli))
                resultado.add(m);
        }
        return resultado;
    }
    
    //Buscar clientes por nombres
    public ArrayList<ModeloBelleza> buscarNomCli(String nomCli) {
        ArrayList<ModeloBelleza> resultado;
        resultado = new ArrayList();
        
        for(ModeloBelleza m: vecBel ){
            if(m.getNomCli().equals(nomCli))
                resultado.add(m);
        }
        return resultado;
    }
    
    //Buscar clientes por valor de la compra
    public ArrayList<ModeloBelleza> buscarValCom(float valCom) {
        ArrayList<ModeloBelleza> resultado;
        resultado = new ArrayList();
        
        for(ModeloBelleza m: vecBel ){
            if(m.getValCom()>= valCom)
                resultado.add(m);
        }
        return resultado;
    }
    
    //Buscar clientes por tipo cliente
    public ArrayList<ModeloBelleza> buscarTipCli(int tipCli) {
        ArrayList<ModeloBelleza> resultado;
        resultado = new ArrayList();
        
        for(ModeloBelleza m: vecBel ){
            if(m.getTipCli()== tipCli)
                resultado.add(m);
        }
        return resultado;
    }
    
    //Buscar clientes por antiguedad
    public ArrayList<ModeloBelleza> buscarAntCli(int antCli) {
        ArrayList<ModeloBelleza> resultado;
        resultado = new ArrayList();
        
        for(ModeloBelleza m: vecBel ){
            if(m.getAntCli()>= antCli)
                resultado.add(m);
        }
        return resultado;
    }
    
    //Ordenar por identificación
    public void ordenarIdentificacion() {
       Collections.sort(vecBel, Comparator.comparing(d -> d.getIdeCli()));
        
    }
    
    //ordenar por apellido
    public void ordenarApellido() {
        Collections.sort(vecBel, Comparator.comparing(d -> d.getApeCli()));
    }
    
    //ordenar por nombre
    public void ordenarNombre() {
        Collections.sort(vecBel, Comparator.comparing(d -> d.getNomCli()));
    }
    
    //ordenar valor de la compra
    public void ordenarCompra() {
        Collections.sort(vecBel, Comparator.comparing(d -> d.getValCom()));
    }
    
    //ordenar por tipo cliente
    public void ordenarTipo() {
        Collections.sort(vecBel, Comparator.comparing(d -> d.getTipCli()));
    }
    
    //ordenar por antiguedad cliente
    public void ordenarAntiguedad() {
        Collections.sort(vecBel, Comparator.comparing(d -> d.getAntCli()));
    }
    //Eliminar un objeto del vector
    public void eliminar(int ind){
        vecBel.remove(ind);
    }   
}
