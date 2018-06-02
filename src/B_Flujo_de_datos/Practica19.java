// Use el método index0f de la clase String. Devuelve el índice de la primera ocurrencia. Si no existe, devuelve -1.
//Se debe mostrar por ejemplo:

//El nombre Francisco tiene la letra a en la posición 3
//Empieza por la letra F
//Termina por la letra o

package B_Flujo_de_datos;
import java.util.Scanner;

public class Practica19{

	public static void main (String[] arg){

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el caracter a buscar: ");
        char busca = sc.next().charAt(0);

        System.out.println("El nombre " + nombre + " tiene " + nombre.length() + " caracteres. ");
        System.out.println("El nombre " +nombre + " tiene la letra " + busca + " en la posicion " +nombre.indexOf(busca));
        System.out.println("Empieza por " + nombre.substring(0,1));
        System.out.println("Termina por " + nombre.substring(nombre.length()-1));






    }
}
