package admonArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelo.estudiantes;

public class AdministradorArray {
    private ArrayList<estudiantes> vecEst;

    public ArrayList<estudiantes> getvecEst() {
         return vecEst;

    }
          
    public void crearVector(){
        vecEst = new ArrayList<>();
    }

    public void adicionar(estudiantes modEst){
        vecEst.add(modEst);
    }

    public int buscarideEst(String ideEst){
         boolean sw = false;
        int i = 0;
        while (!sw && i < vecEst.size()) {
            if (vecEst.get(i).getIdeEst().equals(ideEst)) {
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
    
    public void ordenarIdentificacion(){
        Collections.sort(vecEst, Comparator.comparing(d -> d.getIdeEst()));
    }

    public void ordenarApellido() {
        Collections.sort(vecEst, Comparator.comparing(d -> d.getApeEst()));
    }
    
    public void ordenarNombre() {
        Collections.sort(vecEst, Comparator.comparing(d -> d.getNomEst()));
    }

    public void ordenarvalormateriasemestre(){
        Collections.sort(vecEst, Comparator.comparing(d -> d.getValMatSem()));

    }

    public void ordenarpromediosemestre(){
        Collections.sort(vecEst, Comparator.comparing(d -> d.getProSem()));

    }
     public void eliminar(int ind){
        vecEst.remove(ind);
    }   

}