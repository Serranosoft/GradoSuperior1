// Practica_Func1. Leemos n (que tiene que ser >0) y mostramos todos los impares de desde 1 a n, separados por coma.

package D_Metodos_estaticos;
import java.util.Scanner;

public class Practica_func1{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número");
		int n = sc.nextInt();

		System.out.print("Son: " +impares(n));

	}
	public static int impares (int numero){
		int i = 0;

		if(numero>0 && numero%2==1){
		
		for(i=1;i<=numero;i+=2){
			System.out.print(i +",");
		}

		
	}

	return i;
	}
}
		
	
	

