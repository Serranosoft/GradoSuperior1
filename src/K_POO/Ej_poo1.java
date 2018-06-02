/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_POO;
import static java.lang.System.exit;

public class Ej_poo1{

   
    public static void main(String[] args) {
        Vehiculo coche1 = null;
        Vehiculo coche3;
        /* Se puede inicializar una variable y si esta no tiene valor, es decir, null podemos indicar
        que si es null el objeto no esta inicializado y exit(0) devuelve algo similar al break, se corta
        */
        /*if (coche1== null){
            System.out.println("El objeto coche1 no esta inicializado");
            exit(0);
        }*/
        /* Declaramos coche1 y a través de otro archivo le damos valores a los atributos y los
        mostramos por pantalla */
        coche1 = new Vehiculo();
        Vehiculo coche2 = new Vehiculo();
        /*Utilizamos setMarca("datos"); para referirnos a la función que esta en el otro fichero
        para cuando necesitamos usar un atributo que esta en private*/
        
        coche1.setMarca("Peugeot");
        coche1.setModelo("315");
        coche1.matricula = "BR4090Z";
        coche1.color = "Amarillo";
        coche1.tarifa = 2000;
        

        System.out.println("su matricula es " +coche1.matricula + " ");
        System.out.println("es de color " +coche1.color + " ");
        System.out.println("y me ha costado la tarifa " +coche1.tarifa + " ");
        
        
        coche2.setMarca("Renault");
        coche2.setModelo("Megane");
        coche2.matricula = "Q8485BR";
        coche2.color = "Rojo";
        coche2.tarifa = 3000;
        
        /* Utilizamos una función para mostrar la información */
        
        System.out.println(" ");
        System.out.println("Ejemplo de mostrar a través de una función ");
        coche1.mostrar();
        coche2.mostrar();
        
        /*GETTER */
        System.out.println(" ");
        System.out.print(coche1.getMatricula() +" ");
        System.out.print(coche1.getModelo() +" ");
        System.out.print(coche1.getColor() +" ");
        System.out.print(coche1.getMarca() +" ");
        System.out.print(coche1.getTarifa() +" ");
        
        coche3 = coche1;    //Coche3 es un alias de coche1
        
        coche3.setColor("Violeta");
        
        System.out.println(coche1.getColor());
        
        
        System.out.println(Matematicas.PI); 
    }
}
       
        
        
        
        
        
       
