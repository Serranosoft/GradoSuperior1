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
public class Vehiculo{
    private String marca;
    private String modelo;
    String matricula;
    String color;
    double tarifa;
    
    public void mostrar(){
        System.out.println(this.marca +", " +this.modelo +", " +this.color + ", " +this.matricula +", " +this.tarifa +", ");
    }
 
    
    /* Esto se utiliza para poder usar los atributos que estan en private, estos se denominan SETTERS */
    public void setMarca(String mar){
        this.marca = mar;
    }
    public void setModelo(String mod){
        this.modelo = mod;
    }
    
    public void setColor(String col){
        this.color = col;
    }
    
   /* GETTERS */
    public String getMatricula (){
        return this.matricula;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getColor(){
        return this.color;
    }
    public double getTarifa(){
        return this.tarifa;
    }
    
}

