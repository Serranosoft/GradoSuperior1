/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores;

/**
 *
 * @author alumno
 */
public class Manzana {
    
    private Calibre tamaño;
    
    public Manzana(Calibre tamaño) {
        this.tamaño = tamaño;
    }

    public void setTamaño(Calibre tamaño) {
        this.tamaño = tamaño;
    }

    public Calibre getTamaño() {
        return tamaño;
    }

    @Override
    public String toString() {
        return "Manzana{" + "tama\u00f1o=" + tamaño + '}';
    }
    
    
    
    
    
}
