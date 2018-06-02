/* PRACTICA 5
	Imprime en varias lineas los siguientes datos personales:
	Nombre, Apellidos, Fecha de Nacimiento, teléfono, población, dni y 
	Correo electrónico
*/

package B_Flujo_de_datos; 
import java.util.Scanner;

public class PracticaEj2{	// Esto es una clase
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); 

		System.out.print("Cuál es tu nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Cuáles son tus apellidos: ");
		String apellidos = sc.nextLine();
		System.out.print("Cuál es tu fecha de nacimiento: ");
		String nacimiento = sc.nextLine();
		System.out.print("Cuál es tu número de teléfono: ");
		String telefono = sc.nextLine();
		System.out.print("¿De donde eres?: ");
		String poblacion = sc.nextLine();
		System.out.print("Cuál es tu DNI: ");
		String dni = sc.nextLine();
		System.out.print("Cuál es tu correo electrónico: ");
		String correo = sc.nextLine();

		System.out.println("Bienvenido " +nombre +" " +apellidos +" " + "nacistes el año " +nacimiento + " " + "tu teléfono es el " +telefono + " " + "eres de " +poblacion + " " + "tu dni es el " +dni +" " + "y tu correo es el " +correo);



	}
}