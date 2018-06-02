/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores.Practica5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 *
 * @author Manuel
 */
public class Ejerc3_Practica5 {

    
    public static void main(String[] args) {
        // Generamos un LinkedList con los valores de la clase Dino_Practica5
        Scanner sc = new Scanner(System.in);
        
        LinkedList<Dino_Practica5> lista = new LinkedList<Dino_Practica5>();
        
        // Genero un array de tipo Dino_Practica5 de 5 valores
        Dino_Practica5[] a = new Dino_Practica5[5];
        // Con un bucle voy creando los objetos y los voy añadiendo en el array
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Intro nombre");
            String nombre = sc.nextLine();
            System.out.println("Intro peso");
            double peso = sc.nextDouble();
            System.out.println("Intro años");
            sc.nextLine();
            int años = sc.nextInt();

            Dino_Practica5 objeto1 = new Dino_Practica5(nombre, peso, años);
            a[i] = objeto1;
            sc.nextLine();
            
            
        }
        // Insertamos el array en la función asList()
        
        lista = new LinkedList(Arrays.asList(a));
        
        ListIterator li1 = lista.listIterator();
        
        while(li1.hasNext()){
            System.out.println(li1.next());
        }
        // Creo otros 3 objetos y los añado al principio de la lista.
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Intro nombre");
            String nombre = sc.nextLine();
            System.out.println("Intro peso");
            double peso = sc.nextDouble();
            System.out.println("Intro años");
            sc.nextLine();
            int años = sc.nextInt();
            sc.nextLine();
            
            Dino_Practica5 valor = new Dino_Practica5(nombre, peso, años);
            lista.addFirst(valor);
            
        }
        // Muestro la lista
        ListIterator li2 = lista.listIterator();
        System.out.println("******************LISTA CON LOS 3 ELEMENTOS INSERTADOS AL PRINCIPIO**********************");
        while(li2.hasNext()){
            System.out.println(li2.next());
        }
        // Elimino los ultimos objetos de la lista con el método removeLast()
        System.out.println("\n");
        
        lista.removeLast();
        lista.removeLast();
        lista.removeLast();
        
        System.out.println("******************LISTA CON LOS 3 ULTIMOS ELEMENTOS ELIMINADOS *****************");
        System.out.println(lista);

    }

}
