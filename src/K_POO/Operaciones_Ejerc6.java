/*
Crear un menú donde se pida:

1. Insertar un empleado a una lista de objetos de tipo empleado (pide el nombre, dni, sueldo y cargo).
2. Mostrar la ficha de un empleado por su posición o dni.
3. Listar todas las fichas de una vez de la lista.
4. Eliminar un empleado identificado por su posición o dni.
5. Salir del programa.
 */
package K_POO;

/**
 *
 * @author alumno
 */
public class Operaciones_Ejerc6 {
    
    private String nombre;
    private long dni;
    private double sueldo;
    private String cargo;

    public Operaciones_Ejerc6(String nombre, long dni, double sueldo, String cargo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Operaciones_Ejerc6{" + "nombre=" + nombre + ", dni=" + dni + ", sueldo=" + sueldo + ", cargo=" + cargo + '}';
    }
    
    


    
    
   
  
}
