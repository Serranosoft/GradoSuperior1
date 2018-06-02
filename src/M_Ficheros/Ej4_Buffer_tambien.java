/*
Realizar un programa en el que muestres un menuq ue te permita:
    1. Crear un fichero de texto(con el nombre que tu quieras)
       en el que indiques en cada linea: tu nombre, apellidos, ciudad de nacimiento
    2. Mostrar por pantalla el contenido del fichero de texto creado.
    3. Salir.
 */
package M_Ficheros;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej4_Buffer_tambien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta = "/home/alumno/NetBeansProjects/Practicas Java/src/M_Ficheros/";
        int op=0;
        
        do{
            System.out.println(menu());
            System.out.println("Elige una opcion");
            op = sc.nextInt();
            
            switch(op){
                case 1: 
                    crearFichero(sc, ruta);
                    break;
                case 2:
                    mostrarFichero(ruta);
                    break;
                
                            
            }
        }while(op!=3);
        
        
        
    }

    private static String menu() {
        String menu = "\n"
                +"1. Crear Fichero\n"
                +"2. Mostrar Fichero\n"
                +"3. Salir";
        return menu;
    }
    
    private static void crearFichero(Scanner sc, String ruta) {
        
        try {
            FileWriter fw = new FileWriter(ruta + "prueba6_Buffer_Tambien.txt", true);
            
            PrintWriter pw = new PrintWriter(fw);
            
            escribirFichero(pw, sc);
            
            fw.close();
            
        } catch (IOException e) {
            System.err.println("No se puede leer el archivo!");
        }
        
        
        
    }
    

    private static void escribirFichero(PrintWriter pw, Scanner sc) {
        System.out.println("Introduce Nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        
        System.out.println("Introduce tus Apellidos: ");
        String apell = sc.nextLine();
        
        System.out.println("Introduce tu Ciudad: ");
        String ciudad = sc.nextLine();
        
        pw.printf("Persona: %s, %s --> %s %n", apell, nombre, ciudad);
        
    }
    
    private static void mostrarFichero(String ruta){
        try{
            FileReader fr = new FileReader(ruta + "prueba6_Buffer_Tambien.txt");
            BufferedReader br = new BufferedReader(fr);
            leerFichero(br);
            fr.close();
        }catch(IOException e){
            System.err.println("No se puede leer en el archivo!");
        }
    }

    private static void leerFichero(BufferedReader br) throws IOException {
        String linea;
        do{
            linea = br.readLine();
            System.out.println(linea);
            
        }while(linea != null);
    }

    
}
