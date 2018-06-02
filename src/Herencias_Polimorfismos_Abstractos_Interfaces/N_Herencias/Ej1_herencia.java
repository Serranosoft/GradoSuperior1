/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.N_Herencias;

public class Ej1_herencia {

    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Mario", "123456");
        Empleado empleado = new Empleado(4000, "Pepe", "654321");
        Consultor consultor = new Consultor(20, 34.5, "Pablo", "444444");

        empleado.setPuesto("Director");
        
        System.out.println(trabajador);
        System.out.println(empleado);
        System.out.println(consultor);
        
        double pagaEmpleado = empleado.calcularPaga();
        double pagaConsultor = consultor.calcularPaga();
                
        System.out.println("Paga empleado: " + pagaEmpleado);
        System.out.println("Paga consultor: " + pagaConsultor);
    }

}
