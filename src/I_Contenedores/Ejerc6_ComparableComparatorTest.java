/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores;

import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class Ejerc6_ComparableComparatorTest{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> nombre = Arrays.asList("Daniel", "Ernesto", "Ramon", "Pepe");

        System.out.println(nombre);
        System.out.println("Lista desordenada" + nombre);
        Collections.sort(nombre);
        System.out.println("Lista ordenada " + nombre);
        System.out.println(nombre);

        Set<String> otrosNombres = new TreeSet<String>();

        otrosNombres.add("Santi");
        otrosNombres.add("Sergio");
        otrosNombres.add("Adrian");
        otrosNombres.add("Christian");

        System.out.println("Conjunto ordenado: " + otrosNombres);
        
        //Orden comparable (orden natural)
        Set<Usuario> usuarios = new TreeSet<Usuario>();
        Usuario u1 = new Usuario("Juan Carlos", 3);
        Usuario u2 = new Usuario("Cynthia", 2);
        Usuario u3 = new Usuario("Pablo", 8);
        Usuario u4 = new Usuario("Manuel Gonzalez", 5);

        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);

        Iterator it = usuarios.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //Orden con Comparator (ordenacion alternativa)
        Set<Usuario> otrosUsuarios = new TreeSet<Usuario>(new OrdenaPersonaPorId());
        Usuario u5 = new Usuario("Juan Carlos", 3);
        Usuario u6 = new Usuario("Cynthia", 2);
        Usuario u7 = new Usuario("Pablo", 8);
        Usuario u8 = new Usuario("Manuel Gonzalez", 5);
        
        otrosUsuarios.add(u5);
        otrosUsuarios.add(u6);
        otrosUsuarios.add(u7);
        otrosUsuarios.add(u8);
        
        
        System.out.println("Comparator Edad y Nombre: ");

        Iterator it2 = otrosUsuarios.iterator();

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        
        
        System.out.println("-------------------------------\n");
        // Orden con Comparator (Ordenacion alternativa con Clase Interna
        Set<Usuario> otrosUsuarios3 = new TreeSet<Usuario>(
            new Comparator<Usuario>(){
                    @Override
                    public int compare(Usuario o1, Usuario o2){
                        return o1.getEdad() - o2.getEdad();
        
                    }
            }
        );

        otrosUsuarios3.add(u5);
        otrosUsuarios3.add(u6);
        otrosUsuarios3.add(u7);
        otrosUsuarios3.add(u8);
        
        System.out.println("Comparator Edad: ");

        
        Iterator it3 = otrosUsuarios.iterator();

        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
        System.out.println("-------------------------------\n");
        List<Usuario> otrosUsuarios2 = Arrays.asList(
                new Usuario("Miguel", 6),
                new Usuario("Mario", 8),
                new Usuario("Jesus", 4),
                new Usuario("Fran", 2)
        );

        System.out.println("Lista desordenada" + otrosUsuarios2);
        
        Collections.sort(otrosUsuarios2, new OrdenaPersonaPorId());
        
        System.out.println("Lista " +otrosUsuarios2);
      
    }

}
