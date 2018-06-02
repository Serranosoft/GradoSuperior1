/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author alumno
 */
public class Ejerc2_LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Estudiante> lista = new LinkedList<>();
        
        Estudiante e1 = new Estudiante("Manuel", 80);
        Estudiante e2 = new Estudiante("Sergio", 50);
        Estudiante e3 = new Estudiante("Ernesto", 60);
        Estudiante e4 = new Estudiante("Lauren", 90);

        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);
        
        ListIterator<Estudiante> l1 = lista.listIterator();
        
        while(l1.hasNext()){
            Estudiante e = l1.next();
            System.out.println(e.getNombre()); //Esto muestra tan solo el nombre
            //System.out.println(l1.next()); Esto lo muestra todo
            
        }
    }
    
}
