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
public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre, double area, double perimetro) {
        super(nombre, area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArea() {
        this.area = base * altura;
    }

    public void setPerimetro() {
        this.perimetro = 2*base + 2*altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + super.toString() + " base=" + base + ", altura=" + altura + '}';
    }

    
    
    
}
