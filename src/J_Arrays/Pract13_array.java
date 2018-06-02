/*
PR13_ARRAY. Generar dos vectores de numeros enteros con 10 valores, preguntar la sección del primer valor y el numero
de elementos que queremos copiar en el segundo vector (utilizar la función arraycopy).
 */
package J_Arrays;

import java.util.Scanner;

/**
 *
 * @author manuelsesc
 */
public class Pract13_array {

 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int y [] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        
        
        System.out.println("Desde que posición quieres copiar?");
        int pos = sc.nextInt();
        
        System.out.println("A partir de que posición quieres empezar a sustituir en el destino?");
        int dest = sc.nextInt();
        
        System.out.println("Cuantos caracteres quieres copiar?");
        int cant = sc.nextInt();
        
        System.arraycopy(t, pos, y, dest, cant);
        
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]+" ");
            
            
        }
        System.out.println("");
        for (int j = 0; j < y.length; j++) {
                System.out.print(y[j]+" ");
                
            }
        
        
        
        
    }
    
}
