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
public class SurSinPlomo extends Surtidor{

    public SurSinPlomo(int tipo, int ref_depos) {
        super(tipo, ref_depos);
    }

    @Override
    public void mostrar() {
        System.out.println("El tipo de combustible es: " +this.tipo +" tiene " +this.litros_vendidos +" y la cantidad recaudada es de " +this.recaudacion);
    }
    
    
    
    
    
}
