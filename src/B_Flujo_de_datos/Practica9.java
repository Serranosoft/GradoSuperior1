// Pedir dos números y decir si uno es múltiplo de otro. usando el "modulo": % y debe salir 0


package B_Flujo_de_datos;
import java.util.Scanner;

public class Practica9{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);


		System.out.print("Primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Segundo número: ");
		int num2 = sc.nextInt();
		int x = num1 % num2;
		
		if (x==0) {
			System.out.println("El resultado es múltiplo");

		}

		else {
			System.out.println("El resultado no es múltiplo con que esta mal");

		}

	}


}