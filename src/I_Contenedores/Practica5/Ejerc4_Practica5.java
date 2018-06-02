/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores.Practica5;

import java.util.Comparator;
import java.util.Iterator;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class Ejerc4_Practica5 {
     
    public static void main(String[] args) {
        // Creo la lista de tipo TreeSet con los valores de la clase "Coche_Practica5"
        Set<Coche_Practica5> lista = new TreeSet<>();
        // Creo los objetos por código
        Coche_Practica5 c1 = new Coche_Practica5("Renault", "Megane", 10);
        Coche_Practica5 c2 = new Coche_Practica5("Citroen", "C4", 150);
        Coche_Practica5 c3 = new Coche_Practica5("Seat", "Leon", 850);
        Coche_Practica5 c4 = new Coche_Practica5("Chevrolet", "Epica", 10510);
        Coche_Practica5 c5 = new Coche_Practica5("Land Rover", "GT", 4580);
        // Inserto los objetos en la lista
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);
        // Muestro de forma natural es decir con un simple iterator los objetos de la lista
        Iterator it = lista.iterator();
        System.out.println("-------------------------ORDEN NATURAL--------------------------------");
        System.out.println("\n");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        
        
        
        
        
        
        
        
        
        // Creo otra 
        Set<Coche_Practica5> lista2 = new TreeSet<Coche_Practica5>(new OrdenAlternativoCilindrada());

        lista2.add(c1);
        lista2.add(c2);
        lista2.add(c3);
        lista2.add(c4);
        lista2.add(c5);
        
        Iterator it1 = lista2.iterator();
        System.out.println("------------------ORDEN ALTERNATIVO POR CILINDRADA-----------------------------");
        System.out.println("\n");
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Set<Coche_Practica5> lista3 = new TreeSet<Coche_Practica5>(
            new Comparator<Coche_Practica5>(){
                    @Override
                    public int compare(Coche_Practica5 o1, Coche_Practica5 o2){
                        int comparaCilindrada = o1.getCilindrada() - o2.getCilindrada();
                        int comparaModelo = o1.getModelo().compareTo(o2.getModelo());
                        return comparaCilindrada + comparaModelo;
        
                    }
            }
        );
        
        lista3.add(c1);
        lista3.add(c2);
        lista3.add(c3);
        lista3.add(c4);
        lista3.add(c5);
        
        Iterator it2 = lista3.iterator();
        
        System.out.println("------------------ORDEN ALTERNATIVO POR MODELO Y CILINDRADA------------------");
        System.out.println("\n");
        
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        
        
        
        
        
    }
    
}
