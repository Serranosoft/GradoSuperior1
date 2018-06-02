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
abstract public class Surtidor implements ISurtidor{
    
    protected double litros_vendidos;
    protected int tipo;
    protected double recaudacion;
    protected int ref_depos;

    public Surtidor(int tipo, int ref_depos) {
        this.tipo = tipo;
        this.ref_depos = ref_depos;
        this.litros_vendidos = 0;
        this.recaudacion = 0;
    }
    
    @Override
    public void vender(int litros, double precio_litro) {
        
        
        
        
    }
    
    public void vender(double importe, double precio_litro){
        
    }
    
    abstract public void mostrar();

    public double getLitros_vendidos() {
        return litros_vendidos;
    }

    public int getTipo() {
        return tipo;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public int getRef_depos() {
        return ref_depos;
    }
    
    


    
    
    
    
    
    
}
