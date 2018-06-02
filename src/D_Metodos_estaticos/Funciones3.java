/*
Funcion a la que se le pasan dos enteros y muestra todos los numeros comprendidos entre ellos
 */
package D_Metodos_estaticos;

import java.util.Scanner;


public class Funciones3 {

    
    public static void main(String[] args) {
        
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Dime dos numeros y sacare los comprendidos entre ellos: ");
		int numeroa = sc.nextInt();
		int numerob = sc.nextInt();
		
		System.out.println(comprender(numeroa, numerob));
		
	}
	public static int comprender(int a, int b){
		
		for (a=a;a<=b;a++){
			System.out.println(a);
		}
	return a;
	}
}
