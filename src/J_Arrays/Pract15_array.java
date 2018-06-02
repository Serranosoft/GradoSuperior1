/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
/*public class Pract15_array {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String [] n = {"Alvaro", "Jesus", "Antonio", "Victor", "Laura", "Manuel", "Adrian", "Santiago", "Ernesto", "Alberto"};
        String [] copia = new String [10];
        char opcion = ' ';
        
        do{
            opcion = menu(sc);
            
            switch(opcion){
                case 'O':
                case 'o':
                    ordenNombre(n)
                    break;
                    
                case 'I':
                case 'i': 
                    ordenInverso(n);
                    break;
                    
                case 'P':
                case 'p':
                    copiaArray(n, copia, sc);
                    break;
                    
                default:
                    break;
                    
                
                    
            }
        }while(opcion != 'e');
    }
    
    public static char menu (Scanner sc){
        String menu = "" + 
        "**********************************************\n"
      + "*    ELIGE UNA OPCION                        *\n"
      + "**********************************************\n"
      + "*      O. ORDENAR POR NOMBRE                 *\n"
      + "*      I. ORDEN INVERSO                      *\n"
      + "*      P. GUARDAR NOMBRES OTRA ARRAY         *\n"
      + "*      E. SALIR                              *\n"          
      + "**********************************************\n";
        System.out.println(menu + "ELEGIR UNA OPCION: ");
        return sc.next().charAt(0);
                
    
    }
    
    public static void ordenNombre(String [] n){
        
        Arrays.sort(n);
        for(String s : n){
            System.out.println(s);
        }
    }
    
    public static void ordenInverso (String [] n){
        Arrays.sort(n, Collections.reverseOrder());
        for (String s : n) {
            System.out.println(s);
            
        }
    }
    
    public static void copiaArray (String [] n, String [] b, Scanner sc){
        System.out.println("Desde que posición quieres copiar: ");
        int indice_desde_origen = sc.nextInt();
        
        System.out.println("");
    }
    
}/**/
