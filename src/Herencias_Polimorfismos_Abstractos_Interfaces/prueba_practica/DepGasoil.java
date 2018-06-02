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
public class DepGasoil extends Deposito{

    public DepGasoil(double litros, double precio) {
        super(litros, precio);
    }

    
    @Override
    public String mostrarEstado() {
        return "El combustible gasoil contiene " +this.litros +" litros a un precio por litro de " +this.precio +" €";
    }
    
    
    
}
