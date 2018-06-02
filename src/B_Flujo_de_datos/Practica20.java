// Introduce por teclado tu nombre y apellidos y que los saque por separado (utilizar index0f)

package B_Flujo_de_datos;
import java.util.Scanner;

public class Practica20{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

			System.out.println("Dime tu nombre y tus apellidos: ");
			String nombre = sc.nextLine();
			

			int nombre2 = nombre.indexOf("Manuel");



			System.out.println("Tu nombre es: " +nombre.substring(nombre2));


	}
}