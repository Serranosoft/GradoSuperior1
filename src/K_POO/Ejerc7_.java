/*
Realizar una agenda donde esta clase contenga, un nombre, una fecha un teléfono y un evento.
Realizar las operaciones de insertar nuevo registro, listar agenda, seleccionar por fecha
y eliminar registro.
 */
package K_POO;

import java.util.Scanner;


public class Ejerc7_ {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int opc = 0;
        
        Operaciones_Ejerc7[] agenda = new Operaciones_Ejerc7[10];
        
        do {
            System.out.println(menu());
            System.out.println("Elige una opción");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    Insertar(agenda, sc, pos);
                    pos++;
                    break;
                case 2:
                    Mostrar(agenda, pos);
                    break;
                case 3:
                    SeleccionarFecha(agenda, sc, pos);
                    break;
                case 4:
                    eliminarRegistro(agenda, pos, sc);
            }

        } while (opc != 5);
        
    }
    
    
    public static String menu() {

        String menu = ""
                + "******************************************\n"
                + "* 1. Insertar Registro                   *\n"
                + "* 2. Mostrar Agenda                      *\n"
                + "* 3. Seleccionar Registro                *\n"
                + "* 3. Eliminar Registro                   *\n"
                + "******************************************";
        return menu;
    }
    public static void Insertar(Operaciones_Ejerc7 agenda[], Scanner sc, int pos){
        
        System.out.println("Inserta el nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println("Inserta la fecha: ");
        String fecha = sc.nextLine();
        System.out.println("Inserta el telefono");
        int telefono = sc.nextInt();
        System.out.println("Inserta el evento: ");
        sc.nextLine();
        String evento = sc.nextLine();
       
        
        agenda[pos] = new Operaciones_Ejerc7(nombre, fecha, telefono, evento);
    }
    
    public static void Mostrar(Operaciones_Ejerc7 agenda[], int pos){
        
        
        for (int i = 0; i < pos; i++) {
            
            if(agenda[i].getTelefono() != -1){
            System.out.println(agenda[i].getNombre());
            System.out.println(agenda[i].getFecha());
            System.out.println(agenda[i].getTelefono());
            System.out.println(agenda[i].getEvento());
   
            }else{
                
                System.err.println("La agenda no tiene registros");
            }
            
            
        }
    }
    
    public static void SeleccionarFecha (Operaciones_Ejerc7 agenda[], Scanner sc, int pos){
        
        System.out.println("Introduce una fecha para ver el registro");
        String fecha = sc.nextLine();
        fecha = sc.nextLine();
        
        
        
        for (int i = 0; i < pos; i++) {
            
            if(agenda[i].getFecha().equals(fecha)){
                
                System.out.println(agenda[i].getNombre());
                System.out.println(agenda[i].getFecha());
                System.out.println(agenda[i].getTelefono());
                System.out.println(agenda[i].getEvento());
                
            }else{
                System.out.println("No existe registro con la fecha indicada");
            }   
        }
  
    }
    
    public static void eliminarRegistro(Operaciones_Ejerc7 agenda[], int pos, Scanner sc){
        System.out.println("Que registro quieres eliminar?");
        pos = sc.nextInt();
        
        
        for (int i = 0; i < 9; i++) {
            agenda[pos].setNombre("");
            agenda[pos].setFecha("");
            agenda[pos].setTelefono(-1);
            agenda[pos].setEvento("");
            
        }
        
        
    }
    
            
            
    
}
