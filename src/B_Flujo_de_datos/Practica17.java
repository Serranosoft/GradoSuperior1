// Pedir por teclado un valor entero de 1 a 12, correspondiente a un mes del año, 
// de manera que muestre los días que les corresponda al mes introducido (utilizar la sentencia switch-case)
package B_Flujo_de_datos;
import java.util.Scanner;

public class Practica17{

	public static void main (String[] arg){


		Scanner sc = new Scanner(System.in);


		System.out.println("Dime un mes (1-12): ");
		int mes = sc.nextInt();

		switch(mes){

			case 1:{
				System.out.println("Enero tiene 31 días");
				break;
			}
			
			case 2:{
				System.out.println("Febrero tiene 28 días");
				break;
			}
			
			case 3:{
				System.out.println("Marzo tiene 31 días");
				break;
			}
			
			case 4:{
				System.out.println("Abril tiene 30 días");
				break;
			}
			
			case 5:{
				System.out.println("Mayo tiene 31 días");
				break;
			}
			
			case 6:{
				System.out.println("Junio tiene 30 días");
				break;
			}
			
			case 7:{
				System.out.println("Julio tiene 31 días");
				break;
			}
			
			case 8:{
				System.out.println("Agosto tiene 31 días");
				break;
			}
			
			case 9:{
				System.out.println("Septiembre tiene 30 días");
				break;
			
			}
			case 10:{
				System.out.println("Octubre tiene 31 días");
				break;
			}
			
			case 11:{
				System.out.println("Noviembre tiene 30 días");
				break;
			}
			case 12:{
				System.out.println("Diciembre tiene 31 días");
				break;
			}
		}
	}

}