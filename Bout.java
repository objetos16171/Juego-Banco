import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bout here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bout extends World
{
    private BOTON BotonAtras;

    private int Saldo = 10000;

    private int ExistenciaSom = 3;
    private int ExistenciaCam = 3;
    private int ExistenciaVes = 3;
    private int ExistenciaSac = 3;
    private int ExistenciaMasc = 3;
    private int ExistenciaZap = 3;

    public int Costo = 850;
    private Sombrero Som; //= new Sombrero();
    //private Aretes Are; //= new Aretes();
    private Zapatos Zap;// = new Zapatos();
    private Saco Sac;// = new Saco();
    private Mascada Mas;//= new Mascada();

    private Vestido2 Ves;// = new Vestido2();
    private Camisa Cam;// = new Camisa();
    //private Vestido Vest;// = new Vestido();

    /**
     * Constructor for objects of class Bout.
     * 
     */
    public Bout()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        CreaBoutique();

    }

    private void CreaBoutique()
    {
        Som = new Sombrero();
        addObject (Som,320,165);

        Zap = new Zapatos();
        addObject (Zap,124,275);

        Sac = new Saco();
        addObject (Sac,323,210);

        Mas = new Mascada();
        addObject (Mas,525,385);

        Ves = new Vestido2();
        addObject (Ves,180,220);

        Cam = new Camisa();
        addObject (Cam,97,211);

        BotonAtras = new BOTON(5);

    }

    public void act()
    {
        MuestraDisponibilidad();

        MuestraSaldo();

        if(Greenfoot.getMouseInfo()!=null)
        {
            if(Greenfoot.mousePressed(Cam))
            {
                if(ExistenciaCam>0)
                {
                    RestaCam();
                    RestaSaldo();
                    if(Saldo<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }

            if(Greenfoot.mousePressed(Ves))
            {
                if(ExistenciaVes>0)
                {
                    RestaVes();
                    RestaSaldo();
                    if(Saldo<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }

            if(Greenfoot.mousePressed(Som))
            {
                if(ExistenciaSom>0)
                {
                    RestaSom();
                    RestaSaldo();
                    if(Saldo<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }

            if(Greenfoot.mousePressed(Sac))
            {
                if(ExistenciaSac>0)
                {
                    RestaSac();
                    RestaSaldo();
                    if(Saldo<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }

            if(Greenfoot.mousePressed(Zap))
            {
                if(ExistenciaZap>0)
                {
                    RestaZap();
                    RestaSaldo();
                    if(Saldo<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }

            if(Greenfoot.mousePressed(Mas))
            {
                if(ExistenciaMasc>0)
                {
                    RestaMasc();
                    RestaSaldo();
                    if(Saldo<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }
        }

        addObject(BotonAtras,510,30);

        if(Greenfoot.getMouseInfo()!=null)//instruccion que checa la informacion del mouse
        {
            if(Greenfoot.mousePressed(BotonAtras))//Checa si se sio click en el boton atras
            {
                Greenfoot.setWorld(new MyWorld());
            }
        }
    }

    public void RestaSaldo()
    {
        Saldo=Saldo-Costo;
        showText("Saldo : " + Saldo,80 ,15);
    }

    public void MuestraSaldo()
    {
        showText("Saldo : " + Saldo,80 ,15);
    }

    public void RestaCam()
    {
        ExistenciaCam--;
        showText("Camisa: " + ExistenciaCam, 60,100);

    }

    public void RestaVes()
    {
        ExistenciaVes--;
        showText("Vestido: " + ExistenciaVes, 60,100);
    }

    public void RestaSom()
    {
        ExistenciaSom--;
        showText("Sombrero: " + ExistenciaSom, 80,75);
    }

    public void RestaSac()
    {
        ExistenciaSac--;
        showText("Camisa: " + ExistenciaSac, 220,50);

    }

    public void RestaMasc()
    {
        ExistenciaMasc--;
        showText("Mascada: " + ExistenciaMasc, 240,75);
    }

    public void RestaZap()
    {
        ExistenciaZap--;
        showText("Zapatos: " + ExistenciaZap, 230,100);
    }

    public void MuestraDisponibilidad()
    {
        MuestraCam();
        MuestraSom();
        MuestraVes();
        MuestraSac();
        MuestraMasc();
        MuestraZap();
    }

    public void MuestraCam()
    {
        showText("Camisa: " + ExistenciaCam, 60,50);
    }

    public void MuestraSom()
    {
        showText("Sombrero: " + ExistenciaSom, 80,75);
    }

    public void MuestraVes()
    {
        showText("Vestido: " + ExistenciaVes, 60,100);
    }

    public void MuestraSac()
    {
        showText("Saco: " + ExistenciaSac, 220,50);
    }

    public void MuestraMasc()
    {
        showText("Mascada: " + ExistenciaMasc, 240,75);
    }

    public void MuestraZap()
    {
        showText("Zapatos: " + ExistenciaZap, 230, 100);
    }
}
