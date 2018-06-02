/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores.Practica5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerc5_Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        Map<String, Float> a = new HashMap<>();

        do {
            System.out.println(menu());
            System.out.println("Introduce una opcion");
            opc = sc.nextInt();

            switch (opc) {

                case 1:
                    introducirProducto(a, sc);
                    break;
                case 2:
                    modificarPrecio(a, sc);
                    break;
                case 3:
                    mostrarProductos(a);
                    break;
                case 4:
                    eliminarProducto(a, sc);
                    break;

            }

        } while (opc < 5);

    }

    private static String menu() {

        String menu = ""
                + "1. Introducir Producto\n"
                + "2. Modificar Precio\n"
                + "3. Mostrar todos los productos\n"
                + "4. Eliminar producto\n"
                + "5. Salir";

        return menu;
    }

    private static void introducirProducto(Map<String, Float> a, Scanner sc) {

        System.out.println("Introduce el codigo");
        sc.nextLine();
        String codigo = sc.nextLine();
        System.out.println("Introduce el precio");
        float precio = sc.nextFloat();

        a.put(codigo, precio);

    }

    private static void modificarPrecio(Map<String, Float> a, Scanner sc) {

        System.out.println("Introduce el código nuevo");
        sc.nextLine();
        String codigo = sc.nextLine();
        System.out.println("Introduce el precio");
        float precio = sc.nextFloat();

        a.put(codigo, precio);

    }

    private static void mostrarProductos(Map<String, Float> a) {

        Iterator<String> it = a.keySet().iterator();
        String codigo = "";

        while (it.hasNext()) {
            codigo = it.next();
            System.out.println(codigo + ": " + a.get(codigo) +"€");
        }

    }

    private static void eliminarProducto(Map<String, Float> a, Scanner sc) {

        System.out.println("Introduce el código para eliminar el producto");
        sc.nextLine();
        String codigo = sc.nextLine();

        a.remove(codigo);

    }

}
