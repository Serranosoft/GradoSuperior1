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
public class DepSinPlomo extends Deposito{

    public DepSinPlomo(int litros, double precio) {
        super(litros, precio);
    }

    @Override
    public String mostrarEstado() {
        return "Surtidor gasolina sin plomo: Litros: " + litros + "Precio por litro: " + precio;
    }
    
    
}
