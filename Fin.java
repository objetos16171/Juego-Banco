import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fin extends World
{
    private BOTON BotonInicio;
    
    /**
     * Constructor for objects of class Fin.
     * 
     */
    public Fin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 544, 1); 
        
        Texto();
    }
    
    public void Texto()
    {
        showText("Has sido embargado por no tener con que pagar ", 350,50);
        showText("Lo sentimos no compres mas de lo no pudes pagar :) ", 380,150);
        BotonInicio = new BOTON(6);
    }

    public void act()
    {
        addObject(BotonInicio,800,500);

        if(Greenfoot.getMouseInfo()!=null)//instruccion que checa la informacion del mouse
        {
            if(Greenfoot.mousePressed(BotonInicio))//Checa si se sio click en el boton inicio
            {
                Greenfoot.setWorld(new Menu());
            }
        }
    }
}
