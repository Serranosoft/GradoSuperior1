// Pedir número reales por teclado, hasta que se teclee 0, y mostrar la suma, el máximo, el mínimo y la media de ellos. (while)

package C_Bucles;
import java.util.Scanner;

public class Bucle6{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		

		
		System.out.println("Dime números");
		int n = sc.nextInt();

		int suma = 0;
		double contador = 1;
		double media = 0;
		int max = 0;
		int min = 9999;


		
		

		while(n!=0){
			suma += n;
			contador++;
			System.out.println("Dime otros números");
			n = sc.nextInt();
			media = suma/contador;

			if (n < min){
				min = n;
			}

			if (n > max){
				max = n;
			}
			

		}

		System.out.println("La suma de los valores es: " +suma);
		System.out.println("La media de los valores es: " +media);
		System.out.println("El máximo de los valores es: " +max);
		System.out.println("El mínimo de los valores es: " +min);
		


	}
}


