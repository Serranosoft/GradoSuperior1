/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_POO.Pruebecitasbeforeexamen;

/**
 *
 * @author alumno
 */
public class Producto {
    
    private String nombre;
    private double precioBase;
    private double precioVentas;

    public Producto(String nombre, double precioBase, double precioVentas) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.precioVentas = precioVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getPrecioVentas() {
        return precioVentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setPrecioVentas(double precioVentas) {
        this.precioVentas = precioVentas;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precioBase=" + precioBase + ", precioVentas=" + precioVentas + '}';
    }
    
    
    
}
