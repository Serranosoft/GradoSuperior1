// Hacer que una cadena contenga la secuencia "$3,95" se convierta en número de doble precisión 3,95

package B_Flujo_de_datos;
import java.util.Scanner;




public class Practica15{

	public static void main (String[] arg){


		Scanner sc = new Scanner(System.in);


	

		System.out.println("Dime venga: ");

		String dollar = sc.nextLine();

		double dollardouble = Double.parseDouble(dollar.substring(1));

		System.out.println("Se ha convertido en: " +dollardouble);

	}
}