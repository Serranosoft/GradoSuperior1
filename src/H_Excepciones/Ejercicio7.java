/*
Genera una excepción al convertir un caracter a entero (ArithmeticException) que se lance desde un try catch del main y que
se recoja en el mismo main
 */
package H_Excepciones;

import java.util.Scanner;


public class Ejercicio7 {

    
    public static void main(String[] args) {
        
        	Scanner sc = new Scanner(System.in);
		
		try{
			System.out.print("Introduce una caracter: ");
			String caracter = sc.nextLine();
			comprobar(caracter);
            
		}catch(NumberFormatException cambio){
			System.out.println("No se puede convertir a int");
		}
	}

	public static boolean comprobar (String prueba)throws NumberFormatException{
		
		try {
			Integer.parseInt(prueba);
			return true;
		}catch (NumberFormatException nfe){
			throw new NumberFormatException("Argumentos no validos, intentalo mas tarde");
		}
	}
    }
   
