/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_POO.EjemploExPOO;

/**
 *
 * @author alumno
 */
public class Supermercado {
    
    
    private String nombre;
    private long cif;
    public static final int MAX_PROD = 5;
    private Producto[] productos; // Una lista de productos
    private int nProd;
    private double gananciaBase;
    private double gananciaVenta;

    public Supermercado(String nombre, long cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.nProd = 0;
        this.gananciaBase = 0;
        this.gananciaVenta = 0;
        this.productos = new Producto[MAX_PROD]; //Lo inicializamos con el numero máximo de max_prod
    }
    //GETTER

    public String getNombre() {
        return nombre;
    }

    public long getCif() {
        return cif;
    }

    public static int getMAX_PROD() {
        return MAX_PROD;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getnProd() {
        return nProd;
    }

    public double getGananciaBase() {
        return gananciaBase;
    }

    public double getGananciaVenta() {
        return gananciaVenta;
    }
    
    
    //SETTER

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCif(long cif) {
        this.cif = cif;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void setnProd(int nProd) {
        this.nProd = nProd;
    }

    public void setGananciaBase(double gananciaBase) {
        this.gananciaBase = gananciaBase;
    }

    public void setGananciaVenta(double gananciaVenta) {
        this.gananciaVenta = gananciaVenta;
    }

 

    @Override
    public String toString() {
        return "Supermercado{" + "nombre=" + nombre + ", cif=" + cif + ", productos=" + productos + ", nProd=" + nProd + '}';
    }

    public boolean addProd(Producto nuevoProd) {
        if(nuevoProd ==null){
            return false;
        }
        
        try{
            this.productos[this.nProd] = nuevoProd; //Añade el producto en [this.nProd] que sería la ultima posicion
            
            
            // Actualizamos ganancias
            this.gananciaBase += this.productos[this.nProd].getPrecioBase();
            
            this.nProd++; //Se incrementa en uno el indice ya que se ha añadido un producto
            
            return true;
        }catch(ArrayIndexOutOfBoundsException aiobe){
            System.err.println("No se pueden insertar más productos");
            return false;
        }

    }

    public boolean delProd(int pos) {
        if(pos<0 && pos>=this.nProd){
            return false;
        }
        
        // Actualizamos ganancias
        this.gananciaVenta += this.productos[pos].getPrecioVenta();
        
        
        // Borramos el producto de la lista            
       
        for (int j=this.nProd-1; j>pos; j--) {
            this.productos[j-1] = this.productos[j];
            
        }
        this.nProd--;
        this.productos[this.nProd] = null;
        
        
        return true;
    }

    public void cerrar() {
        for (int i = this.nProd-1; i>=0; i--) {
            this.productos[i] = null;
            this.nProd--;
            
        }
        
    }
    
    
    
    

    
    
}
