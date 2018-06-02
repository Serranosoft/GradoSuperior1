package C_Bucles;
import java.util.Scanner;

public class Calculadora {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in); 
		int opcion = 0;
		

		do{ 
		System.out.println("┼═════════════════════════════┼");
		System.out.println("║                             ║");
		System.out.println("║   ♥      CALCULADORA   ♥    ║");
		System.out.println("║                             ║");
		System.out.println("┼═════════════════════════════┼");
		System.out.println("║           1.SUMA            ║");
		System.out.println("║           2.RESTA           ║");
		System.out.println("║           3.MULTIPLICACION  ║");
		System.out.println("║           4.DIVISION        ║");
		System.out.println("║           5.MODULO          ║");
		System.out.println("║           6.RAIZ CUADRADA   ║");
		System.out.println("║           7.SALIR           ║");
		System.out.println("┼═════════════════════════════┼");
		System.out.println("║ ◕ ‿‿ ◕    ─═☆☆═─    ◕ ‿‿ ◕  ║");
		System.out.println("┼═════════════════════════════┼");

		System.out.print("\nELIGE OPCIÓN: ");
		opcion = sc.nextInt();
		System.out.print("\n");
	
		
		switch(opcion){
			case 1:{

				System.out.println("Primer número: ");

				double num1 = sc.nextDouble();

				System.out.println("Segundo número: ");

				double num2 = sc.nextDouble();

				double resultado=num1+num2;

				System.out.println("El resultado es " + resultado);
				break;


			}	

			case 2:{
				System.out.println("Primer número: ");
				double num1 = sc.nextDouble();
				System.out.println("Segundo número: ");
				double num2 = sc.nextDouble();
				double resultado=num1-num2;
				System.out.println("El resultado es " + resultado);
				break;
			}

			case 3:{
				System.out.println("Primer número: ");
				double num1 = sc.nextDouble();
				System.out.println("Segundo número: ");
				double num2 = sc.nextDouble();
				double resultado=num1*num2;
				System.out.println("El resultado es " + resultado);
				break;
			}

			case 4:{
				System.out.println("Primer número: ");
				double num1 = sc.nextDouble();
				System.out.println("Segundo número: ");
				double num2 = sc.nextDouble();
				double resultado=num1/num2;
				System.out.println("El resultado es " + resultado);
				break;
			}

			case 5:{
				System.out.println("Primer número: ");
				double num1 = sc.nextDouble();
				System.out.println("Segundo número: ");
				double num2 = sc.nextDouble();
				double resultado=num1%num2;
				System.out.println("El resultado es " + resultado);
				break;
			}

			case 6:{
				System.out.println("Primer número: ");
				double num1 = sc.nextDouble();
				double resultado=Math.sqrt(num1);
				System.out.println("El resultado es " + resultado);
				break;
			}

			default: System.out.println("Fin de programa");
		}


		
		}while(opcion<7);
	}
}
