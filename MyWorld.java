import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    private int x=0;// Controlando posición x de botones en conjunto
    private int y=0;// Controlando posición y de botones en conjunto
    
    
    private Hombre hombre = new Hombre();
    private Escenario1 Tgamer;
    private Escenario2 Tabb;
    private Escenario3 Tbou;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        CreaT();
        
         personaje();
    }
    
    private void personaje()
    {
        addObject (new Hombre(),480,370);
    }
    
    public void CreaT()
    {
        Tgamer = new Escenario1();
        addObject(Tgamer,x+60,y+265);
        
        Tabb = new Escenario2();
        addObject(Tabb,x+310,y+285);
        
        Tbou = new Escenario3();
        addObject(Tbou,x+500,y+220);
    }
    
}
