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
public class Recursiva5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num=sc.nextInt();
        if(num>0){
            int fib=fib(num);
            System.out.println(fib);
        }
        else{
            System.out.println("error");
        }
    }
    
    public static int fib(int num){
        if (num==1 || num==2){
            return 1;
        }
        else{
            return fib(num-1)+fib(num-2);
        }
    }
}
  
