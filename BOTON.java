import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BOTON here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BOTON extends Actor
{
    /**
     * Act - do whatever the BOTON wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public BOTON(int num)
    {
        if (num == 1)
        {
            setImage("botonJugar0.png");
        }
        else
        if(num == 2)
        {
            setImage("Creditos.png");
        }
        else
        if(num == 3)
        {
            setImage("Instrucciones.png");
        }
        else
        /*if(num == 4)
        {
            setImage("botonSalir0.png");
        }
        else*/
        if(num == 5)
        {
            setImage("boton_atras.png");
           
        }
        else
        if(num == 6)
        {
            setImage("botonInicio.png");
        }
    }
    
    
}
