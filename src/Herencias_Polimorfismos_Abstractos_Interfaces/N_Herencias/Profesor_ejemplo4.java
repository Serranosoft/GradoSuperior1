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
public class Profesor_ejemplo4 extends Persona_ej4{
    private String id;

    public Profesor_ejemplo4(String id, String nombre, int edad) {
        super(nombre, edad);
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Profesor_ejemplo4{" + super.toString() + " id=" + id + '}';
    }
    
    
}
