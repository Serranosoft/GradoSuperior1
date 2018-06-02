/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores.Practica5;

/**
 *
 * @author Manuel
 */
public class Dino_Practica5  implements Comparable<Dino_Practica5> {
    
    private String nombre;
    private double peso;
    private int años;

    public Dino_Practica5() {
    }

    public Dino_Practica5(String nombre, double peso, int años) {
        this.nombre = nombre;
        this.peso = peso;
        this.años = años;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getAños() {
        return años;
    }

    
    
    
    @Override
    public String toString() {
        return "Dino_Practica5{" + "nombre=" + nombre + ", peso=" + peso + ", años=" + años + '}';
    }

    @Override
    public int compareTo(Dino_Practica5 o) {
        return this.nombre.compareTo(o.nombre);
    }
    
    
    
    
    
}
