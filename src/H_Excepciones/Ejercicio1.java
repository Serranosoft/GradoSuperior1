/*
Genere un objeto de la clase Exception dentro de un bloque try.
Proporcione al constructor Exception un argumento String.
Capture la excepción dentro de la cláusula catch e imprima el argumento.
Añade la cláusula finnaly e imprime un mensaje para demostrar lo que ha pasado.
 */
package H_Excepciones;

import java.util.Scanner;


public class Ejercicio1 {

  
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

		try{
                    System.out.println("2/0" +2/0);
                    //throw Exception("Se ha producido una excepcion");

		}catch(Exception e){
                    System.out.println("Se ha producido la excepcion "+e.toString());

		}finally{
                    System.out.println("Esto se ejecuta siempre");
		} 
    }
    
}
