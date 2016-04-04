import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class Segment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment
{
    // instance variables - replace the example below with your own
    private int posicionX;
    private int posicionY;
    private int direccion;
    private Color color;
    private int LONGITUD_SEGMENTO = 4;

    /**
     * Constructor for objects of class Segment
     */
    public Segment(int posX, int posY, int direccion, Color color)
    {
        posicionX = posX;
        posicionY = posY;
        this.direccion = direccion;
        this.color = color;
    }

    /**
     * dibuja un segmento en el lienzo indicado por parametro
     */
    public void dibujar(Canvas lienzo)
    {
        Pen pen = new Pen(posicionX, posicionY, lienzo);
        pen.setColor(color);
        pen.turn(direccion);
        pen.move(LONGITUD_SEGMENTO);
    }
    
    public void borrar(){
        int a;
    }
    
    /**
     * Devuelve la posicion inicial del segmento
     */
    public int getPosicionInicialX(){
        int posInX = posicionX;
        return posInX;
    }
    
    /**
     * Devuelve la posicion inicial del segmento
     */
    public int getPosicionInicialY(){
        int posInY = posicionY;
        return posInY;
    }
    
    /**
     * Devuelve la posicion inicial del segmento
     */
    public int getPosicionFinalX(){
        int posInX = posicionX + LONGITUD_SEGMENTO;
        return posInX;
    }
    
    /**
     * Devuelve la posicion inicial del segmento
     */
    public int getPosicionFinalY(){
        int posInY = posicionY + LONGITUD_SEGMENTO;
        return posInY;
    }
}
