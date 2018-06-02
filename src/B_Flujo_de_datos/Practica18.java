// Escribe un programa que solicite y lea una distancia en pulgadas. EL programa debe imprimir mediante mensajes 
//diferentes esa distancia en millas ( 1 milla = 1609.34m), en pies (1 pie = 12 pulgadas) y en centimetros (1 pulgada = 2.54 centimetros).
//La distancia que se solicite es real.
package B_Flujo_de_datos;
import java.util.Scanner;

public class Practica18{

	public static void main (String[] arg){


		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un valor (pulgadas): ");
		double pulgadas = sc.nextDouble();

		double centimetros = pulgadas*2.54;
		double pies = pulgadas/12;
		double milla = (centimetros/100) / 1609.34;

		System.out.println("Tu valor en centrimetros es: " +centimetros);
		System.out.println("Tu valor en pies es: " +pies );
		System.out.println("Tu valor en millas es: " +milla );



	}

}

