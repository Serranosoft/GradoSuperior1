/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencias_Polimorfismos_Abstractos_Interfaces.N_Herencias;

import java.util.Arrays;
import java.util.List;


public class Ej2_herencia {

    public static void main(String[] args) {
        String[] asignaturas = {"SSII", "BBDD", "Prog"};
        
        List array_asig = Arrays.asList(asignaturas);
        
        Alumno a1 = new Alumno(array_asig, "al-123", "Manuel", "C/ Torrente 3", 12);
        Alumno a2 = new Alumno(array_asig, "al-333", "Enrique", "C/ Silla 4", 87);
        Alumno a3 = new Alumno(array_asig, "al-443", "Sergio", "C/ Olimpo 47", 74);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
        Profesor p1 = new Profesor("prf-333", 5000, "Mario", "Topete 23", 123);
        Profesor p2 = new Profesor("prf-322", 5000, "Jesus", "abc 32", 123);
        
        System.out.println(p1);
        System.out.println(p2);
        
    }

}
