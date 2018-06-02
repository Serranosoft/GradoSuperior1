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
public class Recursiva4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num=sc.nextInt();
        int fact = fact(num);
        System.out.println("Factorial: "+fact);
        
    }
    
    public static int fact(int num){
        if(num>0){
            return num * fact(num-1);
        }
        return 1;
    }
}