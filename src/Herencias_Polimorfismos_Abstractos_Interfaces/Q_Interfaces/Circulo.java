/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.Q_Interfaces;

/**
 *
 * @author miguelbepr
 */
public class Circulo implements Figura, Grafico{
    private double radio;
    private static double PI = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public void miGrafico() {
        System.out.println("Mi circulo");
    }

    @Override
    public String dibujar() {
        return "circulo";
    }
    
    
}
