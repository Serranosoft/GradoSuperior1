// Escribe un programa que pida dos números reales de tipo doble. Posteriormente, el programa visualizará 
// (siempre que el primer número sea menor o igual que el segundo y además que los 2 numeros esten comprendidos
// entre 4 y 12, ambos inclusive) los numeros con todos sus decimales y la parte entera de cada uno de ellos.
package B_Flujo_de_datos;
import java.util.Scanner;




public class Practica16{

	public static void main (String[] arg){


		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número: ");
		double numero1 = sc.nextDouble();
		System.out.println("Dime otro número: ");
		double numero2 = sc.nextDouble();

		int numero1d = (int)numero1; // esto es para sacar la parte entera del decimal

		double numero1decimal = numero1-numero1d;


		if (numero1<=numero2 && numero1>4 && numero1<12 && numero2>4 && numero2<12){

			System.out.println("Es: " +numero1d + " y " +numero1);
		}
	}
}