// Bucle11. Pedir un número y calcular su factorial (for)

package C_Bucles;
import java.util.Scanner;

public class Bucle11{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		int mult = 1;
		int n;
		

		System.out.println("Introduce números: ");
			n = sc.nextInt();

		for (int contador = n; contador>0; contador-- ){

			mult = mult * n;
		}
		System.out.println("La suma total es de: " +mult);
	}
}