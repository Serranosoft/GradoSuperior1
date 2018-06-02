/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencias_Polimorfismos_Abstractos_Interfaces.N_Herencias;


public class Ej3_herencia {

    public static void main(String[] args) {
        Figura f = new Figura("Figura", 2, 3);
        
        Cuadrado c = new Cuadrado(2, "cuadradito", 0, 0);
        Rectangulo r = new Rectangulo(2, 2, "rectangulo", 0, 0);
        
        c.setLado(3);
        c.setArea();
        c.setPerimetro();
        
        r.setAltura(5);
        r.setBase(3);
        r.setArea();
        r.setPerimetro();
        
        System.out.println(c);
        System.out.println(r);
    }

}
