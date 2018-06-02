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
public class Operaciones_Ejerc4 {

    private double promedio;
    private double seg_mayor;
    private double menor;
    private double mayor;
    private double seg_menor;

    public Operaciones_Ejerc4() {
        this.menor = 100;
        this.mayor = 0;
        this.promedio = 0;
        this.seg_mayor = 0;
        this.seg_menor = 100;
    }

    public void mostrar(double[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%n %8.2f", v[i]);

        }
        System.out.println("");
    }

    public void max(double[] v) {
        System.out.println("");
        System.out.print("El máximo es: ");

        for (int i = 0; i < v.length; i++) {
            if (v[i] > this.mayor) {
                this.mayor = v[i];
            }
        }
        System.out.printf("%.2f %n", this.mayor);
    }

    public void min(double[] v) {
        System.out.print("El minimo es: ");
        for (int i = 0; i < v.length; i++) {
            if (v[i] < this.menor) {
                this.menor = v[i];
            }
        }
        System.out.printf("%.2f %n", this.menor);
    }

    public void media(double[] v) {
        System.out.print("La media es: ");
        for (int i = 0; i < v.length; i++) {
            this.promedio += v[i];

        }
        this.promedio /= v.length;
        System.out.printf("%.2f %n", this.promedio);
    }

    public void diferencia(double[] v) {

        for (int i = 0; i < v.length; i++) {

            if (v[i] > this.seg_mayor && v[i] != this.mayor) {
                this.seg_mayor = v[i];
            }
            if (v[i] < this.seg_menor && v[i] != this.menor) {
                this.seg_menor = v[i];
            }
        }

        System.out.printf("%n La diferencia entre el segundo numero mayor y el segundo menor es: %.2f ", (this.seg_mayor - this.seg_menor));
        System.out.printf("%n", this.seg_mayor);
        System.out.printf("%n", this.seg_menor);

    }
    
    

}
