// Practica bucle2. Leer un número e indicar si es positivo o negativo. EL proceso se repetira hasta que se introduzca un 0.

package C_Bucles;
import java.util.Scanner;

public class Bucle2{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número y te indicare si es positivo o negativo :) ");
		int numero = sc.nextInt();

		while(numero!=0){
			
			if(numero>0){
			System.out.println( +numero +" Es positivo!");
			System.out.println("Introduce otro número");
			numero = sc.nextInt();
			}

			else if(numero<0){
				System.out.println( +numero +" Es negativo!");
				System.out.println("Introduce otro número");
				numero = sc.nextInt();
			}
			

			

		}

	}

}