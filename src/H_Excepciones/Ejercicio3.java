/*
Genera 100 numeros aleatorios y los divide por su anterior de manera que si el antecesor es cero muestre "Divion Infinita y mas alla"
(generar la funcion que comprueba la division)
 */
package H_Excepciones;

import java.util.Scanner;


public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int a = (int)(Math.random()*100);
		int b=1;
		for(int i=0;i<100;i++){
			System.out.println("Division "+a +" / "+b+" = "+calcular_division(a,b));
			b=a;
			a = (int)(Math.random()*100);
			
			try{
			int prueba = calcular_division(a,b);

			}catch(ArithmeticException DivisionInfinita){
				System.out.println("Division infinita y mas alla"+DivisionInfinita.toString());
			}
		}
	}

	public static int calcular_division(int dividendo, int divisor)throws ArithmeticException{
		int solucion;
		if(divisor==0){
			throw new ArithmeticException();
		}else{
			solucion=dividendo/divisor;
		}
		return solucion;
	}
    }
   
