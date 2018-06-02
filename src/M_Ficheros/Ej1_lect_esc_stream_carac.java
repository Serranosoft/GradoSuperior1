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
public class Ej1_lect_esc_stream_carac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LeerEscribirFichero accediendo = new LeerEscribirFichero();
        
        accediendo.lee("archivo.txt");
        
        accediendo.escribe("prueba1.txt");
    }
    
}
