/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M_Ficheros;

/**
 *
 * @author alumno
 */
public class Ej2_Buffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LeerEscribirBuffer accediendo = new LeerEscribirBuffer();
        
        accediendo.lee("prueba1.txt");
        
        accediendo.escribe("prueba4.txt");
        
        accediendo.escribe2("prueba5.txt");
        
        
        
    }
    
}
