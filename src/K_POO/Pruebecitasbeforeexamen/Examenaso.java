/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_POO.Pruebecitasbeforeexamen;

import java.util.Scanner;
import org.omg.CORBA.BAD_CONTEXT;

/**
 *
 * @author alumno
 */
public class Examenaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        Supermercado mercadona = new Supermercado("mercadona", 12345);

        do {

            System.out.println(menu());
            System.out.println("Elige una opción");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    insertarProd(mercadona, sc);
                    break;
                case 2:
                    comprarProd(mercadona, sc);
                    break;
                case 3:
                    infoSuper(mercadona);
                    break;
                case 4:
                    mercadona = cerrarSuper(mercadona);
                    break;
            }

        } while (opcion < 5);
    }

    private static String menu() {

        String menu = ""
                + "************************\n"
                + "1. Insertar producto    \n"
                + "2. Comprar producto     \n"
                + "3. Info. Super          \n"
                + "4. Cerrar Super         \n"
                + "**************************";

        return menu;
    }

    private static void insertarProd(Supermercado mercadona, Scanner sc) {

        System.out.println("Introduce el nombre del producto");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println("Introduce el precio base del producto");
        double pb = sc.nextDouble();
        System.out.println("Introduce las ganancias que quieres obtener, loco (en porcentaje)");
        double porcentaje = sc.nextDouble();

        double pv = pb + (pb * porcentaje / 100);

        Producto nuevo_producto = new Producto(nombre, pb, pv);

        String prueba = (mercadona.addProd(nuevo_producto) == true) ? "Se ha insertado correctamente" : "Pues no";

        System.out.println(prueba);
    }

    private static void comprarProd(Supermercado mercadona, Scanner sc) {

        System.out.println("Introduce el nombre del producto a comprar");
        sc.nextLine();
        String nombre = sc.nextLine();

        Producto[] lista_productos = mercadona.getProductos();

        for (int i = 0; i < mercadona.getnProd(); i++) {
            /*if (lista_productos[i].getNombre().equals(nombre)) {
                if (mercadona.delProd(i) == true) {

                    System.out.println("Has comprado el producto con exito, loco");

                } else {
                    System.out.println("Pos no lo has comprao");
                }
            } else {
                System.out.println("No existe lokete, escribe bien xd");
            }*/

            String fallodeltiron = (lista_productos[i].getNombre().equals(nombre)) ? (mercadona.delProd(i) == true) ? "Has comprado el producto con exito, loco" : "fallo en la compra" : "No existe lokete, escribe bien xd";
            System.out.println(fallodeltiron);
        }

    }

    private static void infoSuper(Supermercado mercadona) {

        if (mercadona == null) {

            System.err.println("Muy bien miguel.");
        } else {

            double neto = mercadona.getGananciasVentas() - mercadona.getGananciasBase();

            System.out.println("Nombre: " + mercadona.getNombre());
            System.out.println("CIF: " + mercadona.getCif());
            System.out.println("**********LISTA DE PRODUCTOS*************");
            for (int i = 0; i < mercadona.getnProd(); i++) {
                System.out.println(mercadona.getProductos()[i].toString());

            }

            System.out.println("Ganancias base" + mercadona.getGananciasBase());
            System.out.println("Ganancias ventas" + mercadona.getGananciasVentas());
            System.out.println("Ganancias netas" + neto);
        }
    }

    private static Supermercado cerrarSuper(Supermercado mercadona) {

        mercadona.cerrar();

        mercadona = null;

        System.out.println("Sa cerrao");

        return mercadona;

    }

}
