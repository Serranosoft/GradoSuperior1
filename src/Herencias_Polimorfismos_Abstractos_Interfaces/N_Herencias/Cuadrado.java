/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.N_Herencias;

import java.awt.Panel;

/**
 *
 * @author miguelbepr
 */
public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado, String nombre, double area, double perimetro) {
        super(nombre, area, perimetro);
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArea() {
        this.area = lado * lado;
    }

    public void setPerimetro() {
            this.perimetro = 4 * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + super.toString() + " lado=" + lado + '}';
    }
    
    
    
}
