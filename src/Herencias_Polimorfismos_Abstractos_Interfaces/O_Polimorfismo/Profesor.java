/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.O_Polimorfismo;

public class Profesor extends Persona {

    private int idProf;

    public Profesor(String nombre, int edad, int idProf) {
        super(nombre, edad);
        this.idProf = idProf;
    }

    @Override
    public String toString() {
        return "Profesor_Ej1{" + super.toString() + "\nidProf=" + idProf + '}';
    }

}
