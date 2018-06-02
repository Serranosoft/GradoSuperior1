/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Metodos_estaticos;

import java.util.Scanner;


public class Funciones2 {


    public static void main(String[] args) {
       
	
	String nmb, apell, direc, ed, cur;
	
	
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <=2;i++){
			
			System.out.print ("Dime tu nombre: ");
			nmb = sc.nextLine();
			System.out.print ("Dime tus apellidos: ");
			apell = sc.nextLine();
			System.out.print ("Dime tu direccion: ");
			direc = sc.nextLine();
			System.out.print ("Dime tu edad: ");
			ed = sc.nextLine();
			System.out.print ("Dime tu curso: ");
			cur = sc.nextLine();
			
			boolean res = fichar(nmb, apell, direc, ed, cur);
			if(res){
				System.out.println ("Fichado");
			}else{
				System.out.println ("Error al guardar");
		}
		System.out.print("Fichado: " +fichar("Manuel", "Serrano Scholz", "Puerto Real", "20", "1DAM"));
		
		}
	}
	
	
	public static boolean fichar (String nombre, String apellidos, String direccion, String edad, String curso){
		
		if (nombre.equals ("") || apellidos.equals("") || direccion.equals ("") || edad.equals ("") || curso.equals ("")){
		return false;
		}
		System.out.println ("--------FICHA--------");
		System.out.println ("Nombre: "+nombre);
		System.out.println ("Apellidos: "+apellidos);
		System.out.println ("Direccion: "+direccion);
		System.out.println ("Edad: "+edad);
		System.out.println ("Curso: "+curso);
		
		return true;
		
	}
}  
    

