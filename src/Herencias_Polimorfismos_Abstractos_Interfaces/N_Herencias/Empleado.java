/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.N_Herencias;

/**
 *
 * @author josejina
 */
public class Empleado extends Trabajador {
    private double sueldo;
    private double impuesto;
    private final int PAGAS = 14;

    public Empleado(double sueldo, String nombre, String nss) {
        super(nombre, nss);
        this.sueldo = sueldo;
        this.impuesto = 0.21*sueldo;
    }
    
    public double calcularPaga(){
        return (sueldo-impuesto) / PAGAS; 
    }

    @Override
    public String toString() {
        return "Empleado: " + super.toString() + "sueldo=" + sueldo + ", impuesto=" + impuesto;
    }
    
    
}
