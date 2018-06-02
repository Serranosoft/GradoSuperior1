/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencias_Polimorfismos_Abstractos_Interfaces.O_Polimorfismo;


public class Ej1 {

    public static void main(String[] args) {
        Persona p = new Persona("Pablo", 44);
        Persona a1 = new Alumno("Enrique", 88, 2);
        Alumno a2 = new Alumno("Enrique", 88, 3);
        Profesor p2 = new Profesor("Javier", 99, 4);
        
        System.out.println(p);
        System.out.println(a1);
        
        //System.out.println(a1.muestrame());                   Error   
        System.out.println(a2.muestrame());
        
        System.out.println(p2);
    }

}
