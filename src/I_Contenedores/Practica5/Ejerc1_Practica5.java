/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores.Practica5;

import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author alumno
 */
public class Ejerc1_Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro un vector con valores Integer
        List<Integer> v1 = new java.util.Vector<Integer>();
        // Declaro el numero ganador y le inserto un valor aleatorio.
        int numGanador = ((int)(Math.random() * 20) + 1);
        
        int contador = 0;
        int numAciertos = 0;

        int suma = 0;
        // Inserto 100 valores aleatorios en la lista
        for (int i = 0; i < 100; i++) {
            v1.add((int) (Math.random() * 20) + 1);
        }
        // Declaro el listIterator y muestro por pantalla
        ListIterator li = v1.listIterator();


        while (li.hasNext()) {

            if (contador % 10 == 0) {

                System.out.print("\n");
            }
            // Declaro n y le doy el valor del listIterator para poder usarlo en las sentencias condicionales y contar los 100 elementos
            // En caso contrario usando "next()" tan solo contaría la mitad, 50.
            int n = (int) li.next();
            
            if (n == numGanador) {
                numAciertos++;
                System.out.printf("\033[36m%6d", n);

            } else {
                System.out.printf("\033[31m%6d", n);
            }

            contador++;
            suma += n;
        }
        
        
        // Muestro por pantalla
        System.out.println("\n");
        System.out.println("Han ganado " + numAciertos + " personas");
        System.out.println("");
        System.out.println("La suma de los elementos del array es: " +suma);

    }

}
