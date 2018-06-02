/*Practica_func2. Crear una función que sea fichar, que pida el nombre, apellidos
, dirección, edad y curso de 3 alumnos, dos por teclado y uno por programa. */

package D_Metodos_estaticos;


import java.util.Scanner;

public class Practica_func2{
	
	public static void main (String args []){
		
		String texto, texto2= " ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Escribe lo que quieras, puede contener espacios incluso. Le dare la vuelta a todo: ");
		
		texto = sc.nextLine();
		
		System.out.print ("La cadena queda: "+invertida(texto, texto2));
	}
	
	public static String invertida (String cadena, String cadena_invertida){
		
		for(int i = cadena.length()-1; i>=0; i--){
			cadena_invertida +=cadena.charAt(i);
		}
		return cadena_invertida;
			
		
	}
}