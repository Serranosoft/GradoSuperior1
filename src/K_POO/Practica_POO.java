/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_POO;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Practica_POO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op = 0;
        Sorteo Sorteo = new Sorteo();

        do {
            System.out.println(menu());
            System.out.println("Elige una opción");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    celebrarSorteo(Sorteo, sc);
                    break;
                case 2:
                    listarJugadores(Sorteo);
                    break;
                case 3:
                    listarAcertantes(Sorteo);
                    break;
                case 4:
                    infoSorteo(Sorteo);
                    break;
                case 5:
                    cerrarSorteo(Sorteo);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("No has introducido ninguna opción válida");
            }

        } while (op != 6);

    }

    public static String menu() {

        String menu = ""
                + "******************************************\n"
                + "* 1. Celebrar Sorteo                     *\n"
                + "* 2. Listar jugadores y boletos          *\n"
                + "* 3. Acertantes y cuantías               *\n"
                + "* 4. Información del Sorteo              *\n"
                + "* 5. Cerrar Sorteo                       *\n"
                + "* 6. Salir.                              *\n"
                + "********************************************";
        return menu;
    }

    public static void celebrarSorteo(Sorteo Sorteo, Scanner sc) {

        int contador = 1;
        String nombre;
        long boleto;

        System.out.println("Inserta el titulo del sorteo");
        sc.nextLine();
        Sorteo.setTitulo(sc.nextLine());
        System.out.println("Cuantos jugadores van a jugar?");

        int jugadores = sc.nextInt();
        Sorteo.setJugadores(jugadores);

        System.out.println("Introduce el precio del boleto");
        Sorteo.setPrecio_boleto(sc.nextDouble());

        Sorteo.setBoleto_ganador((long) (Math.random() * 99999) + 1);

        Sorteo.addImportes(100.50, 200.10, 300.20, 400.50);

        for (int i = 0; i < jugadores; i++) {

            Sorteo.addJugador(i);

            nombre = "Jugador " + (i + 1);
            boleto = (long) (Math.random() * 99999) + 1;
            Sorteo.setLista_jugadores(nombre, boleto, i);

        }

    }

    public static void listarJugadores(Sorteo Sorteo) {

        for (int i = 0; i < Sorteo.getJugadores(); i++) {

            Sorteo.listarJugadores(i);
        }
    }

    public static void listarAcertantes(Sorteo Sorteo) {

        if (Sorteo.getJugadores() != 0) {

            int[] acertantes = Sorteo.getAcertantes();
            double[] imp = Sorteo.getImportes();

            System.out.println(acertantes[0] + " persona/s ha ganado el primer premio: " + imp[3] + "€");
            System.out.println(acertantes[1] + " persona/s ha ganado el segundo premio " + imp[2] + "€");
            System.out.println(acertantes[2] + " persona/s ha ganado el tercer premio " + imp[1] + "€");
            System.out.println(acertantes[3] + " persona/s ha ganado el cuarto premio " + imp[0] + "€");
            System.out.println(acertantes[4] + " persona/s han acertado 1 numero pero ganado nada. Suerte a la próxima");
            System.out.println("Los demás jugadores no han acertado ni un numero. Suerte a la próxima");
        } else {
            System.out.println("No has celebrado el sorteo.");
        }

    }

    public static void infoSorteo(Sorteo Sorteo) {

        double[] a = Sorteo.getImportes();
        int[] b = Sorteo.getAcertantes();
        double perdidas1 = 0.0;
        double perdidas2 = 0.0;
        double perdidas3 = 0.0;
        double perdidas4 = 0.0;
        double perdidas_total = 0.0;

        perdidas1 = b[0] * a[3];
        perdidas2 = b[1] * a[2];
        perdidas3 = b[2] * a[1];
        perdidas4 = b[3] * a[0];

        perdidas_total = perdidas1 + perdidas2 + perdidas3 + perdidas4;

        if (Sorteo.getJugadores() != 0) {

            System.out.println("Titulo: " + Sorteo.getTitulo());
            System.out.println("El boleto ganador es: " + Sorteo.getGanador());
            System.out.println("Hay " + Sorteo.getJugadores() + " jugadores");
            System.out.println("El precio del boleto: " + Sorteo.getPrecio_boleto());
            System.out.println("Las ganancias son: " + Sorteo.getPrecio_boleto() * Sorteo.getJugadores());
            System.out.println("Las perdidas son " + perdidas_total);
            System.out.println("La recaudación total es: " + (Sorteo.getPrecio_boleto() * Sorteo.getJugadores() - perdidas_total));
        } else {

            System.out.println("El sorteo no se ha celebrado");
        }
    }

    public static void cerrarSorteo(Sorteo Sorteo) {

        Sorteo.cerrar();
    }
}
