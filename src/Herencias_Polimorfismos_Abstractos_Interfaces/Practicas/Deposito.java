/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.Practicas;

/**
 *
 * @author alumno
 */
public abstract class Deposito {
    protected int litros;
    protected double precio;

    public Deposito(int litros, double precio) {
        this.litros = litros;
        this.precio = precio;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public int getLitros() {
        return litros;
    }
    
    // Creo un método abstracto y luego lo implemento en las clases
    public abstract String mostrarEstado();
    
}
