// PRACTICA 5
/* Ejemplos de Sentencias de flujo del programa
*/

package A_Mostrar_por_pantalla;

/**
 *
 * @author alumno
 */

public class Practica5{	// Esto es una clase

	// Metodo principal
	public static void main(String args[]){
		int x = 2;
		int y = 3;
		boolean b = false;

		// Sentencia condicional
		if (x<5){
			System.out.println("x es menor que 5");

		}

		if (x>5){
			System.out.println("x es mayor que 5");

		}

		if (x<5 && y<=3){
			System.out.println("x e y correctos!");
		}
		//--------------------------------------------
		if (x>=3 || y>5) {
			System.out.println("Otros x e y correctos!");
		}

		else{
			System.out.println("x e y no en rango!");
		}
		//----------------------------------------------
		if (x>2 && x<=5){
			System.out.println("rango1!");
		}
		else if (x>5 && x<=10) {
			System.out.println("rango2!");
		}
		else if (x>10 && x<=15) {
			System.out.println("rango3!");
		}
		else if (x>15 && x<=20) {
			System.out.println("rango4!");
		}
		else{
			System.out.println("rango5!");
		}

		x=2;
		if ((!b && x==2) || x>3){
			System.out.println("b=false y x=2 ooo x mayor que 3!");
		}


		//Sentencia iterativa
		x=0;
		while (x<=10){
			System.out.println(x);
			x++;
		}

		x=0;
		do{
			System.out.println("do-while: " + x);
			x++;
		}while(x<10);

		for (int i=0; i<10; i++){
			System.out.println("for: " + i);
		}

	}

}