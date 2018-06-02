/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_FuncionesRecursivas;

/**
 *
 * @author Manuel
 */
public class Recursiva2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=10;
        int mult = mult(num);
        System.out.println(mult);
        
    }
    
    public static int mult(int num){
        if(num>1){ //numero de salida 1, para no multiplicarse por 0 en la ultima vuelta
            return num * mult(num-1);
        }
        return num;
    }
}
