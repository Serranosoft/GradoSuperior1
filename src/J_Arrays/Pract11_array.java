/*
PR11_ARRAY. Diseñar un menú donde se pueda elegir entre una matriz de 2x2 o 3x3 enteros, donde se calcule el
determinante de ellos haciendo uso de la Regla de Sarrus.
 */
package J_Arrays;

import java.util.Scanner;


public class Pract11_array {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int t [][] = new int[2][2];
        int y [][] = new int[3][3];
        int opcion;
        do{
           opcion = menu(sc);
           switch(opcion){
               
               case 1:
                   matriz2(t, sc);
                   break;
               case 2:
                   matriz3(y, sc);
                   break;
                   
               default:
                   System.out.println("Opción no valida. Introduce otra opción.");
                   
           } 
        }while(opcion!=3);
        
/* 
        
1	3

2	4

[0][0] = 1
[1][0] = 2
[0][1] = 3
[1][1] = 4

1	4	7
2	5	8
3	6	9

[0][0] = 1
[1][0] = 2
[2][0] = 3
[0][1] = 4
[1][1] = 5
[2][1] = 6
[0][2] = 7
[1][2] = 8
[2][2] = 9
*/

    }
    
    public static int menu(Scanner sc){
        
        String menu = "" + 
        "*************************\n"
      + "*    ELIGE UNA MATRIZ   *\n"
      + "*************************\n"
      + "*      1. Matriz 2x2    *\n"
      + "*      2. Matriz 3x3    *\n"
      + "*      3. Salir         *\n"
      + "*************************\n";
        
        System.out.println(menu +"Elige una opción");
        return sc.nextInt();
          
    }
    
    public static void matriz2(int [][] n, Scanner sc){
        
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                System.out.println("Introduce numeros para rellenar la matriz");
                n[i][j] = sc.nextInt();
                
                
            }
    
        }
        int det2 = n[0][0] * n[1][1] + n[0][1] * n[1][0];
        System.out.println(det2);
        
    }
    public static void matriz3(int[][] b, Scanner sc){
        
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.println("Introduce numeros para rellenar la matriz");
                b[i][j] = sc.nextInt();
                
            }
            
        }
        
        int det3 = b[0][0] * b[1][1] * b[2][2] + b[1][0] * b[2][1] * b[0][2] + b[2][0] * b[0][1] * b[1][2] - b[0][2] * b[1][1] * b[2][0] - b[1][2] * b[2][1] * b[0][0] - b[2][2] * b[0][1] * b[1][0];
        System.out.println(det3);
    }
    

    
}
