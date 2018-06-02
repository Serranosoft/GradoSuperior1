/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencias_Polimorfismos_Abstractos_Interfaces.Q_Interfaces;


public class Ej1 {

    public static void main(String[] args) {
        //No se puede instanciar Figura (new Figura...)
        Figura circ = new Circulo(25);
        Figura cuad = new Cuadrado(25);
        Grafico circ2 = new Circulo(25);            //Metodos de grafico
        
        System.out.println(circ);
        System.out.println(cuad);
        
        System.out.println(circ.area());
        System.out.println(circ.perimetro());
        System.out.println(cuad.area());
        System.out.println(cuad.perimetro());
        
        //Lista polimorfica
        Figura figuras[] = new Figura[5];
        
        figuras[0] = new Circulo(34);
        figuras[1] = new Cuadrado(34);
        figuras[2] = new Circulo(3);
        figuras[3] = new Cuadrado(34);
        figuras[4] = new Cuadrado(34);
        
        circ2.dibujar();
    }

    private double totalArea(Figura[] v){
        double t = 0;
        for (int i = 0; i < v.length; i++) {
            t += v[i].area();
        }
        return t;
    }
}
