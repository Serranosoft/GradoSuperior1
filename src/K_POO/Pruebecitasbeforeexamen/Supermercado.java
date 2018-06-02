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
public class Supermercado {

    public static final int MAX_PROD = 5;
    private Producto[] productos;
    private String nombre;
    private long cif;
    private double gananciasBase;
    private double gananciasVentas;
    private int nProd;

    public Supermercado(String nombre, long cif) {
        this.productos = new Producto[MAX_PROD];
        this.nombre = nombre;
        this.cif = cif;
        this.gananciasBase = 0.0;
        this.gananciasVentas = 0.0;
        this.nProd = 0;
    }

    public static int getMAX_PROD() {
        return MAX_PROD;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCif() {
        return cif;
    }

    public double getGananciasBase() {
        return gananciasBase;
    }

    public double getGananciasVentas() {
        return gananciasVentas;
    }

    public int getnProd() {
        return nProd;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCif(long cif) {
        this.cif = cif;
    }

    public void setGananciasBase(double gananciasBase) {
        this.gananciasBase = gananciasBase;
    }

    public void setGananciasVentas(double gananciasVentas) {
        this.gananciasVentas = gananciasVentas;
    }

    public void setnProd(int nProd) {
        this.nProd = nProd;
    }

    boolean addProd(Producto nuevo_producto) {

        if (nuevo_producto == null) {

            return false;
        }

        try {

            this.productos[this.nProd] = nuevo_producto;

            this.gananciasBase += this.productos[this.nProd].getPrecioBase();

            this.nProd++;

            return true;
        } catch (ArrayIndexOutOfBoundsException aiobe) {

            System.err.println("Tas pasao");

            return false;
        }

    }

    public boolean delProd(int pos) {

        if (pos < 0 && pos > this.nProd) {
            return false;
        }

        this.gananciasVentas += this.productos[pos].getPrecioVentas();

        for (int i = this.nProd - 1; i < pos; i--) {

            this.productos[i - 1] = this.productos[i];

        }

        this.nProd--;
        this.productos[this.nProd] = null;

        return true;

    }
    
    public void cerrar(){
        
        for (int i = this.nProd-1; i >=0; i--) {
            this.productos[i] = null;
            this.nProd--;
        }
        
    }

}
