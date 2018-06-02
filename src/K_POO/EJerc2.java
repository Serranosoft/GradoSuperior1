/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_POO;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EJerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(12,1,20.2,30.2);
        
        Scanner sc = new Scanner(System.in);
        
        r1.mostrar();
        
        r1.setAncho (5.22);
        r1.setLargo(2.45);
        r1.setX(8);
        r1.setY(5);
        
        
        
        /**************************************************/
        
        System.out.println(r1.getX());
        System.out.println(r1.getY());
        System.out.println(r1.getAncho());
        System.out.println(r1.getLargo());
        
        r1.mostrar();
        
        
        
        
        
    }
    
}
