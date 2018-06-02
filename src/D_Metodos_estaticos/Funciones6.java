/*
Funcion que calcule el manimo comun multiplo de dos numeros.
mcm = numero mas pqueño que es capaz de multiplicar entre ambos
 */
package D_Metodos_estaticos;

import java.util.Scanner;


public class Funciones6 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Dime un numero y te dire su mcm: ");
		int a = sc.nextInt();
		System.out.print("Dime otro numero: ");
		int b = sc.nextInt();
		
		System.out.print("El mcm es: "+minimoComunMultiplo(a,b));
			
	}
	
	public static int minimoComunMultiplo (int a1, int a2){
		
		int multiplo;
         
		if (a1>a2)
			multiplo=a1;
		else
			multiplo=a2;

		while (multiplo%a1!=0 || multiplo%a2!=0)
			multiplo++;

	return multiplo;
		
	}
}
