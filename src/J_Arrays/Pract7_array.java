/*
PR7_ARRAY. Introducir 5 valores no consecutivos creciente en una tabla de 10 numeros enteros (por codigo),
y pedir 5 valores mas que se insertaran en las posiciones adecuadas, desplazando las demas.

 */
package J_Arrays;

import java.util.Scanner;


public class Pract7_array {
 
   
    public static void main(String[] args) {
        
        int[] t = {2,4,6,8,12,0,0,0,0,0};
        
        int num;
        int ind;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<5;i++){
            System.out.print("Introducir un número: ");
            num = sc.nextInt();

            ind = 0;
            
            while(t[ind]!=0 && t[ind]<num){
                ind++;
                        
            }
            for(int j=8;j>=ind;j--){
                t[j+1] = t[j];
            }
            t[ind] = num;
                    
            muestraArray(t);
           
        }
        
    
    }
    
    public static void muestraArray(int[] t){
        System.out.print("Tabla actualizada: ");
        for (int i=0;i<t.length;i++){
            System.out.printf("%d, ", t[i]);
            
        }
        System.out.println("");
    }
    
}
