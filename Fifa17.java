import greenfoot.*;

/**
 * Write a description of class Fifa17 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fifa17 extends Escenario1
{
    private int existencias = 3;
    private GreenfootImage imagen1;
   
    public Fifa17()
    {
        imagen1 = new GreenfootImage("nofifa.jpg");
    }
    
    public void act() 
    {
       if(existencias == 0)
       {
           setImage(imagen1);
       }
       else 
       {
           existencias--;
       }
    }
}
