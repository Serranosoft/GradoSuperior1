/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencias_Polimorfismos_Abstractos_Interfaces.O_Polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        int tipo;
        //Listas polimorficas
        List<Persona> personas = new ArrayList();
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            System.out.print("Edad: ");
            edad = sc.nextInt();
            System.out.print("Tipo de persona (1: persona, 2: Alumno, 3: Profesor) ");
            tipo = sc.nextInt();
            
            switch(tipo){
                case 1:
                    personas.add(new Persona(nombre, edad));
                    break;
                case 2:
                    personas.add(new Alumno(nombre, edad, (int) Math.random()*50));
                    break;
                case 3:
                    personas.add(new Profesor(nombre, edad, (int) Math.random()*50));
                    break;
                default: System.out.println("mal");
            }
            sc.nextLine();
        }
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

}
