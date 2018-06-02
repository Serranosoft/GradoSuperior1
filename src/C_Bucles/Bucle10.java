// Bucle10. Pedir 15 números y escribir la suma  total (for)

package C_Bucles;
import java.util.Scanner;

public class Bucle10{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		int suma = 0;
		int n;


		for (int contador = 1; contador<=15; contador++ ){
			System.out.println("Introduce números: ");
			n = sc.nextInt();

			suma = suma + n;
		}
		System.out.println("La suma total es de: " +suma);
	}
}
