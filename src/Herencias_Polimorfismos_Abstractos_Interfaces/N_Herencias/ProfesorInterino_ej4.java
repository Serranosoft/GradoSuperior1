/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.N_Herencias;

import java.util.Calendar;

/**
 *
 * @author miguelbepr
 */
public class ProfesorInterino_ej4 extends Profesor_ejemplo4{
    private Calendar fechaComienzo;

    public ProfesorInterino_ej4(Calendar fechaComienzo, String id, String nombre, int edad) {
        super(id, nombre, edad);
        this.fechaComienzo = fechaComienzo;
    }

    public Calendar getFechaComienzo() {
        return fechaComienzo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "ProfesorInterino{" + super.toString() + " fechaComienzo=" + fechaComienzo + '}';
    }
    
    
}
