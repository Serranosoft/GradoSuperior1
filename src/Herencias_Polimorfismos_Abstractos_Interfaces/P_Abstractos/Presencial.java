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
public class Presencial extends Alumno{
    private double matriculaCurso;
    private double plusPorConvocatoria;
    private int noConvocatoria;

    public Presencial(String nombre, int edad, int curso, int nivelAcademico, double matriculaCurso, double plusPorConvocatoria, int noConvocatoria) {
        super(nombre, edad, curso, nivelAcademico);
        this.matriculaCurso = matriculaCurso;
        this.plusPorConvocatoria = plusPorConvocatoria;
        this.noConvocatoria = noConvocatoria;
    }
    
    @Override
    public double pagomensual() {
        return (matriculaCurso + plusPorConvocatoria * noConvocatoria)/12;
    }
    
    @Override
    public String getAsignaturas(){
        return "todas las del curso" + curso;
    }
    
}
