// Pedir el radio de un circulo y calcular su area. A = PI * R² usando Math.PI y Math.pow(r,2)


package B_Flujo_de_datos;

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class Practica8{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in); 


	
		System.out.print("\nDime el radio: ");
		double num1 = sc.nextDouble();
		double resultado = Math.PI*Math.pow(num1,2);
		
		System.out.println("\nEl area del radio es: " +resultado);
		

	}




}

