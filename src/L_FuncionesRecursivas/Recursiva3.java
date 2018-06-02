/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_FuncionesRecursivas;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Recursiva3 {

        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num=sc.nextInt();
        int suma=suma(num);
        System.out.println(suma);
    }
    
    public static int suma(int num){
       if(num>0){
        if(num%3==0){
           return num + suma(num-1);
        }
        else{
           return suma(num-1);
        }
       }
       return 0;
    }
}
   