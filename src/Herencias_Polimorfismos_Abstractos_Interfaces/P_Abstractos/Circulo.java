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
public class Circulo extends Figura{
    private String nombre;
    private double radio;

    public Circulo(String nombre, double radio, int x, int y) {
        super(x, y);
        this.nombre = nombre;
        this.radio = radio;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }
    
}
