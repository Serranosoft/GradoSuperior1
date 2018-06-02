/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Arrays;

import java.util.Scanner;

/**
 *
 * @author manuelsesc
 */
public class Bonus2_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] v = new int[10];
        Scanner sc = new Scanner(System.in);
        v[0] = 1;
        v[1] = 2;
        
        int pos, num=0;
        
        System.out.println("Introduce valores de posiciones 0 de a 9 que el valor sea -1");
        
        while (num!=-1){
            try{
                System.out.print("Introduce Numero: ");
                num = sc.nextInt();
            
                System.out.print("Introduce Posición: ");
                pos = sc.nextInt();
                v[pos] = num;
                muestraArray(v);
                
                
            }catch(ArrayIndexOutOfBoundsException e){
                System.err.println("Error de índice");
            }catch(ArithmeticException e){
                System.err.println("Error, valor no valido");
            }catch(Exception e){
                System.err.println("Error, no se pueden introducir letras");
                break;
            }
        }
    }
    
    public static void muestraArray(int[] t) {
           System.out.print("Tabla actualizada: ");
        for(int i=0; i<t.length; i++){
           System.out.printf("%d, ", t[i]);
        }
        System.out.println("");
        
    }
    
}
