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
public class Pract6_array {

    
    public static void main(String[] args) {
        int[] t = new int [10];
        int num, pos;
        int ind = 0;
        
        Scanner sc = new Scanner(System.in);
        
       
        while (ind<10){
            System.out.print("Introduce un numero(distinto de cero): ");
            num = sc.nextInt();
            
            muestraLibre (t);
            
            System.out.print("En que posición desea insertarlo: ");
            pos = sc.nextInt();
        
        if (t[pos]==0){
            t[pos] = num;
            System.out.println("Ok, insertado!");
            ind++;
        }else{
            System.out.println("Error, ocupado!");
        }
       
        }
        
        System.out.println("Todos insertados");
        for (int i=0; i<t.length; i++){
            System.out.printf("t[%d] = %d %n, i, t[i])", i , t[i]);
        }
    }
    
    
    public static void muestraLibre(int[] t){
        System.out.print("Posiciones Libre: ");
        for (int i=0;i<t.length;i++){
            if (t[i]==0){
                System.out.printf("%d, ", i);
            }
        }
        
        System.out.println("");
    }
    
    
}
