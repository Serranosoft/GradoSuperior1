/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencias_Polimorfismos_Abstractos_Interfaces.N_Herencias;
import java.util.Calendar;

public class Ej34_herencia_doble {

    public static void main(String[] args) {
        
        Profesor_ejemplo4 p1 = new Profesor_ejemplo4("1", "Mario", 333);
        
        Calendar f1 = Calendar.getInstance();
        f1.set(2018, 10, 22);
        
        ProfesorInterino_ej4 pi1 = new ProfesorInterino_ej4(f1, "2", "jesus", 222);
        
        ListinProfesor_ej4 listin1 = new ListinProfesor_ej4();
        
        listin1.addProfesor(pi1);
        listin1.addProfesor(p1);
        
        listin1.listar();
        
    }

}
