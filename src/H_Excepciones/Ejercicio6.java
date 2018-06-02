/*
Programar una funcion llamada 'alumno' al que se le pasen el nombre y apellidos, compuebe que no sean nulos 
y en caso contario lance la excepción (Argumentos no válidos") que capture y muestre el main
 */
package H_Excepciones;

import java.util.Scanner;

public class Ejercicio6 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		try{
			String nombre;
			String apellidos;
			
			
			System.out.print("Dime tu nombre: ");
			nombre=sc.nextLine();
			
			System.out.print("Dime tus apellidos: ");
			apellidos = sc.nextLine();
				
			alumno(nombre,apellidos);
                        
		}catch(Exception validez){
			System.out.print("Argumentos no validos");
		}
		
	}
	public static boolean alumno (String nmb, String apel)throws Exception{
		
		if(nmb.equals("") || apel.equals("")){
			
			throw new Exception("Argumentos no validos, intentalo mas tarde");
			
		}else{
			return true;
		}
		
    }
    
}
