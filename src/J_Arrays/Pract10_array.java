/*
PR10_ARRAY. Generar un array de 5x5 números enteros que se rellenen de forma aleatorio (de 0 a 1000) y calcula la suma
de todos ellos.
 */
package J_Arrays;

/**
 *
 * @author manuelsesc
 */
public class Pract10_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[][] = new int [5][5];
        int suma = 0;
        
        for(int i=0;i<5;i++){
            for (int j = 0; j < 5; j++) {
                
                t[i][j] = (int)(Math.random()*1000);
                
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                suma += t[i][j];
                
            }
            
        }
        
        System.out.printf("%d %n", suma);
    }
    
}
