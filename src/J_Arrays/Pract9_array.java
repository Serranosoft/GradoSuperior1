/*
PR9_ARRAY. Lista de la Compra, Introducir por teclado un array 20 posiciones de tipo String 10 alimentos y en otro array
de tipo real su correspondiente precio y mostrar el siguiente menu:

    *********************************************************
    *                   LISTA DE LA COMPRA                  *
    *********************************************************
    * 1. INSERTAR UN ALIMENTO                               *
    * 2. ELIMINAR UN ALIMENTO                               *
    * 3. MOSTRAR CARRITO                                    *
    * 4. SALIR                                              *
    *********************************************************
    ELEGIR UNA OPCIÓN: 2

 */
package J_Arrays;

import java.util.Scanner;


public class Pract9_array {

    
    public static void main(String[] args) {
 
        String[] arts = {"Manzana", "Patatas", "Fresas", "Fabada", "Coliflor", "Oregano", "Tomillo", "Sal", "Azúcar", "Pimiento","","","","","","","","","",""};
        double[] precios = {1.2,0.8,3.2,1.4,1.7,0.6,0.9,2.2,2.4,2.6,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0};
        
        int op;
        Scanner sc = new Scanner(System.in);
        do{
            op = menu(sc);
            switch(op){
                case 1:
                    insertar(arts, precios, sc);
                    break;
                case 2:
                    eliminar(arts, precios, sc);
                    break;
                    
                case 3:
                    mostrar (arts, precios, sc);
                    break;
            }
        }while(op!=4);
     
    }
    
    private static int menu(Scanner sc) {
        String menu = "" +
          "************************************\n" +
          "*       CARRITO DE LA COMPRA       *\n" +
          "*1. INSERTAR UN ARTICULO           *\n" +
          "*2. ELIMINAR UN ARTICULO           *\n" +
          "*3. MOSTRAR CARRITO                *\n" +
          "*4. SALIR                          *\n" +
          "************************************\n";
          System.out.print(menu + "ELEGIR UNA OPCIÓN: ");
          return sc.nextInt();
    }
    
    private static void insertar(String[] arts, double[] precios, Scanner sc) {
        System.out.print("NUEVO ART: ");
        String art = sc.nextLine();
        art = sc.nextLine();
        System.out.print("NUEVO PRECIO: ");
        double precio = sc.nextDouble();
        for(int j=18;j>=0;j--){
            arts[j+1] = arts[j];
            precios[j+1] = precios[j];
            
          
        }
        arts[0] = art;
        precios[0] = precio;
    }
    
    private static void eliminar (String[] arts, double[] precios, Scanner sc) {
        System.out.print("POSICIÓN A ELIMINAR: ");
        int pos = sc.nextInt();
        for(int j=pos;j<19;j++){
            arts[j] = arts[j+1];
            precios[j] = precios[j+1];
            
        }
        arts[19] = "";
        precios[19] = -1;
    }
    
    private static void mostrar(String[] arts, double[] precios, Scanner sc) {
        for(int i=0; i<20; i++){
            if(precios[i]!=-1){
                System.out.printf( arts[i], precios[i]);
            }
        }
        
    }
    
    
    
}
