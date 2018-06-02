/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class LinkeList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList nombres = new LinkedList();
        
        nombres.add("Ernesto");
        nombres.add("Enrique se rie");
        nombres.add("Alvaro");
        
        nombres.addFirst("Pepe");
        nombres.addLast("Miguel");
        nombres.add(2, "Sergio");
        
        System.out.println("\nContenido" + nombres);
        System.out.println("Elemento primero: " +nombres.getFirst());
        System.out.println("Elemento ultimo: " +nombres.getLast());
    }
    
}
