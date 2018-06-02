/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class Ejerc5_TreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortedSet<String> lista = new TreeSet<String>();
        
        lista.add("Manuel");
        lista.add("Alvaro");
        lista.add("Lauren");
        lista.add("Enrique");
        
        Iterator it = lista.iterator();
        
        
        while (it.hasNext()){
            System.out.println(it.next());
            
            
            
        }
    }
    
}
