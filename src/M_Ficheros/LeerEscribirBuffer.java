/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M_Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class LeerEscribirBuffer {

    private static final String ruta = "/home/alumno/NetBeansProjects/Practicas Java/src/M_Ficheros/";

    public void lee(String ruta) {
        String linea = "";
        try {

            FileReader entrada = new FileReader(ruta);
            // Memoria intermedia
            BufferedReader br = new BufferedReader(entrada);

            // Lee mientras no encuentre un salto de linea o un retorno de
            while (linea != null) {
                linea = br.readLine();

                if (linea != null) {
                    System.out.println(linea);
                }

            }

            br.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");

        } catch (IOException ex) {
            System.out.println("Imposible leer el archivo");
        }

    }

    public void escribe(String nombreArchivo) {

        List<String> lineas = new ArrayList<>();

        lineas.add("Esto es la linea 1");
        lineas.add("Esto es la linea 2");
        lineas.add("Esto es la linea 3");
        lineas.add("Esto es la linea 4");
        lineas.add("Esto es la linea 5");

        try {

            FileWriter escritura = new FileWriter(ruta + nombreArchivo);

            BufferedWriter bw = new BufferedWriter(escritura);

            for (String ln : lineas) {
                System.out.println(ln);
                bw.write(ln);
                bw.newLine(); //Hace un salto de linea
            }

            System.out.println("Fichero escrito correctamente");

            bw.close();

        } catch (IOException ex) {
            System.out.println("Error al escribir en el fichero");
        }
    }

    public void escribe2(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter pw = new PrintWriter(ruta + archivo);

            pw.printf("Numero: %d", 2);
            pw.close();
            System.out.println("escribe 2 ha escrito correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (Exception e) {
            System.out.println("No se puede escribir en el archivo");
        }
    }

}
