/*
Crear un menú donde se pida:

1. Insertar un empleado a una lista de objetos de tipo empleado (pide el nombre, dni, sueldo y cargo).
2. Mostrar la ficha de un empleado por su posición o dni.
3. Listar todas las fichas die una vez de la lista.
4. Eliminar un empleado identificado por su posición o dni.
5. Salir del programa.

 */
package K_POO;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerc6_ {

    public static void main(String[] args) {

        Operaciones_Ejerc6[] empleados = new Operaciones_Ejerc6[10];

        int op, pos = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(menu());
            System.out.println("Elige una opción");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    Insertar(empleados, sc, pos);
                    pos++;
                    break;
                case 2:
                    mostrarLista(empleados, sc, pos);
                    break;
                case 3:
                    mostrarTodo(empleados, pos);
                    break;
                case 4:
                    eliminarEmpleado(empleados, sc, pos);
            }

        } while (op != 5);

    }

    public static String menu() {

        String menu = ""
                + "******************************************\n"
                + "* 1. Insertar Empleado                   *\n"
                + "* 2. Mostrar ficha de empleado           *\n"
                + "* 3. Listar lista                        *\n"
                + "* 4. Eliminar un empleado                *\n"
                + "* 5. Salir.                              *\n"
                + "******************************************";
        return menu;
    }

    private static void Insertar(Operaciones_Ejerc6[] empleados, Scanner sc, int pos) {
        System.out.println("Inserta tu nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();

        System.out.println("Inserta tu DNI: ");
        long dni = sc.nextLong();
        sc.nextLine();

        System.out.println("Inserta tu Cargo: ");
        String cargo = sc.nextLine();

        System.out.println("Inserta tu Sueldo: ");
        double sueldo = sc.nextDouble();

        empleados[pos] = new Operaciones_Ejerc6(nombre, dni, sueldo, cargo);

    }

    private static void mostrarLista(Operaciones_Ejerc6[] empleados, Scanner sc, int numero) {
        System.out.println(
                  "*************************"
                + "1. Inserta la Posición \n"
                + "2. Inserta el DNI      \n"
                + "***********************\n");
        int opc = sc.nextInt();
        switch (opc) {

            case 1:
                System.out.println("Introduce la posición");
                int pos = sc.nextInt();
                empleados[pos].getNombre();
                empleados[pos].getDni();
                empleados[pos].getCargo();
                empleados[pos].getSueldo();
                break;
            case 2:
                System.out.println("Introduce el DNI");
                long dni = sc.nextLong();

                for (int i = 0; i < numero; i++) {

                    if (empleados[i].getDni() == dni) {

                        System.out.println(empleados[i].getNombre());
                        System.out.println(empleados[i].getDni());
                        System.out.println(empleados[i].getSueldo());
                        System.out.println(empleados[i].getCargo());
                    } else {
                        System.out.println("Empleado no encontrado");
                    }
                }
                break;
                
               

        }
    }

    private static void mostrarTodo(Operaciones_Ejerc6[] empleados, int pos) {

        for (int i = 0; i < pos; i++) {

            System.out.println(empleados[i].getNombre());
            System.out.println(empleados[i].getDni());
            System.out.println(empleados[i].getSueldo());
            System.out.println(empleados[i].getCargo());
        }

    }

    private static void eliminarEmpleado(Operaciones_Ejerc6[] empleados, Scanner sc, int pos) {
        System.out.println("Que posicion quieres borrar");
        int posicion = sc.nextInt();
        
        if(posicion <= pos){
            
            empleados[posicion].setCargo("");
            empleados[posicion].setDni(-1);
            empleados[posicion].setNombre("");
            empleados[posicion].setSueldo(-1);
        }
        
    }
    
    
    
}
