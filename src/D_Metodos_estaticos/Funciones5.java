/*
Funcion que calcule el maximo comun divisor de dos numeros
mcd = numero mas grande que es capaz de dividir entre ambos
 */
package D_Metodos_estaticos;

import java.util.Scanner;


public class Funciones5 {

    public static void main(String[] args) {
       	Scanner sc = new Scanner(System.in);
		System.out.print("Dime un numero y te dire su MCD: ");
		int a = sc.nextInt();
		System.out.print("Dime otro numero: ");
		int b = sc.nextInt();
		
		System.out.print("El MCD es: "+maximoComunDivisor(a,b));
		
	}
	
	public static int maximoComunDivisor (int a1, int a2){
		int divisor;

		if(a1>a2)
			divisor = a1;
		else
			divisor = a2;

		while (a1%divisor !=0 || a2%divisor != 0 && divisor>1)
			divisor--;
		return divisor;

	}
    }
