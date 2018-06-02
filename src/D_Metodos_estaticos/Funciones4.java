/*
Funcion que calcule el area o volumen de un cilindro, segun se especifique. Para distinguir un caso de otro se le pasara el caracter 'a'
(para area) o 'v' (para volumen). Hemos de pasarle a la funcion la altura y el radio
Volumen = PI * radio^2 *altura
Area = 2 * PI * altura * 2 * PI *radio^2
 */
package D_Metodos_estaticos;

import java.util.Scanner;


public class Funciones4 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print ("Escribe v para calcular el volumen de un cilindro o a para calcular el area: ");
		String opcion = sc.nextLine();
		
		if (opcion.equals("")==opcion.equals("v")){
			System.out.print("Dime el radio del cilindro: ");
			double radio = sc.nextDouble();
			System.out.print ("Dime la altura del cilindro: ");
			double altura = sc.nextDouble();
			System.out.print(formulas(radio, altura, "v"));
			
		}else{
			if (opcion.equals("")==opcion.equals("a")){
				System.out.print("Dime el radio del cilindro: ");
				double radio = sc.nextDouble();
				System.out.print ("Dime la altura del cilindro: ");
				double altura = sc.nextDouble();
				System.out.print(formulas(radio, altura, "a"));
			}
		}
		
	}
	
	public static double formulas (double radio1, double altura2, String opc){
	
		if(opc=="a"){

			double area = 2*Math.PI*radio1*(radio1+altura2);
			return area;
		}else{

			double volumen = Math.PI*(radio1*radio1)*altura2;
			return volumen;

		}
		

	}
    }
