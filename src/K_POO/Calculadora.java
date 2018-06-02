/*
Ejercicio 1: Crear una calculadora que tenga las operaciones de suma, resta, multiplicacion, división, raiz cuadrada y elevar un numero a una potencia, que tenga los siguientes métodos:

- Imprimir menú
- Realizar las operaciones asignadas.
- Mostrar todas operaciones realizadas hasta el momento.
 */
package K_POO;

/**
 *
 * @author alumno
 */
public class Calculadora {
    
    private double suma;
    private double resta;
    private double producto;
    private double division;
    private double raiz;
    private double elevar;
    
    private boolean b_suma;
    private boolean b_resta;
    private boolean b_prod;
    private boolean b_div;
    private boolean b_raiz;
    private boolean b_elevar;

    public Calculadora(double suma, double resta, double producto, double division, double raiz, double elevar, boolean b_suma, boolean b_resta, boolean b_prod, boolean b_div, boolean b_raiz, boolean b_elevar) {
        this.suma = suma;
        this.resta = resta;
        this.producto = producto;
        this.division = division;
        this.raiz = raiz;
        this.elevar = elevar;
        this.b_suma = b_suma;
        this.b_resta = b_resta;
        this.b_prod = b_prod;
        this.b_div = b_div;
        this.b_raiz = b_raiz;
        this.b_elevar = b_elevar;
    }

    public Calculadora() {
        this.suma = 0;
        this.resta = 0;
        this.producto = 0;
        this.division = 0;
        this.raiz = 0;
        this.elevar = 0;
        this.b_suma = false;
        this.b_resta = false;
        this.b_prod = false;
        this.b_div = false;
        this.b_raiz = false;
        this.b_elevar = false;
    }
    // GETTER

    public double getSuma() {
        return suma;
    }

    public double getResta() {
        return resta;
    }

    public double getProducto() {
        return producto;
    }

    public double getDivision() {
        return division;
    }

    public double getRaiz() {
        return raiz;
    }

    public double getElevar() {
        return elevar;
    }

    public boolean isB_suma() {
        return b_suma;
    }

    public boolean isB_resta() {
        return b_resta;
    }

    public boolean isB_prod() {
        return b_prod;
    }

    public boolean isB_div() {
        return b_div;
    }

    public boolean isB_raiz() {
        return b_raiz;
    }

    public boolean isB_elevar() {
        return b_elevar;
    }
    
    
    // SETTER

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public void setResta(double resta) {
        this.resta = resta;
    }

    public void setProducto(double producto) {
        this.producto = producto;
    }

    public void setDivision(double division) {
        this.division = division;
    }

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    public void setElevar(double elevar) {
        this.elevar = elevar;
    }

    public void setB_suma(boolean b_suma) {
        this.b_suma = b_suma;
    }

    public void setB_resta(boolean b_resta) {
        this.b_resta = b_resta;
    }

    public void setB_prod(boolean b_prod) {
        this.b_prod = b_prod;
    }

    public void setB_div(boolean b_div) {
        this.b_div = b_div;
    }

    public void setB_raiz(boolean b_raiz) {
        this.b_raiz = b_raiz;
    }

    public void setB_elevar(boolean b_elevar) {
        this.b_elevar = b_elevar;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "suma=" + suma + ", resta=" + resta + ", producto=" + producto + ", division=" + division + ", raiz=" + raiz + ", elevar=" + elevar + ", b_suma=" + b_suma + ", b_resta=" + b_resta + ", b_prod=" + b_prod + ", b_div=" + b_div + ", b_raiz=" + b_raiz + ", b_elevar=" + b_elevar + '}';
    }
    
    public String menu(){
        String menu = ""+
           "******************************************\n" +
           "* 1. SUMA                                *\n" +
           "* 2. RESTA                               *\n" +
           "* 3. PRODUCTO                            *\n" +
           "* 4. DIVISION                            *\n" +
           "* 5. RAIZ CUADRADA                       *\n" +
           "* 6. POTENCIA                            *\n" +
           "* 7. SALIR                               *\n" +
           "******************************************";
        return menu;
    }
    
    public void suma (int n1, int n2) {
        this.suma = n1 + n2;
    }
    
    
            
}
