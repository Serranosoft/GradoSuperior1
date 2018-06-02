// PRACTICA BUCLE5. Realizar un juego para adivinar el número que está pensando el programa. Para ello pedir un número N y luego
//ir pidiendo números indicando "mayor" o "menor" según sea mayor o menor con respecto al número que "piensa" el programa. 
// El proceso termina cuando el usuario acierta

package C_Bucles;
import java.util.Scanner;

public class Bucle5{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		int n = (int)(Math.random() *10);

		System.out.println("Adivina el número que estoy pensando");
		int num = sc.nextInt();

		while(n<=10){
			if(num==n){

			System.out.println("╔═♥ ══════╗ ");
      		System.out.println("  Correcto   ");
			System.out.println("╚══════♥ ═╝ ");

			break;

			}else{

				System.out.println("Has fallado  (◕ ︵ ◕ )  Intentalo de nuevo");
				num = sc.nextInt();
			}

		}
	}

}

