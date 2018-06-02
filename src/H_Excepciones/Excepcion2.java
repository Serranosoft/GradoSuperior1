/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Excepciones;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Excepcion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce un numero: ");
       
       try{
           String cadena = sc.nextLine();
           int num = Integer.parseInt(cadena);
           double division = 2.0/num;
           int i = 1;
           while (i<=num){
               division = 2.0/num;
               System.out.println("2 / " +i + " = " + division);
               i++;
           }
           
       }catch(NumberFormatException nfe){
           System.out.println("Error: no se admiten caracteres: " +nfe.toString());
               
       }catch(ArithmeticException ae){
           
           System.out.println("Error: no se puede dividir por cero" +ae.toString());
       }catch(Exception e){
           System.out.println("Error general: " + e.toString());
       }finally{
           System.out.println("fin");
       }
    }
    
}
