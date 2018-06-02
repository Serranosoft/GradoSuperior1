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
public class SurSuper extends Surtidor{

    public SurSuper(int tipo, int refDeposito) {
        super(tipo, refDeposito);
    }

    @Override
    public String mostrar() {
        return "Tipo de combustible: Super, Litros despachados: " + this.litrosVendidos + ""
                + ", cantidad recaudada: " + this.recaudacion +"\n";
    }

    
    
}
