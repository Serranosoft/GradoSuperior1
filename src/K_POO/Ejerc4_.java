/*
Ejercicio 2: Crear una lista de números decimales, la cantidad de elementos de la lista deben ser
numeros dentro del invervalo [5; 10],
Los valores que se agregan a la lista deben ser números decimales dentro del invervalo [45.0;90.0].
Se pide una aplicacion en Java que permita cumplir con los siguientes requerimientos.


* Imrpimir la lista de números generados
* Imprimir el promedio de los valores que fueron incorporados
* Imrpimir el número mayor que forma parte de la lista
* Imrpimir la diferencia entre el segundo número mas grande y el segundo mas pequeño
 */
package K_POO;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerc4_ {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Operaciones_Ejerc4 lista = new Operaciones_Ejerc4();
       
        double[] v;
        double temp;
        int tam = (int)(Math.random()*5)+5;
        int cont = 0;
        v = new double[tam];
        
        while(cont<tam){
            System.out.printf("Intro valor %d :", (cont+1));
            temp = sc.nextDouble();
            if(temp>=45.0 && temp<=90.0){
                v[cont] = temp;
                cont++;
            }
        }
 
        lista.mostrar(v);
        lista.max(v);
        lista.min(v);
        lista.media(v);
        lista.diferencia(v);
    }
    
}
