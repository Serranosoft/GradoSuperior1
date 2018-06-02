/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores.Practica5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerc2_Practica5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaro un ArrayList con los valores de la clase "Ejerc2_Class_Practica5"

        List<Ejerc2_Class_Practica5> muebles = new ArrayList<Ejerc2_Class_Practica5>();
        int opcion = 0;

        // Creo un bucle donde inserto el menu con todas las opciones
        do {
            System.out.println(menu());
            System.out.println("Inserta una opción");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    insertarMobiliario(muebles, sc);
                    break;
                case 2:
                    eliminarMobiliario(muebles, sc);
                    break;
                case 3:
                    mostrarMobiliario(muebles, sc);
                    break;
            }
        } while (opcion < 4);

    }

    // Creo el menu
    private static String menu() {

        String menu = ""
                + "1. Insertar Mobiliario\n"
                + "2. Eliminar Elemento y Mostrar\n"
                + "3. Mostrar mobiliario\n"
                + "4. Salir";

        return menu;
    }

    private static void insertarMobiliario(List<Ejerc2_Class_Practica5> muebles, Scanner sc) {
        // Pido por teclado todos los valores y creo un objeto con los valores introducir y los inserto en la lista
        System.out.println("Introduce el nombre del mueble");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println("Introduce el precio del mueble");
        double precio = sc.nextDouble();
        System.out.println("Introduce la marca del mueble");
        sc.nextLine();
        String marca = sc.nextLine();
        // Creo el objeto con las propiedades introducidas anteriormente.
        Ejerc2_Class_Practica5 mueble1 = new Ejerc2_Class_Practica5(nombre, precio, marca);
        // Lo agrego a la lista
        muebles.add(mueble1);
    }

    private static void eliminarMobiliario(List<Ejerc2_Class_Practica5> muebles, Scanner sc) {
        // Recorremos la lista para mostrarlo por pantalla
        for (Ejerc2_Class_Practica5 mueble1 : muebles) {
            System.out.println(mueble1);

        }
        //Con un foreach recorro la lista y si se cumple la condición elimino el objeto de la lista.
        System.out.println("Que elemento quiere eliminar?");
        sc.nextLine();
        String nombre = sc.nextLine();
        for (Ejerc2_Class_Practica5 mueble1 : muebles) {
            if (mueble1.getNombre().equals(nombre)) {
                muebles.remove(mueble1);
                break;
            }

        }
    }

    private static void mostrarMobiliario(List<Ejerc2_Class_Practica5> muebles, Scanner sc) {
        System.out.println("Quiere visualizar el mobiliario de forma ascendente o descendente?");
        sc.nextLine();
        String opc = sc.nextLine();
        // Declaro un listIterator para recorrer la lista
        ListIterator li = muebles.listIterator();
        // Indico con un hasPrevious un puntero hacia atras y muestro el siguiente mostrandolo ascendentemente.
        
        if (opc.equals("ascendente")) {

            while (li.hasPrevious()) {
               
               
            }
            while (li.hasNext()) {
                System.out.println(li.next());

            }
        // Indico con un hasNext como un puntero hacia delante y muestro el anterior mostrandolo descendentemente.
        
        } else if (opc.equals("descendente")) {
            
            while (li.hasNext()) {
                // Con esto hago que se recorra como si fuese un puntero, para mostrarme el siguiente
                Ejerc2_Class_Practica5 p = (Ejerc2_Class_Practica5) li.next();
            }
            while (li.hasPrevious()) {
                System.out.println(li.previous());
            }
            

            
        }

    }

}
