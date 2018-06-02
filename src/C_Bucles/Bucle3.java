// PRACTICA BUCLE3. Leer número hasta que se introduzca un 0. Para cada uno indicar si es par o impar. (while)


package C_Bucles;
import java.util.Scanner;

public class Bucle3{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);


		System.out.println("Introduce un número y te indicare si es par o impar :) ");

		int numero=sc.nextInt();

		

		while (numero!=0){

			if(numero%2==0){
			System.out.println("El numero " +numero +" es par");
			}
			
			else {

			System.out.println("El numero " +numero +" es impar");
			
			}
			System.out.println("Introduce otro numero");
			numero = sc.nextInt();

		}

	}
}
