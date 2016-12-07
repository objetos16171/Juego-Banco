import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    private int x=250;// Controlando posición x de botones en conjunto
    private int y=100;// Controlando posición y de botones en conjunto

    //private int num =1;
    private BOTON BotonJugar;
    private BOTON BotonInstr;
    //private BOTON BotonSalir;
    private BOTON BotonCreditos;
    private BOTON BotonAtras;
    
    private Flechas Fch; 

    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        // Agregando y posicionando botones
        super(900, 600, 1);
        /*addObject(new BotonOpciones(),x+201,y+59);
        addObject(new BotonSalir(),x+60,y+195);
        addObject(new BotonAyuda(),x+60,y+333);
        addObject(new BotonJugar(),x+270,y+267);*/

        CreaBotones();
    }

    public void CreaBotones()
    {
        BotonJugar = new BOTON(1);
        addObject(BotonJugar,x+270,y+245);

        BotonCreditos = new BOTON(2);
        addObject(BotonCreditos,x,y+333);

        BotonInstr = new BOTON(3);
        addObject(BotonInstr,x,y+150);

        /*BotonSalir = new BOTON(4);
        addObject(BotonSalir,x+60,y+195);*/

        BotonAtras = new BOTON(5);
    }

    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)//instruccion que checa la informacion del mouse
        {
            if(Greenfoot.mousePressed(BotonJugar))//Checa si se sio click en el boton jugar
            {
                Greenfoot.setWorld(new MyWorld());
            }

            if(Greenfoot.mousePressed(BotonAtras))
            {
                Greenfoot.setWorld(new Menu());
            }

            if(Greenfoot.mousePressed(BotonCreditos))//Checa si se dio click en el boton creditos
            {

                RemoveObj();

                showText("Programacion Orientada a Objetos: ", x+201,y+59);
                showText("Tarjeta Bancaria ", x+201,y+105);
                showText("Hernández Cleto José Ernesto", x+201,y+151);
                showText("González Reyes Felipe de Jesús", x+201,y+201);
                showText("Vázquez Avila Abimael ", x+201,y+250);
                addObject(BotonAtras,x+500,y);

            }
            if(Greenfoot.mousePressed(BotonInstr))
            {
                RemoveObj();

                showText("Estas son las instrucciones ", x+201,y+59);
                showText("En este juego,estarás paseando por 3 ", x+190,y+90);
                showText("departamentos de un centro comercial. ", x+190,y+110);
                showText("El personaje, se podrá mover de  ", x+190,y+130);
                showText("arriba y abajo,izquierda y derecha ", x+190,y+150);
                CreaFlechas();

                showText("El jugador tendra un Trjeta de credito,con", x+190,y+210);
                showText("un limite de saldo, asi mismo, se tendrá ", x+190,y+230);
                showText("un numero máximo de productos disponibles ", x+190,y+250);
                addObject(BotonAtras,x+500,y);
            }
        }
    }

    public void RemoveObj()
    {

        removeObject(BotonJugar);
        //removeObject(BotonSalir);
        removeObject(BotonInstr);
        removeObject(BotonCreditos);
    }
    
    public void CreaFlechas()  
    {
        Fch = new  Flechas();
        addObject(Fch,x+190,400);
     
    }
}
