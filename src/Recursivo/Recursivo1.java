/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursivo;

/* Realiza una funcion que realice la suma de los 20 primeros numeros de forma recursiva.*/


import java.util.Scanner;

	public class Recursivo1{

		public static void main(String [] arg){

			Scanner sc = new Scanner(System.in);

			int a = 20;
			int suma = sumaRecursiva(a);
			System.out.println(suma);

		}

		public static int sumaRecursiva (int a){

			// Caso base
			if(a==0){
				return 0;
			

			//Caso recursivo
			}else{
				return a + sumaRecursiva(a-1);
			}
		}
	}
