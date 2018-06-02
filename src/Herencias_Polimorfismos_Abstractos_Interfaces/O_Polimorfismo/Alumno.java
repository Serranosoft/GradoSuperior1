/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.O_Polimorfismo;

/**
 *
 * @author miguelbepr
 */
public class Alumno extends Persona{
    private int idAlumno;
    
    public Alumno(String nombre, int edad, int idAlumno) {
        super(nombre, edad);
        this.idAlumno = idAlumno;
    }

    @Override
    public String toString() {
        return "Alumno_Ej1{" + super.toString() + "idAlumno=" + idAlumno + '}';
    }
    
    String muestrame(){
        return "Soy un alumno\n";
    }
}
