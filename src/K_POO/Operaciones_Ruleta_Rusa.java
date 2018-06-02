/*
La ruleta rusa:

Crear un programa donde haya una lista de jugadores, especificados por teclado, donde cada jugador
tendrá los atributos:

estado(0 = muerto, 1 = vivo);
yo_juego (0 = no, 1 = si);
identificador (numero entero según orden de creación).

Asignar a estado y a yo_juego un valor aleatorio.

Crear un método en el main que sea jugador, asignandole valores y que muestre:

Ronda 1:

    Jugador 1: He sobrevivido!
    Jugador 2: Muerto.
    Jugador 3: No juego.

Admitir rondas hasta que no hayan jugadores.
 */
package K_POO;

/**
 *
 * @author alumno
 */
public class Operaciones_Ruleta_Rusa {
    
    private byte estado;
    private byte yo_juego;
    private int identificador;

    public Operaciones_Ruleta_Rusa() {
        this.estado = 1;
        this.yo_juego = 1;
        this.identificador = 0;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public void setYo_juego(byte yo_juego) {
        this.yo_juego = yo_juego;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public byte getEstado() {
        return estado;
    }

    public byte getYo_juego() {
        return yo_juego;
    }

    public int getIdentificador() {
        return identificador;
    }
    
    
    
    
    
    
    
    
    
    
}
