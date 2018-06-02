/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_Polimorfismos_Abstractos_Interfaces.prueba_practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Gasolinera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int opc = 0;

        List<Deposito> depositos = new ArrayList<>();
        List<Surtidor> surtidores = new ArrayList<>();

        configurar(surtidores, depositos, sc);

        do {
            System.out.println(menu());
            System.out.println("Escoge una opción");
            opc = sc.nextInt();

            switch (opc) {

                case 1:
                    repostar(surtidores, depositos, sc);
                    break;

                case 2:
                    estadoDep(depositos);
                    break;

                case 3:
                    estadoSur(surtidores);
                    break;
                case 4:
                    rellenar(surtidores, depositos, sc);
                    break;

            }

        } while (opc != 4);

    }

    public static void configurar(List<Surtidor> surtidores, List<Deposito> depositos, Scanner sc) {
        int num;
        for (int i = 0; i < 5; i++) {

            num = (int) (Math.random() * 3) + 1;
            switch (num) {

                case 1:
                    Surtidor sursuper = new SurSuper(1, 0);
                    surtidores.add(sursuper);
                    break;
                case 2:
                    Surtidor sursinplomo = new SurSinPlomo(2, 1);
                    surtidores.add(sursinplomo);
                    break;
                case 3:
                    Surtidor surgasoil = new SurGasoil(3, 2);
                    surtidores.add(surgasoil);
                    break;

            }
        }
        System.out.println("Introduce el precio del deposito super");
        int precio1 = sc.nextInt();
        Deposito depsuper = new DepSuper(20000, precio1);
        depositos.add(depsuper);
        
        
        System.out.println("Introduce el precio del deposito gasoil");
        int precio2 = sc.nextInt();
        Deposito depsinplomo = new DepSinPlomo(20000, precio2);
        depositos.add(depsinplomo);
        
        System.out.println("Introduce el precio del deposito sin plomo");
        int precio3 = sc.nextInt();
        Deposito depgasoil = new DepGasoil(20000, precio3);
        depositos.add(depgasoil);
        
        
    }
    
    

    private static String menu() {
        String menu = ""
                + "1. REPOSTAR EN UN SURTIDOR \n"
                + "2. VER ESTADO DE LOS DEPOSITOS \n"
                + "3. VER ESTADO DE LOS SURTIDORES \n"
                + "4. RELLENAR LOS DEPOSITOS \n"
                + "5. SALIR\n";

        return menu;

    }

    private static void repostar(List<Surtidor> surtidores, List<Deposito> depositos, Scanner sc) {
        int opc = 0;
        int contador = 1;
        double repostar = 0;
        
        int litros_repostar = 0;
        for (Surtidor s : surtidores) {
            System.out.print(contador + ". ");
            s.mostrar();
            contador++;
        }
        System.out.println("Escoge un surtidor para repostarlo");
        int surop = sc.nextInt() -1;
        System.out.println(""
                + "1. POR IMPORTE\n"
                + "2. POR LITROS\n");

        System.out.print("Escoge una opcion");
        opc = sc.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Introduce el importe a repostar");
                repostar = sc.nextInt();
                Surtidor sur = surtidores.get(surop);
                Deposito dep = depositos.get(sur.getRef_depos());

                int litros = (int) (repostar / dep.getPrecio());

                surtidores.get(surop).vender(repostar, dep.getPrecio());

                System.out.println("Ha repostado " + litros + " litros");

                depositos.get(surop).setLitros(dep.getLitros() - litros);
                break;
            case 2:
                System.out.println("Introduce los litros a repostar");
                litros_repostar = sc.nextInt();
                sur = surtidores.get(surop);
                dep = depositos.get(sur.getRef_depos());
                surtidores.get(surop).vender(litros_repostar, dep.getPrecio());

                System.out.println("Ha repostado" + litros_repostar + " litros");

                depositos.get(surop).setLitros(dep.getLitros() - litros_repostar);
        }

    }

    private static void estadoDep(List<Deposito> depositos) {

        for (Deposito d : depositos) {
            System.out.println(d.mostrarEstado());
        }
    }

    private static void estadoSur(List<Surtidor> surtidores) {
        for (Surtidor s : surtidores) {
            s.mostrar();
        }
    }

    private static void rellenar(List<Surtidor> surtidores, List<Deposito> depositos, Scanner sc) {
        int opc = 0;
        do {

            System.out.println(""
                    + "1. Gasoil"
                    + "2. Sin Plomo"
                    + "3. Super"
                    + "4. Salir");

            opc = sc.nextInt();
            
            switch(opc){
                
                case 1:
                    depositos.get(0).setLitros(20000);
                    System.out.println("Se ha rellenado el deposito de gasoil");
                    break;
                case 2:
                    depositos.get(1).setLitros(20000);
                    System.out.println("Se ha rellenado el deposito sin plomo");
                    break;
                case 3:
                    depositos.get(2).setLitros(20000);
                    System.out.println("Se ha rellenado el deposito super");
                    break;
                case 4:
                    break;
                       
            }

        } while (opc != 4);

    }

}
