/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M_Ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author alumno
 */
public class Ej5_Serializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "/home/alumno/NetBeansProjects/Practicas Java/src/M_Ficheros/";
        
        Empleado[] empleados = new Empleado[4];
        
        empleados[0] = new Empleado("Sara", 2500.50);
        empleados[1] = new Empleado("Enrique", 500.12);
        empleados[2] = new Empleado("Ramon", 1000);
        empleados[3] = new Empleado("Lauren", 5000);
        
        guardaEmpleados(empleados, ruta + "empleado.dat");
        
        Empleado[] listaNueva = cargaEmpleados(ruta + "empleado.dat");
                
        for(Empleado e : listaNueva){
            System.out.println(e);
        }
        
                
    }

    private static void guardaEmpleados(Empleado[] empleados, String nombreArchivo) {
        try{
            FileOutputStream salida = new FileOutputStream(nombreArchivo);
            ObjectOutputStream escribiendo = new ObjectOutputStream(salida);
            
            escribiendo.writeObject(empleados);
            escribiendo.close();
            
            System.out.println("Empleados guardados correctamente!");
            
            
        }catch(IOException e) {
            System.err.println("Error al guardar fichero!");
        }
    }

    private static Empleado[] cargaEmpleados(String nombreArchivo) {
        
        try{
            FileInputStream entrada = new FileInputStream(nombreArchivo);
            ObjectInputStream leyendo = new ObjectInputStream(entrada);
            
            Empleado [] listaNueva = (Empleado[]) leyendo.readObject();
            
            
            leyendo.close();
            
            System.out.println(leyendo.readObject());
            
            
            
            System.out.println("Empleados cargados!");
            return listaNueva;
            
        }catch(IOException e){
            System.out.println("Error al cargar fichero!");
        }catch(ClassNotFoundException e){
            System.out.println("Clase no encontrada!");
        }
        return null;
    }
    
}
