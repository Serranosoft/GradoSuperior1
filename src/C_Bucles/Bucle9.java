// Bucle9. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos. (do-while)

package C_Bucles;
import java.util.Scanner;

public class Bucle9{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		int n;
		int suma = 0;

		do{
			System.out.println("Dime números: ");
			n = sc.nextInt();

			suma += n;

		}while (n!=0);

		System.out.println(suma);

	}
}

