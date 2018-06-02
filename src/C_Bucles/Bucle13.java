// Bucle13. Escribir el programa que pida el número de terminos n de la serie de Leibnitz: Si n=10 --> 1-1/3+1/5-1/7+1/9 

package C_Bucles;
import java.util.Scanner;

	public class Bucle13{


		public static void main (String[] arg){

			Scanner sc = new Scanner(System.in);

			System.out.println("Dime número: ");
			int n = sc.nextInt();
			double suma = 0;

			for (int i=0; i < n; i++){
 
        	suma = suma + Math.pow(-1, i) * (4.0/ (2.0*i+1));

       		 }

        	System.out.println(suma);
        }
    }

