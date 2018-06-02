/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencias_Polimorfismos_Abstractos_Interfaces.P_Abstractos;


public abstract class Figura {

    protected int x;
    protected int y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract double area();

    public void muestraCoordenadas(){
        System.out.println("{" + x + ", " + y + "}");
    }
}
