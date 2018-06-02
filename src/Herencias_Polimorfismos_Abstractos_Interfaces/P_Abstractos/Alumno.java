/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.P_Abstractos;

/**
 *
 * @author miguelbepr
 */
abstract public class Alumno extends Persona{
    protected int curso;
    protected int nivelAcademico;

    public Alumno(String nombre, int edad, int curso, int nivelAcademico) {
        super(nombre, edad);
        this.curso = curso;
        this.nivelAcademico = nivelAcademico;
    }
    
    public void cambiarCurso(int curso){
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" + super.toString() + ", curso=" + curso + ", nivelAcademico=" + nivelAcademico + '}';
    }
    
    public abstract double pagomensual();
    
    public abstract String getAsignaturas();
    
    
}
