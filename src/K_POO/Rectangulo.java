/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_POO;

/**
 *
 * @author alumno
 */
public class Rectangulo {

    private int x;
    private int y;
    private double ancho;
    private double largo;
    
    // Método Constructor
    
    public Rectangulo(int x, int y, double ancho, double largo){      // Ojo, no retorna nada
         this.x = x;
         this.y = y;
         this.ancho = ancho;
         this.largo = largo;
    }
    
    
    public void mostrar(){
        
        System.out.printf("Coordenadas (%d,%d) %n", this.x, this.y);
        System.out.printf("%s (ancho=%.2f, largo=%.2f) = %.2f %n", "Perimetro", this.ancho, this.largo, 
        this.ancho*this.largo);
        
    }
    // SETTERS
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setAncho (double ancho){
        this.ancho = ancho;
    }
    public void setLargo(double largo){
        this.largo = largo;
    }
    // GETTERS
    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public double getAncho(){
        return this.ancho;
    }
    public double getLargo(){
        return this.largo;
    }
}
