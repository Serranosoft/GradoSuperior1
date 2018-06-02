// Bucle 8. Escribir todos los números del 100 al 0 de 7 en 7 (while)

package C_Bucles;
import java.util.Scanner;

public class Bucle8{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		int n = 100;
		

		while(n>=0){


			System.out.println(n);

			n -= 7;
		}

	}
}