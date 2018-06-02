/*
recursica. funcion pide por teclado un numero, suma desde 1 a n, solo si son divisibles por 3
 */
package L_FuncionesRecursivas;
import java.util.Scanner;
/**
 *
 * @author miguelbepr
 */
public class Recursiva1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=20;
        int suma=suma(num);
        System.out.println(suma);
        
    }
    
    public static int suma(int num){
        if(num>0){
            return num+suma(num-1);
        }
        return num;
    }
}