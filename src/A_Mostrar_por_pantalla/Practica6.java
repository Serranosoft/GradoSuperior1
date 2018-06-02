// PRACTICA 6
/* Ejemplos de Sentencias de flujo del programa
*/

package A_Mostrar_por_pantalla;

/**
 *
 * @author alumno
 */

public class Practica6{	// Esto es una clase

	// Metodo principal
	public static void main(String args[]){
		int a, b, c;


		a=2;
		b=3;
		c=1;

		double r1 = b*b - 4*a*c;
		double r2 = Math.sqrt(r1);
		double r3 = -b + r2;
		double r4 = -b - r2;
		double r5 = 2*a;

		double final1 = r3/r5;
		double final2 = r4/r5;


		if(r1>=0){
		System.out.println("Resultado de la ecuación: " + final1 + ", " + final2);
		}else{
			System.out.println("Los valores de A,B y C no validos");
		}
	}
}
