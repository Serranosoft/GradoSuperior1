// PRACTICA BUCLE4. Pedir número hasta que se teclee un negativo, y mostrar cuántos números se han introducido. (un contador de los números)
//(while)

package C_Bucles;
import java.util.Scanner;

public class Bucle4{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		int n;
		int contador=0;

		do{
			System.out.println("Dime un numero ");
			n=sc.nextInt();
			contador++;
			}while (n>=0);
		

		if (n<0){

			System.out.println("Has introducido " +contador + " numeros");
		}


		

	}
}