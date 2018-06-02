/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.P_Abstractos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author miguelbepr
 */
public class Libre extends Alumno{
    private List listaAsignatura;
    private double precioPorHora;
    private int noHorasDiarias;

    public Libre(String nombre, int edad, int curso, int nivelAcademico, int noHorasDiarias) {
        super(nombre, edad, curso, nivelAcademico);
        this.noHorasDiarias = noHorasDiarias;
        pedirAsignaturas();
    }

    
    
    public void pedirAsignaturas(){
        Scanner sc = new Scanner(System.in);
        String asig;
        listaAsignatura = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce asignatura: ");
            asig = sc.nextLine();
            listaAsignatura.add(asig);
        }
    }

    @Override
    public double pagomensual() {
        return precioPorHora * noHorasDiarias * 30;
    }

    
    public void mostrarAsignaturas() {
        for (Object object : listaAsignatura) {
            System.out.println(object);
        }
    }
    
    @Override
    public String getAsignaturas(){
        String asignaturas = "";
        for (Object asig : listaAsignatura) {
            asignaturas += asig + " ";
        }
        return asignaturas;
    }
    
    
    
}
