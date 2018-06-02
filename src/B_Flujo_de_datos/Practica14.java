// Queremos crear un programa que genere el password para cuentas de usuario. EL password está formado por las iniciales del usuario en minúsculas, es decir,
// conecatenamos la primera inicial del nombre, la del apellido y la del segundo apellido y todo ello se concatena con la edad del usuario //

package B_Flujo_de_datos;
import java.util.Scanner;




public class Practica14{

	public static void main (String[] arg){


		Scanner sc = new Scanner(System.in);

		

		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Dime tu primer apellido: ");
		String apellido1 = sc.nextLine();
		System.out.println("Dime tu segundo apellido: ");
		String apellido2 = sc.nextLine();
		System.out.println("Dime tu edad: ");
		int edad = sc.nextInt();


		String pass;
		pass=nombre.substring(0,2);

		String pass1;
		pass1=apellido1.substring(0,1);

		String pass2;
		pass2=apellido2.substring(0,1);


        System.out.println("Tu contraseña es: " +pass +pass1 +pass2 +edad);

	}
}