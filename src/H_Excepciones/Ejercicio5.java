/*
Generar un error propio que se genere al introducir números negativos desde teclado.
 */
package H_Excepciones;

import java.util.Scanner;


public class Ejercicio5 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		try{
			System.out.print("Introduce un numero negativo: ");
			int numero = sc.nextInt();
			comprobarnumero(numero);
			
		}catch(ArithmeticException numeronegativo){
			System.out.println("Has introducido un numero positivo");
		}
	}
		
	public static int comprobarnumero(int a)throws ArithmeticException{
		if(a>0){
			throw new ArithmeticException("Has introducido un numero positivo");
		}else{
			return a;
		
		}
	}
    }
