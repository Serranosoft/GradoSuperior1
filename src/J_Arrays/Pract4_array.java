/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Arrays;


public class Pract4_array {

  
    public static void main(String[] args) {
        
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int[] B = {11,12,13,14,15,16,17,18,19,20};
        int[] C = new int[20];
        
        int j = 0;
        for (int i=0; i<10; i++){
            C[j]=A[i];
            C[j+1]=B[i];
            j+=2;
        }
        
        System.out.println("Resultado: ");
        for (int i=0;i<C.length; i++){
            System.out.printf("%d,", C[i]);
            
    }
    System.out.println("");
    
    }
    
}

        
  