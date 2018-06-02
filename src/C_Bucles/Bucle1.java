// PRACTICA BUCLE1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.


package C_Bucles;
import java.util.Scanner;

public class Bucle1{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		int cuadrado;

		System.out.print("Introduce número: ");

		int numero = sc.nextInt();

		while (numero>=0){

			cuadrado = numero * numero;
			System.out.println("El cuadrado de " +numero + " es " +cuadrado);
			System.out.println("Introduce otro numero ");
			numero = sc.nextInt();


		}
	}
}