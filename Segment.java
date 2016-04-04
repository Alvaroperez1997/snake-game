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
        pen.turnTo(direccion);
        pen.move(LONGITUD_SEGMENTO);
    }
    
    /**
     * Borra el segmento
     */
    public void borrar(Canvas lienzo){
        int a;
    }
    
    /**
     * Devuelve la direccion del segmento
     */
    public int getDireccion(){
        int direc = direccion;
        return direc;
    }
    
    /**
     * Devuelve la posicion inicial X del segmento
     */
    public int getPosicionInicialX(){
        int posInX = posicionX;
        return posInX;
    }
    
    /**
     * Devuelve la posicion inicial Y del segmento
     */
    public int getPosicionInicialY(){
        int posInY = posicionY;
        return posInY;
    }
    
    /**
     * Devuelve la posicion final X del segmento
     */
    public int getPosicionFinalX(){
        int posInX = posicionX;
        if (direccion == 0 || direccion == 180) {
            posInX = posInX + LONGITUD_SEGMENTO;
        }
        return posInX;
    }
    
    /**
     * Devuelve la posicion final Y del segmento
     */
    public int getPosicionFinalY(){
        int posInY = posicionY;
        if (direccion == 90 || direccion == 270) {
            posInY = posInY + LONGITUD_SEGMENTO;
        }
        return posInY;
    }
    
    /**
     * Devuelve true si el segmento colisiona con un segmento
     * devuelve false si no colisiona con nada
     */
    public boolean colisionaCon(Segment segmento){
        boolean colisiona = false;
        if (getPosicionFinalX() == segmento.getPosicionFinalX() && getPosicionFinalY() == segmento.getPosicionFinalY()) {
            colisiona = true;
        }
        return colisiona;
    }
}
