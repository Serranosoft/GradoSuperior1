package E_Entrada_por_Terminal;
import java.util.Scanner;

public class PracticaTerminal1{


	public static void main(String[] args){

		int suma = 0;
		int producto = 1;
		int contador = 0;
		int indice = args.length;
		while(contador<indice){
			suma += Integer.parseInt(args[contador]); //Hace la conversión de cadena a un número entero para poder realizar la suma y saca los argumentos de contador.
			producto *= Integer.parseInt(args[contador]);
			contador++;

		}

		System.out.println("La suma es: " +suma);
		System.out.println("El producto es: " +producto);

	}
}