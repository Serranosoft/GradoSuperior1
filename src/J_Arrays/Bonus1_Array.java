/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Arrays;

import java.util.Scanner;

/**
 *
 * @author manuelsesc
 */
public class Bonus1_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int[] v = {1,2,3,0,0,0,0,0,0,0};
        
        Scanner sc = new Scanner(System.in);
        
        muestraArray(v);
        
        
        //Insertar un elemento (desplazando el resto)
        // pos=1, num=4 --> |1|2|3|0|0|0|0|
        //                  |1|2|2|3|0|0|0|
        //                  |1|4|2|3|0|0|0|
        
        System.out.println("Inserta valor: ");
        int num = sc.nextInt();
        System.out.println("Inserta posición: ");
        int pos = sc.nextInt();
        
        for(int i=8;i>=pos; i--){
            v[i+1] = v[i];
        }
        v[pos] = num;
        muestraArray(v);
    }

        public static void muestraArray(int[] t) {
           System.out.print("Tabla actualizada: ");
        for(int i=0; i<t.length; i++){
           System.out.printf("%d, ", t[i]);
        }
        System.out.println("");
        
    }
    
}
