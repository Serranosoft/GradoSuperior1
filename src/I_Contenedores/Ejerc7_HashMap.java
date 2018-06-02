/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class Ejerc7_HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<Integer, String>();
        
        hm.put(1,"Ernesto");
        hm.put(4,"Daniel");
        hm.put(2,"Lauren");
        hm.put(3,"Ramon");
        
        if(hm.containsKey(5)){
            System.out.println("Codigo duplicado. Imposible insertar");
        }else{
            
            hm.put(5,"Ramon");
            System.out.println("Insertado Correctamente!");
            
        }
        int clave = 0;

        Iterator<Integer> it = hm.keySet().iterator();
        while(it.hasNext()){
            clave = it.next();

            System.out.println(clave + ": " +hm.get(clave));
        }
    }
    
}
