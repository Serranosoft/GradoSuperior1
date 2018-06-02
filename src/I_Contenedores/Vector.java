/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection v1 = (Collection) new java.util.Vector(); //Solo usa los metodos de collection
        List v2 = (List) new java.util.Vector();  // Usa los métodos de collection y los de list
        java.util.Vector v3 = new java.util.Vector(); // Usa los métodos de collection, los de list y los suyos propios
        
        v1.add("Hola");
        v1.add("Mundo!");
        v1.add("Adios");
        v1.remove("Hola");
        
        v2.add("Me");
        v2.add("Llamo");
        v2.add("Perico");
        
        System.out.println("V2 pos 2: " + v2.get(1));
        
        v3.add("Pepe");
        v3.add(0);
        System.out.println("V3 pos 1: " +v3.get(0));
        
        mi_Iterator(v1);
        
        
        mi_ListIterator(v2);
        

               
    }

    private static void mi_ListIterator(List v2) {
        ListIterator li = v2.listIterator();
        
        while(li.hasNext()){
            System.out.println("Indice anterior " +li.nextIndex());
            System.out.println(li.next());
        }
        
        System.out.println("***************************************");
        
        while(li.hasPrevious()){
            System.out.println("Indice posterior " +li.nextIndex());
            System.out.println(li.previous());
            li.remove();
        }
    }

    private static void mi_Iterator(Collection v1) {
        // Utilizamos iterator para recorrer la lista entera
        
        Iterator it = v1.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("Tamaño: " + v1.size());
        
        
        //v1.clear(); //Vaciar Vector
        // Iterator
        Iterator it1 = v1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
            it1.remove();
        }
        System.out.println("");
    }
    
}
