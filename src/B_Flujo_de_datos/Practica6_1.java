package B_Flujo_de_datos;

// PRACTICA 6_1
/* Realizar un programa que calcule la variable x de una ecuación de segundo grado.
Modificación de la Practica 6 para leer A,B y C desde teclado
*/


import java.util.Scanner;

/**
 *
 * @author alumno
 */

public class Practica6_1{	// Esto es una clase

	// Metodo principal
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);	// Se declara una sola vez

		System.out.print("Valor de A: ");
		int a=sc.nextInt();		// Lectura del número A

		System.out.print("Valor de B: ");
		int b=sc.nextInt();		// Lectura del número B

		System.out.print("Valor de C: ");
		int c=sc.nextInt();		// Lectura del número C


		a=2;
		b=3;
		c=1;

		double r1 = b*b - 4*a*c;
		double r2 = Math.sqrt(r1);
		double r3 = -b + r2;
		double r4 = -b - r2;
		double r5 = 2*a;

		double final1 = r3/r5;
		double final2 = r4/r5;


		if(r1>=0){
		System.out.println("Resultado de la ecuación: " + final1 + ", " + final2);
		}else{
			System.out.println("Los valores de A,B y C no validos");
		}
	}
}
