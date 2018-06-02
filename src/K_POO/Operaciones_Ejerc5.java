/*
Crear 3 tiendas, que contengan el nombre del encargado, el número de empleados que tiene y el número
de clientes atendidos y el importe diario obtenido. 


Calcular el importe medio gastado por cada cliente, el importe anual neto, sabiendo que hay
que restarle el IVA y el 10% que se lleva hacienda.
 */
package K_POO;

/**
 *
 * @author alumno
 */
public class Operaciones_Ejerc5 {
    
    private String nombre;
    private int num_empleados;
    private int clientes_atendidos;
    private int importe_diario;
    private double medio;
    private double anual;

    public Operaciones_Ejerc5(String nombre, int num_empleados, int clientes_atendidos, int importe_diario) {
        this.nombre = nombre;
        this.num_empleados = num_empleados;
        this.clientes_atendidos = clientes_atendidos;
        this.importe_diario = importe_diario;
        this.anual = 0;
        this.medio = 0;
    }

    public Operaciones_Ejerc5(String nombre, int num_empleados, int clientes_atendidos) {
        this.nombre = nombre;
        this.num_empleados = num_empleados;
        this.clientes_atendidos = clientes_atendidos;
        this.importe_diario = 0;
        this.anual = 0;
        this.medio = 0;
    }

    public Operaciones_Ejerc5(String nombre, int num_empleados) {
        this.nombre = nombre;
        this.num_empleados = num_empleados;
        this.clientes_atendidos = 0;
        this.importe_diario = 0;
        this.anual = 0;
        this.medio = 0;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNum_empleados(int num_empleados) {
        this.num_empleados = num_empleados;
    }

    public void setClientes_atendidos(int clientes_atendidos) {
        this.clientes_atendidos = clientes_atendidos;
    }

    public void setImporte_diario(int importe_diario) {
        this.importe_diario = importe_diario;
    }
    
    public void anual(){
        System.out.println("");   
        this.anual = this.importe_diario * 365;
        double neto = (this.anual * 0.21) + (this.anual * 0.10);
        this.anual -= neto; 
       
        System.out.println("El importe anual restandole el IVA y el porcentaje que se lleva hacienda es: " +this.anual);
    }
    
    public void media(){
        
        this.importe_diario /= this.clientes_atendidos;
        
        System.out.printf("%d %n", this.importe_diario);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}


