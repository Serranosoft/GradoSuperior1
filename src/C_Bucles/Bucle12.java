// Bucle12. Pedir 10 números. Mostrar la media de los negativos, la media de los positivos y la cantidad de ceros.

package C_Bucles;
import java.util.Scanner;

	public class Bucle12{


		public static void main (String[] arg){

			Scanner sc = new Scanner(System.in);

			int cneg = 0;
			int cpos = 0;
			int c0 = 0;
			int positivos = 0;
			int negativos = 0;

			double mediapos;
			double medianeg;


			for (int n = 0; n<=10; n++){ 	// Para n = 0 hasta que n sea mayor o igual que 10 se va incrementando en 1, con esto pedimos 10 números
											
				System.out.println("Dime números ");
				int num = sc.nextInt();


				if(num<0){

					cneg++;
					negativos+=num;

				}else{

					if(num>0){

						positivos+=num;
						cpos++;

					}else{

						c0++;
					}
				}

				

			}

			mediapos = (double) positivos/cpos;
			medianeg = (double) negativos/cneg;





			System.out.println("La media de los números positivos son: " +mediapos);
			System.out.println("La media de los números negativos son: " +medianeg);
			System.out.println(c0);

		}

	}

