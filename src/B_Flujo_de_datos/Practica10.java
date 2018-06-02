// Pedir un nº entre 0 y 9999 y decir cuantas cifras tiene


package B_Flujo_de_datos;
import java.util.Scanner;

public class Practica10{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número entre el 0 y el 9999: ");
		int num1 = sc.nextInt();

		if (num1<10){
			System.out.println("Tiene 1 cifra");

		}

		else if (num1<100){
			System.out.println("Tiene 2 cifras");

		}

		else if (num1<1000){
			System.out.println("Tiene 3 cifras");

		}

		else if (num1<10000){
			System.out.println("Tiene 4 cifras");

		}
	

	}




}