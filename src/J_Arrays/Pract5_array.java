/*
Leer por teclado 10 números enteros, e indicarnos si los números están ordenador
de forma creciente, decreciente, o desordenados.
 */
package J_Arrays;

import java.util.Scanner;

/**
 *
 * @author manuelsesc
 */
public class Pract5_array {

  
    public static void main(String[] args) {
      
        
        int[] valores = new int [10];
	  Scanner sc = new Scanner(System.in);
		for(byte i = 0;i < valores.length;i++){
			System.out.println("Ingrese un numero : ");
			valores[i] = sc.nextInt();
                             
			
		}
// determinar si está ordenado de forma creciente 
	boolean creciente = true;
	boolean decreciente = true;

	for(byte i = 1; i < valores.length;i++){
			
			for(byte j = 0;j < valores.length - i;j++){
				
if(valores[j] > valores[j  + 1]){
	
	creciente = false; 
}

if(valores[j] < valores[j + 1]){
	
	decreciente = false;
}

			}
			
		}

	if(creciente){
		System.out.println("Los numeros ingresados están ordenados de forma creciente ");
	}		
	
	if(decreciente){
		System.out.println("Los numeros ingresados están ordenados de forma decreciente ");
	}	
		
	if(!(decreciente || creciente)){
		System.out.println("Los numeros ingresados están desordenados ");
	}		
}
    }
    


