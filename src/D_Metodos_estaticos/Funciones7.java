/*
Funcion que calcule a^n (pedir por teclado a y n)
 */
package D_Metodos_estaticos;

import java.util.Scanner;


public class Funciones7 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un numero: ");
		int a = sc.nextInt();
		System.out.print ("Dime a que quieres que lo eleve: ");
		int n = sc.nextInt();
		System.out.print(elevado(a,n));	
	}
	
	public static int elevado (int a2, int n2){
		
		int resultado = (int)Math.pow(a2,n2);
		return resultado;	
	}
    }
