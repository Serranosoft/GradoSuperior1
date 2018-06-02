/*
Genera una excepciona al introducir una letra o palabra en una variable de tipo entero, lance un error en una función y 
lo que recoja el main muestre el error
 */
package H_Excepciones;

import java.util.Scanner;


public class Ejercicio4 {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		

		try{
			System.out.print("Introduce un numero: ");
			int numero = sc.nextInt();
		}catch(Exception letra){
			System.out.println("Has introducido una letra "+letra.toString());
		}

	}
    }
