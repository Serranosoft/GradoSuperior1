/*
Un linkedlist
 */
package I_Contenedores;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerc3_LinkedList {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        LinkedList<Integer> lista = new LinkedList<>();
        

        // Importante si usamos el ListIterator en alguna función NO pasarla por parametro, sino, declararla dentro de ella
        int op = 0;
        
        
        do{
            System.out.println("Introduce una opción");
            System.out.println(menu());
            op = sc.nextInt();
            
            switch(op){
                
                case 1:
                    InsertarPrincipio(lista, sc);
                    break;
                case 2:
                    InsertarUltimo(lista, sc);
                    break;
                case 3:
                    BorrarPrincipio(lista);
                    break;
                case 4:
                    BorrarUltimo(lista);
                    break;   
                case 5:
                    MostrarLista(lista);
                    break;
                case 6:
                    BorrarLista(lista);
                    break;
            }
            
            
        }while(op!=7);
    }
    
    
    
    private static String menu() {
        String menu = ""
                + "1. Insertar un numero al Principio\n"
                + "2. Insertar un numero al Final\n"
                + "3. Borrar al Principio\n"
                + "4. Borrar al Final\n"
                + "5. Mostrar Lista \n"
                + "6. Borrar Lista Completa\n"
                + "7. Salir";
        
        return menu;
    }

    private static void InsertarPrincipio(LinkedList<Integer> lista, Scanner sc) {
        
        System.out.println("Introduce un numero para insertarlo al principio");
        int numero = sc.nextInt();
        lista.addFirst(numero);
    }

    private static void InsertarUltimo(LinkedList<Integer> lista, Scanner sc) {
        
        System.out.println("Introduce un numero para insertarlo al principio");
        int numero = sc.nextInt();
        lista.addLast(numero);
        
        
    }

    private static void BorrarPrincipio(LinkedList<Integer> lista) {
        
        lista.removeFirst();
        
    }
    
    private static void BorrarUltimo(LinkedList<Integer> lista) {
        
        lista.removeLast();
        
    }

    private static void MostrarLista(LinkedList<Integer> lista) {
        ListIterator<Integer> l1 = lista.listIterator();

        while(l1.hasNext()){
            
            System.out.println(l1.next());
            
        }   
    }
    private static void BorrarLista(LinkedList<Integer> lista) {
        
        lista.clear();
    }
    
    
    
    
}
