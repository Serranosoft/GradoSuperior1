/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M_Ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Ej3_String_bytes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta =  "/home/alumno/NetBeansProjects/Practicas Java/src/M_Ficheros/";
        
        List<Integer> intermedio = new LinkedList<>();
        
        int nBytes = leeFichero(intermedio, ruta+ "imagen1.jpg");
        
        System.out.println("Numero de Bytes" +nBytes);
        
        creaFichero(intermedio, ruta + "imagenCopia1.jpg");
    }

    private static int leeFichero(List<Integer> intermedio, String nombreArchivo) {
        int nBytes = 0;
        
        try {
            
            FileInputStream lectura = new FileInputStream(nombreArchivo);
            boolean final_ar = false;
            
            
            while(!final_ar){
                
                int byteEntrada = lectura.read();
                if(byteEntrada==-1){
                    final_ar = true;
                }else{
                    intermedio.add(byteEntrada);
                }
                
                System.out.println(byteEntrada);
                nBytes++;
                
            }
            lectura.close();
            return nBytes;
            
            
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
            return -1;
        }
        
        
    }

    private static void creaFichero(List<Integer> intermedio, String nombreArchivo) {
        try{
            
            FileOutputStream nuevoArchivo = new FileOutputStream(nombreArchivo);
            
            for(Integer i : intermedio){
                nuevoArchivo.write(i);
            }
            nuevoArchivo.close();
            System.out.println("Copia creada correctamente!");
            
            
        }catch(IOException e){
            System.err.println("inutil");
            
        }
    }
    
}
