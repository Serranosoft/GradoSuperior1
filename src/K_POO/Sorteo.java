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
public class Sorteo {
    /* Declaro un valor constante para no permitir cambiarlo mas adelante*/
    public static final int MAX_JUG = 20000;
    /* Declaro todos los atributos */
    private Jugadores[] lista_jugadores; 

    private int jugadores;
    private long boleto_ganador;
    private String titulo;
    private double[] importes;
    private double precio_boleto;
    /* Incluyo el constructor dando los valores */
    public Sorteo() {
        this.lista_jugadores = new Jugadores[MAX_JUG];
        this.jugadores = 0;
        this.boleto_ganador = 0;
        this.titulo = "";
        this.importes = new double[4];
        this.precio_boleto = 0.0;
    }
    /* Creo todos los SETTERS para usarlo luego en el main */
    public void setLista_jugadores(String nombre, long boleto, int cont) {
        this.lista_jugadores[cont].setNombre(nombre);
        this.lista_jugadores[cont].setBoleto(boleto);
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public void setBoleto_ganador(long boleto_ganador) {
        this.boleto_ganador = boleto_ganador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio_boleto(double precio_boleto) {
        this.precio_boleto = precio_boleto;
    }
    /* Creo todos los getters para darle uso en el main */
    public static int getMAX_JUG() {
        return MAX_JUG;
    }

    public Jugadores[] getLista_jugadores() {
        return lista_jugadores;
    }

    public int getJugadores() {
        return jugadores;
    }

    public long getGanador() {
        return boleto_ganador;
    }

    public String getTitulo() {
        return titulo;
    }

    public double[] getImportes() {
        return importes;
    }

    public double getPrecio_boleto() {
        return precio_boleto;
    }
    /* Creo un toString() para darle uso en el main */
    @Override
    public String toString() {
        return "Sorteo{" + "lista_jugadores=" + lista_jugadores + ", precio_boleto=" + precio_boleto + '}';
    }
    /* Creamos el primer método para comprobar que se han insertado todos los importes */
    public boolean addImportes(double importe1, double importe2, double importe3, double importe4) {

        boolean comprobar = false;

        if (this.importes == null) { /*Con una condición indicamos que si los importes no esta
            inicializado comprobar devuelve falso, sino se rellena el array con los valores pasados
            por parametro*/

            comprobar = false;
        } else {
            comprobar = true;

            this.importes[0] = importe1;
            this.importes[1] = importe2;
            this.importes[2] = importe3;
            this.importes[3] = importe4;
        }

        return comprobar;
    }

    public void addJugador(int contador) {
        /* A través de un try-catch añadiamos los jugadores y si sobrepasaba el limite del array
        salta un error almacenado en iobe y sacando por pantalla "Ha sobrepasado la lista"
        */ 
        try {

            this.lista_jugadores[contador] = new Jugadores();

        } catch (ArrayIndexOutOfBoundsException iobe) {

            System.err.println("Ha sobrepasado la lista");
        }
    }

    public void listarJugadores(int i) {
        /* Con este método llamabamos a través de toString() para sacar por pantalla los jugadores
        pasamos por parametro i que sería las posiciones a través del bucle creado en el main*/
        System.out.println(this.lista_jugadores[i].toString());

    }
    
    
    public int[] getAcertantes(){
        /* Con este método a través de una sentencia condicional sacamos los acertantes del boleto
        entero, de los 4 numeros y viceversa almacenando en una array y en una posición diferente
        el numero de veces que se ha acertado cada numero
        */
        int[] prueba = new int[5];
        
        for (int i = 0; i < this.jugadores; i++) {
            if(this.lista_jugadores[i].getBoleto() == this.boleto_ganador){
                prueba[0]++;
            }
            else if(this.lista_jugadores[i].getBoleto() % 10000 == this.boleto_ganador % 10000){
                prueba[1]++;
   
            }
            else if(this.lista_jugadores[i].getBoleto() % 1000 == this.boleto_ganador % 1000){
                prueba[2]++;
            }
            else if(this.lista_jugadores[i].getBoleto() % 100 == this.boleto_ganador % 100){
                prueba[3]++;
            }
            else if(this.lista_jugadores[i].getBoleto() % 10 == this.boleto_ganador % 10){
                prueba[4]++;
            }
            
            
            
        }
        return prueba;
        
    }
    
    public void cerrar(){
        /* Con este método dejaba todos los atributos en valores vacios, el array lista_jugadores
        lo recorro con un for y pongo valor null cada posición del array, dejando todo vacio */
        
        for (int i = 0; i < this.lista_jugadores.length; i++) {
            
            this.lista_jugadores[i] = null;
            
        }
        
        this.jugadores = 0;
        this.boleto_ganador = 0;
        this.titulo = "";
        this.precio_boleto = 0.0;
        this.importes = new double[4];
    }
    
    
    
    

}
