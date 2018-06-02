/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M_Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class LeerEscribirFichero {

    /**
     * @param args the command line arguments
     */
    public void lee(String archivo){
        
        String ruta = "/home/alumno/NetBeansProjects/Practicas Java/src/M_Ficheros/";
        
        try{
            FileReader entrada = new FileReader(ruta + "archivo.txt");
            
            int c = 0;
            char letra;
            
            while(c!=-1){
                c = entrada.read();
                letra = (char) c;
                
                if(c!=-1){
                    
                    System.out.print(letra);
                    
                }
                
            }
            
            
        } catch (FileNotFoundException ex){
            System.err.println("Archivo no encontrado");
        } catch (IOException e){
            System.err.println("Imposible leer el archivo");
        }
    }
    
    public void escribe (String nombreArchivo){
        String frase = "\nEsto es una prueba de escritura \n";
        
        String ruta = "/home/alumno/NetBeansProjects/Practicas Java/src/M_Ficheros/";

        
        
        try {
            
            // Para escribir en el archivo debe de existir previamente
            FileWriter escritura = new FileWriter (ruta + nombreArchivo);
            
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
                
            }
            System.out.println("Fichero escrito correctamente");
            escritura.close();
            
        } catch (IOException ex) {
            Logger.getLogger(LeerEscribirFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
