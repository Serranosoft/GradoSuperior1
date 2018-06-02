/*
Funcion que muestre un numero insertado por teclado en binario

 */
package D_Metodos_estaticos;

import java.util.Scanner;


public class Funciones8 {

    public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		
		System.out.print ("Indica el numero a convertir a binario: ");
		int n = sc.nextInt();
		System.out.print ("El numero en binario es: "+binario(n));
		
	}
	
	public static long binario (int b10){
	
	String b = "";
		while(b10 != 0){
			int r = (int)(b10%2);
			b = r + b;
			b10 /= 2;
		
		}
	return Long.parseLong(b);
	}
}
