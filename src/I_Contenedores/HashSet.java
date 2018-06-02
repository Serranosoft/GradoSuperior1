/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores;

import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class HashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Set lista = new java.util.HashSet(); //Es un tipo de contenedor que no permite datos repetidos
        
        lista.add("Pablo");
        lista.add("Enrique");
        lista.add("Sara");
        lista.add("Sara");
        lista.add("Lauren");
        lista.add("Lauren");
        lista.add("Lauren");
        lista.add("Enrique");
        lista.add(null);
        lista.add(null);
        
        Iterator it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            
            
        }
        
    }
    
}
