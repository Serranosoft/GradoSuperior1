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
public interface ISurtidor{
    
    abstract public void vender (int litros, double precio_litro);
    abstract public void vender (double importe, double precio_litro);
    abstract public void mostrar();
    
    
    
}
