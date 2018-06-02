/*
Pedir por teclado un número de boletos desde 1 a 10000, y generar los valores de
cada uno de forma aleatoria, generando también el boleto ganador, y mostrando por
teclado si hay algun ganador (veréis lo dificil que es ganar!!!!)
    Funcion generarBoleto
    Funcion compararConBoletoGanador

 */
package D_Metodos_estaticos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Practica_func4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int boletop,boletog=0;
		boolean test=true;
		System.out.print("Dime tu boleto y te dire si te ha tocado algo: ");
		boletop = sc.nextInt();
        
		System.out.println(generarBoleto(boletog));
		
		test = compararConBoletoGanador(boletop,boletog);
		if (test){
			System.out.println ("Has ganado");
		}else{
			System.out.println("Siga jugando, otra vez sera");
		}
	
        
        
	}
	public static int generarBoleto (int boletoganador){
		int unidad1 = (int)(Math.random()*9);
		int unidad2 = (int)(Math.random()*9);
		int unidad3 = (int)(Math.random()*9);
		int unidad4 = (int)(Math.random()*9);
        
		unidad1*=1000;
		unidad2*=100;
		unidad3*=10;
        
        
		boletoganador = unidad1+unidad2+unidad3+unidad4;
        
		return boletoganador;
	}
	public static boolean compararConBoletoGanador(int boleto1, int boleto2){
        
		if(boleto1!=boleto2){
			return false;
		}
		return true;
	}
}
   
