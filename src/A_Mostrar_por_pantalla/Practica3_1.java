	/* PRACTICA 3.1
Escribe todas las variables que conozcas hasta ahora, con ejemplos. Usar constantes y Constantes internas ya definidas.

*/
package A_Mostrar_por_pantalla;

/**
 *
 * @author alumno
 */
public class Practica3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    byte edad = 32;
    int pisos = 100;
    long telefono = 955555444;
    float cuenta = 200.23f;
    double primitiva = 3000000.34;
    char estadoCivil = 'C';
    boolean mientes = true;
    final int x = 12;

    System.out.println("Edad: " + edad);
    System.out.println("Numero de Pisos: " + pisos);
    System.out.println("Numero de telefonos: " + telefono);
    System.out.println("Importe de Cuenta: " + cuenta);
    System.out.println("Me ha tocado: " + primitiva);
    System.out.println("Confiesa: " + mientes);
    System.out.println("Estado Civil: " + estadoCivil);
    System.out.println("Constante: " + x);
    }
    
}
