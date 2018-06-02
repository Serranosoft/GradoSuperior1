/*
PR14_ARRAY. Generar un array en 3D con valores enteros y calcular su suma, cuadrados y numeros divisibles por 5.
 */
package J_Arrays;

/**
 *
 * @author manuelsesc
 */
public class Pract14_array {

 
    public static void main(String[] args) {
        
        int [][][] t = new int [6][6][6];
        int cuadrados = 0;
        int suma = 0;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    t[i][j][k] = (int)(Math.random()*50);
                
                }
            
            }
        }
        
            
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    
                    suma += t[i][j][k];
                    
                }
                
            }
            
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    
                    cuadrados = (int)Math.pow(t[i][j][k],2);
                    
                }
                
            }
            
        }
        System.out.println("Los numeros generados por el array que son divisibles entre 5 son :");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
            for (int k = 0; k < 6; k++) {
                    
                    if(t[i][j][k] % 5 == 0){
                        
                        System.out.print(t[i][j][k] +" ");
                    }
                    
                }
                
            }
            
        }
        System.out.println(" ");
        System.out.println("La cantidad de cuadrados que hay en el array 3D es de : " +cuadrados);
        System.out.println("La suma de todos los valores que hay en el array 3D es de : " +suma);
        
        
    }
    
}
