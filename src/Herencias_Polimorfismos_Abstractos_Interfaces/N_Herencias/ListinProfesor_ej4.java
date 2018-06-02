/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.N_Herencias;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miguelbepr
 */
public class ListinProfesor_ej4 {
    private List<Profesor_ejemplo4> listin;

    public ListinProfesor_ej4() {
        this.listin = new ArrayList();
    }
    
    void addProfesor(Profesor_ejemplo4 profesor){
        listin.add(profesor);
    }
    
    void listar(){
        System.out.println("Profesores: ");
        for (Profesor_ejemplo4 profesor : listin) {
            System.out.println(profesor);
        }
    }
}
