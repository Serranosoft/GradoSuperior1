/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencias_Polimorfismos_Abstractos_Interfaces.N_Herencias;


public class Figura {

    protected String nombre;
    protected double area;
    protected double perimetro;

    public Figura(String nombre, double area, double perimetro) {
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
    }

    public String getNombre() {
        return nombre;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", area=" + area + ", perimetro=" + perimetro;
    }

    
}
