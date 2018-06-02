/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores.Practica5;

import java.util.Comparator;

/**
 *
 * @author alumno
 */
class Coche_Practica5 implements Comparable<Coche_Practica5>{
    
    private String marca;
    private String modelo;
    private int cilindrada;
    

    public Coche_Practica5() {
    }

    public Coche_Practica5(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return "Coche_Practica5{" + "marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + '}';
    }

    


    @Override
    public int compareTo(Coche_Practica5 o) {
        return this.modelo.compareTo(o.modelo);
    }
    
    
    
    
}
