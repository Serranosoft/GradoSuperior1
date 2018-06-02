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
public class Ejerc5_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operaciones_Ejerc5 t1 = new Operaciones_Ejerc5("Paul Allen", 5, 3, 150);
        Operaciones_Ejerc5 t2 = new Operaciones_Ejerc5("Bill Gates", 45, 50);
        Operaciones_Ejerc5 t3 = new Operaciones_Ejerc5("Steve Jobs", 50);
        
        t2.setImporte_diario(300);
        
        t3.setClientes_atendidos(100);
        t3.setImporte_diario(2000);
        
        t1.anual();
        t2.anual();
        t3.anual();
        
        
        t1.media();
        t2.media();
        t3.media();
        
        
        
        
        
        
        
               
        
    }
    
}
