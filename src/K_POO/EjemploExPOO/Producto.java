/*
Supermercado.
 */
package K_POO.EjemploExPOO;

/**
 *
 * @author alumno
 */
public class Producto {
    
    private String nombre;
    private double precioBase;
    private double precioVenta;

    public Producto(String nombre, double precioBase, double precioVenta) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.precioVenta = precioVenta;
    }
    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precioBase=" + precioBase + ", precioVenta=" + precioVenta + '}';
    }
    
    
    
    
    
    
    
}
