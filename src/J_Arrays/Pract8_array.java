/*
PR8_ARRAY. Introducir por teclado un array de 10 valores, en la que se elimine la posición indicada,
de modo que no se dejen heucos al borrar (indicar los resultados). Repetir este bucle hasta que el array quede
vacio.
 */
package J_Arrays;

import java.util.Scanner;

/**
 *
 * @author manuelsesc
 */
public class Pract8_array {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int pos;
        int nvalores = 10;
        
        int [] t = new int[10];
        
        for (int i = 0; i<10; i++){
            
            System.out.println("Introduce valores para rellenar la tabla");
            t[i] = sc.nextInt();
        }
        
        while(nvalores>0){
        System.out.println("Introduce la posición a eliminar");
        pos = sc.nextInt();
        
       
        for(int p = pos; p<9;p++){
            
            t[p]=t[p+1];    
            
        }
        t[9] = 0;
        
        

        muestraArray(t);
        nvalores--;
            
        }
    }
    
    public static void muestraArray (int [] t){
        System.out.println("Tabla actualizada: ");
        for (int i=0;i<t.length;i++){
            System.out.printf("%d ", t[i]);
            
        }
        System.out.println("");
        
        }
    }
       
        
       
 
