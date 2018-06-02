package E_Entrada_por_Terminal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if(args.length!=3){
            System.err.println("Dene tener 3 parametros");
        }else{
            int a, b, c;
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
            
            int suma = a + b + c;
            
            System.out.printf("%4$d + %3$d + %2$d = %1$12d", suma, c, b, a );
        }
    }
    
}
