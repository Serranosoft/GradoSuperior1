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
public class Rectangulo extends Figura{
    private String nombre;
    private double lado;
    private double base;

    public Rectangulo(String nombre, double lado, double base, int x, int y) {
        super(x, y);
        this.nombre = nombre;
        this.lado = lado;
        this.base = base;
    }

    @Override
    public double area(){
        return lado * base;
    }
}
