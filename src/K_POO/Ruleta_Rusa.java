/*
La ruleta rusa:

Crear un programa donde haya una lista de jugadores, especificados por teclado, donde cada jugador
tendrá los atributos:

estado(0 = muerto, 1 = vivo);
yo_juego (0 = no, 1 = si);
identificador (numero entero según orden de creación).

Asignar a estado y a yo_juego un valor aleatorio.

Crear un método en el main que sea jugador, asignandole valores y que muestre:

Ronda 1:

    Jugador 1: He sobrevivido!
    Jugador 2: Muerto.
    Jugador 3: No juego.

Admitir rondas hasta que no hayan jugadores.

 */
package K_POO;

import java.util.Scanner;


public class Ruleta_Rusa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos jugadores participan?");
        int n = sc.nextInt();

        Operaciones_Ruleta_Rusa jugadores[] = new Operaciones_Ruleta_Rusa[n];

        for (int i = 0; i < n; i++) {

            jugadores[i] = new Operaciones_Ruleta_Rusa();

            jugadores[i].setIdentificador(i + 1);
            jugadores[i].setYo_juego((byte) (Math.random() * 2));
        }
        jugador(jugadores, n);

    }

    public static void jugador(Operaciones_Ruleta_Rusa jugadores[], int n) {

        int contador = 1;
        int vivos = n;

        while (vivos > 0) {

            System.out.println("Ronda " + contador);
            for (int i = 0; i < n; i++) {
                if(jugadores[i].getEstado() == 1){
                    
                    jugadores[i].setEstado((byte) (Math.random() * 2));
                    if(jugadores[i].getEstado() == 0){
                        vivos--;
                    }
                    
                }
                
                
                if (jugadores[i].getEstado() == 1 && jugadores[i].getYo_juego() == 1) {

                    System.out.println("Jugador " + jugadores[i].getIdentificador() +" esta vivo");

                }else if(jugadores[i].getYo_juego() == 0){
                    System.out.println("Jugador " + jugadores[i].getIdentificador() +" no juega");

                }else{
                    System.out.println("Jugador " + jugadores[i].getIdentificador() +" esta muerto");
                }

            }
            
            contador++;

        }

    }

}
