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
public abstract class Surtidor implements ISurtidor{
    protected int litrosVendidos;
    protected int tipo;
    protected double recaudacion;
    protected int refDeposito;

    public Surtidor(int tipo, int refDeposito) {
        this.litrosVendidos = 0;
        this.tipo = tipo;
        this.recaudacion = 0;
        this.refDeposito = refDeposito;
    }

    // Creamos una función vender para darle los valores a litrosVendidos y a recaudación.
    @Override
    public void vender(int litros, double precioLitro) {
        double importe = litros * precioLitro;
        this.litrosVendidos += litros;
        this.recaudacion += importe;
    }
    // Creamos una función similar a la anterior pero esta vez a través de los importes.
    @Override
    public void vender(double importe, double precioLitro) {
        int litros = (int) (importe / precioLitro);
        this.litrosVendidos += litros;
        this.recaudacion += importe;
    }

    @Override
    public abstract String mostrar();

    public int getTipo() {
        return tipo;
    }
    
    public int getLitrosVendidos() {
        return litrosVendidos;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public int getRefDeposito() {
        return refDeposito;
    }
    
    
}
