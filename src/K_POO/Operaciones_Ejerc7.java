/*
Realizar una agenda donde esta clase contenga, un nombre, una fecha un teléfono y un evento.
Realizar las operaciones de insertar nuevo registro, listar agenda, seleccionar por fecha
y eliminar registro.
 */
package K_POO;

/**
 *
 * @author alumno
 */
public class Operaciones_Ejerc7 {
    
    private String nombre;
    private String fecha;
    private int telefono;
    private String evento;

    public Operaciones_Ejerc7(String nombre, String fecha, int telefono, String evento) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.telefono = telefono;
        this.evento = evento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEvento() {
        return evento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
    
    
    
    
    
    
    
    
}
