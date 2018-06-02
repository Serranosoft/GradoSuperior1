/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores;

import java.util.Collection;
import java.util.*;

/**
 *
 * @author alumno
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manzana m1 = new Manzana(Calibre.GRANDE);
        Manzana m2 = new Manzana(Calibre.PEQUEÑA);
        Manzana m3 = new Manzana(Calibre.MEDIANA);
        
        Collection<Manzana> lista1 = new java.util.ArrayList<Manzana>();
        List<Manzana> lista2 = new java.util.ArrayList<Manzana>();
        java.util.ArrayList<Manzana> lista3 = new java.util.ArrayList<Manzana>();
        
        lista2.add(m1);
        lista2.add(m2);
        lista2.add(m3);
        
        //foreach
        for (Manzana manzanas : lista1) {
            System.out.println(manzanas.getTamaño());
        }
        
        ListIterator l1 = lista2.listIterator();
        
        while(l1.hasNext()){
            System.out.println(l1.next());
        }
        
        lista2.clear();
        
        try{
            
            while(l1.hasPrevious()) {
                System.out.println(l1.previous());
            }
        }catch (Exception e){
            
            System.err.println("El clear elimina el array");
        }
        
        Manzana[] miLista = {m1, m2, m3};
        
        List<Manzana> lista4 = new java.util.ArrayList(Arrays.asList(miLista));
    }
    
}
