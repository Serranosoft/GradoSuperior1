/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.Practicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Gasolinera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;

        // Creamos 2 listas de tipo ArrayList con los valores de las clases Surtidor y Deposito
        List<Surtidor> surtidores = new ArrayList();
        List<Deposito> depositos = new ArrayList();
        // Llamo a la función configurar y le paso por parámetro las 2 listas y el Scanner

        Configurar(surtidores, sc, depositos);

        // Con un bucle mostramos el menu
        while (true) {
            System.out.println(menu());
            System.out.println(" Selecciona opcion --->");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    repostar(surtidores, depositos, sc);
                    break;
                case 2:
                    estadoDepositos(depositos);
                    break;
                case 3:
                    estadoSurtidores(surtidores);
                    break;
                case 4:
                    rellenarDeposito(depositos, sc);
                    break;
                case 5:
                    Cerrar(surtidores);
                    return;
            }
        }
    }

    public static void Cerrar(List<Surtidor> surtidores) {
        // Declaramos ganancias totales y litros totales para almacenar en ellos la recaudacion y los litros vendidos.
        double gananciasT = 0;
        int litrosT = 0;
        // Con un foreach le meto los valores de la lista 
        for (Surtidor surtidor : surtidores) {
            gananciasT += surtidor.getRecaudacion();
            litrosT += surtidor.getLitrosVendidos();
        }
        // Saco por pantalla los resultados
        System.out.println("Informe de ganancias\n");
        System.out.println("Ganancias totales: " + gananciasT);
        System.out.println("Litros vendidos: " + litrosT);
    }

    private static void Configurar(List<Surtidor> surtidores, Scanner sc, List<Deposito> depositos) {

        // Declaro las variables s1 y d1 los cuales seran los nombres de los diferentes surtidores.
        Surtidor s1;
        double precio;
        Deposito d1;
        int num;
        // Con un bucle creamos 5 surtidores y generamos un numero aleatorio y lo usamos para crearlos aleatoriamente.
        for (int i = 0; i < 5; i++) {
            num = (int) (Math.random() * 3) + 1;
            switch (num) {
                case 1:
                    s1 = new SurSuper(1, 0);
                    surtidores.add(s1);
                    break;
                case 2:
                    s1 = new SurSinPlomo(2, 1);
                    surtidores.add(s1);
                    break;
                default:
                    s1 = new SurGasoil(3, 2);
                    surtidores.add(s1);
                    break;
            }
        }
        // Pedimos el precio de los depositos y creamos los objetos
        System.out.println("Introduce el precio para el deposito 1 (Super)");
        precio = sc.nextDouble();
        d1 = new DepGSuper(20000, precio);
        depositos.add(d1);
        System.out.println("Introduce el precio para el deposito 2 (Sin Plomo)");
        precio = sc.nextDouble();
        d1 = new DepSinPlomo(20000, precio);
        depositos.add(d1);
        System.out.println("Introduce el precio para el deposito 3 (Gasoil)");
        precio = sc.nextDouble();
        d1 = new DepGasoil(20000, precio);
        depositos.add(d1);
    }

    // Creamos una función que retorna el menu
    private static String menu() {
        return "------------------------------------\n"
                + "1.- REPOSTAR EN UN SURTIDOR\n"
                + "2.- VER ESTADO DE LOS DEPOSITOS\n"
                + "3.- VER ESTADO DE LOS SURTIDORES\n"
                + "4.- RELLENAR LOS DEPOSITOS\n"
                + "5.- SALIR\n"
                + "------------------------------------\n";
                
    }

    // Creamos una función repostar
    private static void repostar(List<Surtidor> surtidores, List<Deposito> depositos, Scanner sc) {
        int cont = 1;
        // Con un bucle foreach metemos en el objeto surtidor todos los objetos de surtidores y sacamos por pantalla
        // con una enumeración mostramos todos los objetos
        for (Surtidor surtidor : surtidores) {
            System.out.print(cont + ". ");
            System.out.println(surtidor.mostrar());
            cont++;
        }
        // Seleccionamos el surtidor a repostar
        System.out.println("\nSelecciona surtidor");
        // opcion elegida -1 ya que el contador comienza en 1 y las posiciones del array empiezan en 0
        int surop = sc.nextInt() - 1;
        // Seleccionamos la forma de repostar
        System.out.println("Selecciona la forma de repostar\n"
                + "1. Por importe\n"
                + "2. Por litros\n");
        int op = sc.nextInt();
        // Creamos 2 objetos
        // Creamos sur es igual a la opción escogida que se refiere a uno de los surtidores que están almacenados en surtidores
        
        Surtidor sur = surtidores.get(surop);
        Deposito dep = depositos.get(sur.getRefDeposito());
        // Con un switch creamos los 2 cases para diferenciar por importe y por litros
        switch (op) {
            case 1: {
                // Declaro litros como el importe partido del precio de cada deposito
                System.out.print("Importe a introducir: ");
                double importe = sc.nextInt();
                int litros = (int) (importe / dep.getPrecio());

                surtidores.get(surop).vender(importe, dep.getPrecio());
                
                
                System.out.println("Vas a repostar " + litros + " litros.");
                // Nos devuelve un deposito y le damos el valor a litros los litros que tenia anteriormente menos los litros que se han gastado (repostado).
                depositos.get(surop).setLitros(dep.getLitros() - litros);
                break;
            }
            case 2: {
                
                // Pido el valor de litros
                System.out.print("Litros a introducir: ");
                int litros = sc.nextInt();
                // Obtengo un objeto a través del get y llamo al método vender pasandole los valores litros y el valor del precio del deposito
                surtidores.get(surop).vender(litros, dep.getPrecio());

                System.out.println("Vas a repostar " + litros + " litros");
                depositos.get(surop).setLitros(dep.getLitros() - litros);
            }
        }
    }

    private static void estadoDepositos(List<Deposito> depositos) {
        
        // Con un foreach muestro los datos a través del método mostrarEstado()
        int cont = 1;
        for (Deposito deposito : depositos) {
            System.out.print("Deposito " + cont + " --> ");
            System.out.println(deposito.mostrarEstado());
            cont++;

        }
    }

    private static void estadoSurtidores(List<Surtidor> surtidores) {
        
        // Con un foreach muestro los datos a través del método mostrar
        int cont = 1;
        for (Surtidor surtidor : surtidores) {
            System.out.print("Surtidor " + cont + " --> ");
            System.out.println(surtidor.mostrar());
            cont++;

        }
    }

    private static void rellenarDeposito(List<Deposito> depositos, Scanner sc) {
        int op;
        while (true) {
            System.out.println("1. Super");
            System.out.println("2. Sin Plomo");
            System.out.println("3. Gasoil");
            System.out.println("4. Salir");
            op = sc.nextInt();
            switch (op) {
                //Le damos 20000 litros a los depositos que elija
                case 1:
                    depositos.get(0).setLitros(20000);
                    System.out.println("Deposito de super rellenado");
                    break;
                case 2:
                    depositos.get(1).setLitros(20000);
                    System.out.println("Deposito Sin Plomo rellenado");
                    break;
                case 3:
                    depositos.get(2).setLitros(20000);
                    System.out.println("Deposito de gasoil rellenado");
                    break;
                case 4:
                    return;
            }
        }

    }

}
