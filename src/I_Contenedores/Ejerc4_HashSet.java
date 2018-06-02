/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores;

import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ejerc4_HashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Personas> personas = new java.util.HashSet();
        Personas p1 = new Personas("Adrian", 45);
        Personas p2 = new Personas("Santi", 55);
        Personas p3 = new Personas("Ramon", 50);
        Personas p4 = new Personas("Alvaro", 15);
        Personas p5 = new Personas("Alvaro", 60);
        Personas p6 = new Personas("Ramon", 50);
        Personas p7 = new Personas("Alvaro", 60); //Podemos crear en el class un insert code hashcode para que solo aparezca un alvaro con 60 años y no se repita.
        
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        personas.add(p6);
        personas.add(p7);
        
        
        System.out.println("Tamaño" +personas);
        System.out.println(personas);
        
        personas.remove(p4);
        System.out.println(personas);
        
        System.out.println("Busca a Ramon 50");
        if(personas.contains(new Personas("Ramon", 50))){
            System.out.println("Esta en la lista");
        }else{
            System.out.println("No lo encuentro!");
        }
        
        //foreach
        for(Personas p: personas){
            System.out.println(p.getNombre());
        }
        
    }
    
}
