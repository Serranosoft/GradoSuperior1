/*
Defina una excepción en el que se pida un número de tipo entero, de manera que si se introduce un real saltará la excepción
InputMismatchException y muestra que el número debe ser entero.
*/
package H_Excepciones;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	try{
            System.out.print("Dime un numero entero: ");
            int numero = sc.nextInt();
	}catch(Exception InputMismatchException){
		System.out.println("Debes introducir un numero entero");
	}
    }
    
}
