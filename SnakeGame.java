import java.util.ArrayList;
import java.awt.Color;
/**
 * Write a description of class SnakeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGame
{

    private Canvas lienzo;
    private Snake snake;
    private static final int ANCHO_LIENZO = 500;
    private static final int ALTO_LIENZO = 500;
    
    /**
     * Constructor for objects of class SnakeGame
     */
    public SnakeGame()
    {
        lienzo = new Canvas("Snake game", ANCHO_LIENZO, ALTO_LIENZO);
    }

    /**
     * Dibuja la serpiente en el lienzo
     */
    public void drawSnake()
    {
        snake = new Snake(ANCHO_LIENZO, ALTO_LIENZO);
        lienzo.erase();
        snake.dibujar(lienzo);
    }
    
    /**
     * lleva a cabo una animacion de la serpiente que se mueve aleatoriamente
     * por la pantalla
     */
    public void animateSnake()
    {
        snake.dibujar(lienzo);
        do {
            snake.borrar(lienzo);
            snake.dibujar(lienzo);
        }while(snake.mover());
    }
}
