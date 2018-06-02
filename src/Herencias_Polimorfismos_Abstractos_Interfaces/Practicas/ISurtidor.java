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
public interface ISurtidor {
    abstract void vender(int litros, double precioLitro);
    abstract void vender(double importe, double precioLitro);
    abstract String mostrar();
}
