/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_POO;

/**
 *
 * @author Manuel
 */
public class Jugadores {
    /* Declaro los atributos que vamos a usar*/
    private String nombre;
    private long Boleto;
    /* Hago el constructor dando valores a los atributos */
    public Jugadores() {
        this.nombre = "";
        this.Boleto = 0;
    }
    /* Creo todos los setters necesarios */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBoleto(long Boleto) {
        this.Boleto = Boleto;
    }

    public String getNombre() {
        return nombre;
    }

    public long getBoleto() {
        return Boleto;
    }
    /* Creo el toString()*/
    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", Boleto=" + Boleto + '}';
    }
    
    
    
    
    
    
    
    
}
