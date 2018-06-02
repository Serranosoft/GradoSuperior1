package B_Flujo_de_datos;
import java.util.Scanner;

public class PracticaEj1{	// Esto es una clase

	// Metodo principal
	public static void main(String args[]){


// inicialización del teclado
Scanner sc = new Scanner(System.in);

//Pedimos el número
System.out.println("Dime un numero");
int num=sc.nextInt(); //lectura del número

//pedimos el nombre
System.out.println("Ahora dime un nombre");
sc.nextLine();	//Eliminamos lo que pueda haber en el buffer de lectura
String cadena=sc.nextLine();

//mostramos los dos datos leidos
System.out.println("has introducido el número "+num+" y el nombre "+cadena);

	}
}