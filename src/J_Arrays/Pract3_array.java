/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Arrays;

import java.util.Scanner;

public class Pract3_array {

  
    public static void main(String[] args) {
      
        
        int a[] = new int[10];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<9;i++){
            
            System.out.println("Introduce números please porfavor: ");
            a[i] = sc.nextInt();
            
        }
        
        System.out.printf("Lós numeros son: ");
        for(int i=0;i<5;i++){
            System.out.printf("%d,%d ", a[i], a[9-i]);
            
        }
        System.out.println("");
        
        
        
        
    }
    
}