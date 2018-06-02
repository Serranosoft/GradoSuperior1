package I_Contenedores;


import java.util.Arrays;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Ejerc1_arrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.ArrayList<Integer> lista = new java.util.ArrayList<Integer>();
        
        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random()*100)+1);
            
        }
        
        ListIterator l1 = lista.listIterator();
        
        
        while(l1.hasNext()){
            if((int) l1.next() % 7 == 0){
                System.out.println(l1.nextIndex());
                break;
            }
        }
        while(l1.hasPrevious()){
            if ((int) l1.next() % 5 == 0) {
                System.out.println(l1.nextIndex());
                break;
            }
        }
        
        lista.clear();
        
        int[] a1 = new int[30];
        for (int i = 0; i < 30; i++) {
            a1[i] = i;
            
        }
        
        lista = new java.util.ArrayList(Arrays.asList(a1));
        
        
        
        
        
        
        
    }
    
}
