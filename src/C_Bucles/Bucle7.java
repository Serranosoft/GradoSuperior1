// Bucle 7. Pedir un número N y mostrar todos los números del 1 al N (while)

package C_Bucles;
import java.util.Scanner;

public class Bucle7{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número");
		int n = sc.nextInt();
		int contador = 0;
		while(contador<n){
			contador++;
			System.out.println(contador);


		}

	}

}		

