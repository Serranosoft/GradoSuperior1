/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_POO.EjemploExPOO;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejExPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Supermercado superm = new Supermercado("SuperZoom", 222222);
        int op = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(menu());
            System.out.println("Elige opcion: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    insertarProd(superm, sc);
                    break;
                case 2:
                    comprarProd(superm, sc);
                    break;
                case 3:
                    infoSuper(superm);
                    break;
                case 4:
                    cerrarSuper(superm);
                    break;
                    

            }

        } while (op != 5);

    }

    private static String menu() {
        String menu = ""
                + "*************************\n"
                + "*1. Añadir producto     *\n"
                + "*2. Comprar Producto    *\n"
                + "*3. Info Supermercado   *\n"
                + "*4. Cerrar Supermercado *\n"
                + "*5. Salir               *\n"
                + "***************************";
        return menu;
    }

    private static void insertarProd(Supermercado superm, Scanner sc) {
        System.out.println("Introduce nombre producto: ");
        sc.nextLine();
        String prod = sc.nextLine();

        System.out.println("Precio Base: ");
        double pb = sc.nextDouble();

        System.out.println("Porcentaje de ganancia: ");
        double porcent = sc.nextDouble(); //Cuanto porcentaje me quiero llevar al venderse el producto

        double pv = pb + (pb * porcent / 100);

        Producto nuevoProd = new Producto(prod, pb, pv); //Ya hemos creado el producto con todos sus valores 

        if (superm.addProd(nuevoProd)) {
            System.out.println("Producto insertado!");
        }
        
       
    }

    private static void comprarProd(Supermercado superm, Scanner sc) {
        System.out.println("Nombre producto: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        Producto[] listaProd = superm.getProductos(); //He creao un array de producto donde le he asignado la lista
        
        
        for (int i = 0; i < superm.getnProd(); i++) { /*Recorro la lista y si la lista en la posicion i obtengo su nombre 
            es igual al nombre, si el nombre introducido es igual al nombre del producto de la lista, lo elimina*/
            if(listaProd[i].getNombre().equals(nombre)){
                if(superm.delProd(i)){
                    System.out.println("Producto Comprado. Muchas gracias!!");
                    
                }else{
                    System.out.println("Error de compra!");
                }
            }else{
                System.out.println("Producto no encontrado.");
            }
            
            
        }
    }

    private static void infoSuper(Supermercado superm) {
        System.out.println("******** INFO DEL SUPERMERCADO **********");
        System.out.println("Nombre: " +superm.getNombre());
        System.out.println("Cif" +superm.getCif());
        for (int i=0; i<superm.getnProd(); i++) {
            System.out.println(superm.getProductos()[i].toString()); //Si no pones el .toString() da igual, se mostrará igual con el toString     
        }
        
        System.out.println("Ganancia Base: " + superm.getGananciaBase()); // Lo que le cuesta al supermercado
        System.out.printf("Ganancia Venta: %1.2f %n " , superm.getGananciaVenta());
        System.out.printf("Ganancia Neta:  %1.2f %n" ,(superm.getGananciaVenta()-superm.getGananciaBase()));
        System.out.println("");
    }

    private static void cerrarSuper(Supermercado superm) {
        superm.cerrar();
        superm = null;
        System.out.println("Cerrado!!");
        

    }

}
