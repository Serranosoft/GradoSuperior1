/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Arrays;

import java.util.Scanner;

public class Pract1_array {

    
    public static void main(String[] args) {
       
        int t[] = new int[5];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i=0;i<5; i++){
            System.out.println("Introduce un número: ");
            t[i] = sc.nextInt();
 
            
        }
        
        System.out.println("Los numeros son: ");
        for (int i=0;i<5;i++){
            System.out.printf("Numero: %d %n", t[i]);
            
        }
          
    }
    
}
