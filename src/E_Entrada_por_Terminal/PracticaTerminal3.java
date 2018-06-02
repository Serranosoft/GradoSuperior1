/*
Practica Terminal3. Insertar un número indeterminado desde teclado y mostrar solo los pares.

 */
package E_Entrada_por_Terminal;

public class PracticaTerminal3 {

  
    public static void main(String[] args) {
        
        int n = args.length;
        
        for (int i = 0; i < n; i++) {
            if(Integer.parseInt(args[n]) % 2 == 0){
                
                System.out.println(args[n]);
                
            }
            
        }
       
    }
    
}
