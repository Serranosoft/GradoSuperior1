	/* PRACTICA 4
Mostrar un ejemplo de cada operador explicado en teoria

*/

package A_Mostrar_por_pantalla;

/**
 *
 * @author alumno
 */

public class Practica4{	// Esto es una clase

	// Metodo principal
	public static void main(String args[]){
		int x = 2;
		int y = 3;
		int z;
		boolean b;
		
		z = x + y;
		System.out.println("x + y = " + z); //0
		z = x * y;
		System.out.println("x * y = " + z + ".");
		z = y % x;
		System.out.println("Resto x % y = " + z);
		y += x;
		System.out.println("y += x " + y); //5
		y -= x;
		System.out.println("y -= x " + y); //3
		y *= x;
		System.out.println("y *= x " + y); //6
		y /= x;
		System.out.println("y /= x " + y); //3
		y %= x;
		System.out.println("y %= x " + y); //1


		// Incrementos
		x = 2;

		x++;
		System.out.println("x++ = " + x); //3

		x--;
		System.out.println("x-- = " + x); //2

		System.out.println("\033[31mUn texto en Rojo");
		System.out.println("\033[32mUn texto en Verde");
		System.out.println("\033[33mUn texto en Amarillo");
		System.out.println("\033[34mUn texto en Azul");

	}
}