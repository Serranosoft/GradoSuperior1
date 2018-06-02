/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencias_Polimorfismos_Abstractos_Interfaces.P_Abstractos;


public class Ej1 {

    public static void main(String[] args) {
        //Figura f = new Figura(0, 0); mal, no se puede instanciar clase abstracta
        
        Figura circ = new Circulo("circulo", 2, 3, 3);
        Figura rect = new Rectangulo("rectangulo", 1, 2, 3, 4);
        
        System.out.println(circ.area());
        System.out.println(rect.area());
        circ.muestraCoordenadas();
        rect.muestraCoordenadas();
        
    }

}
