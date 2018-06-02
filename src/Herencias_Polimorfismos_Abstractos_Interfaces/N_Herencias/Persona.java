/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.N_Herencias;

/**
 *
 * @author miguelbepr
 */
public class Persona {
    protected String nombre;
    protected String direccion;
    protected int edad;

    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
    
    
}
