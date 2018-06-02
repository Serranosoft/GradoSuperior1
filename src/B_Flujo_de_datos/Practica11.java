// Pedir una nota de 0 a 10 y mostrarla: Insuficiente (0 a 5), Suficiente (5), bien (6), notable (7 o 8), Sobresaliente (9 a 10)


package B_Flujo_de_datos;
import java.util.Scanner;

public class Practica11{

		public static void main (String[] arg){



			Scanner sc = new Scanner(System.in);

				System.out.println("¿Qué nota has sacado? ");
				double num1 = sc.nextDouble();


				if (num1<=5){

					System.out.println("Insuficiente");

				}

				else if (num1<6){

					System.out.println("Suficiente");

				}

				else if (num1<7){

					System.out.println("Bien");
				}

				else if (num1<=8){

					System.out.println("Notable");
				}

				else if (num1<=10){

					System.out.println("Sobresaliente");

				}


		}	





	


}