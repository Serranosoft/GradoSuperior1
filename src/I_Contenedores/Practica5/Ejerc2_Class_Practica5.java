/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores.Practica5;

/**
 *
 * @author alumno
 */
public class Ejerc2_Class_Practica5 implements Comparable<Ejerc2_Class_Practica5>{
    
    private String nombre;
    private double precio;
    private String marca;
    

    public Ejerc2_Class_Practica5() {
        
    }

    public Ejerc2_Class_Practica5(String nombre, double precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }
    
    

    @Override
    public String toString() {
        return "Los muebles son : " + "nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + '}';
    }
    // Con este código autogenerado comparamos el nombre de un objeto de la lista con el nombre impuesto por código
    @Override
    public int compareTo(Ejerc2_Class_Practica5 o) {
        return this.nombre.compareTo(o.nombre);
    }
    
    
    
    
    
    
}
