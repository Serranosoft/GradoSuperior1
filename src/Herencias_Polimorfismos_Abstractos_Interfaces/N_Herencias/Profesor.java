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
public class Profesor extends Persona{
    private String num_profesor;
    private double salario;

    public Profesor(String num_profesor, double salario, String nombre, String direccion, int edad) {
        super(nombre, direccion, edad);
        this.num_profesor = num_profesor;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Profesor{" + "num_profesor=" + num_profesor + ", salario=" + salario + 
                ", nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
    
    
}
