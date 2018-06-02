/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.N_Herencias;

import java.util.List;

/**
 *
 * @author miguelbepr
 */
public class Alumno extends Persona{
    private List<String> asignaturas;
    private String num_alumno;

    public Alumno(List<String> asignaturas, String num_alumno, String nombre, String direccion, int edad) {
        super(nombre, direccion, edad);
        this.asignaturas = asignaturas;
        this.num_alumno = num_alumno;
    }

    public List<String> getAsignaturas() {
        return asignaturas;
    }

    public String getNum_alumno() {
        return num_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "asignaturas=" + asignaturas + ", num_alumno=" + num_alumno +
                ", nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad +'}';
    }
    
    
}
