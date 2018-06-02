/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.prueba_practica;

/**
 *
 * @author Manuel
 */
abstract public class Deposito {
    
    protected double litros;
    protected double precio;

    public Deposito(double litros, double precio) {
        this.litros = litros;
        this.precio = precio;
    }
    
    public abstract String mostrarEstado();

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    

    public double getLitros() {
        return litros;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
}
