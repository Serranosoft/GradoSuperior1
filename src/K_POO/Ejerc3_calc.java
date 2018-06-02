
/*Ejercicio 1: Crear una calculadora que tenga las operaciones de suma, resta, multiplicacion,
división, raiz cuadrada y elevar un numero a una potencia, que tenga los siguientes métodos:

- Imprimir menú
- Realizar las operaciones asignadas.
- Mostrar todas operaciones realizadas hasta el momento.
package K_POO;

*/
package K_POO;

import java.util.Scanner;

public class Ejerc3_calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int op, n1, n2;
      
        
        Calculadora calc1 = new Calculadora(0, 0, 0, 0, 0, 0, false, false, false, false, false, false);
        Calculadora calc2 = new Calculadora();
        
        
        //System.out.println(calc1.toString());
        
        System.out.println(calc1.menu());
        
        do{
        System.out.println("Elije una opción");
        op = sc.nextInt();
        
        if(op==7){
            break;
        }
            System.out.println("Intro n1");
            n1 = sc.nextInt();

            System.out.println("Intro n2");
            n2 = sc.nextInt();
            System.out.println(op);
        
        switch(op){
            
            case 1: 
                calc1.setSuma(n1 + n2);
                calc1.setB_suma(true);
                break;
            case 2: 
                calc1.setResta(n1 - n2);
                calc1.setB_resta(true);
                break;
            case 3: 
                calc1.setProducto(n1 * n2);
                calc1.setB_prod(true);
                break;
            case 4: 
                calc1.setDivision(n1 / n2);
                calc1.setB_div(true);
                break;
            case 5: 
                calc1.setRaiz(Math.sqrt(n1));
                calc1.setB_raiz(true);
                break;
            case 6: 
                calc1.setElevar(Math.pow(n1, n2));
                calc1.setB_elevar(true);
                
            
        }
        System.out.println(calc1.toString());
        
        }while(op!=7);
        
    }
    
}
