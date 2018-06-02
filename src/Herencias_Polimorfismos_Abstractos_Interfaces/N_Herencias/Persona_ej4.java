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
public class Persona_ej4 {
    protected String nombre;
    protected int edad;

    public Persona_ej4(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona_ej4() {
        this.nombre = "";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona_ej4{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
    
}
