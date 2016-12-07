import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    private BOTON BotonAtras;

    public int S = 10000;

    public int EFifa = 5;
    public int EGow = 4;
    public int EHalo = 3;
    public int EFh3 = 2;
    public int EDbz = 4;
    public int EF6 = 3;

    public int Costo = 1000;
    /*public int CGow = 800;
    public int CHalo = 900;

    public int C = 1000;
    public int C = 800;
    public int C = 900;*/

    private Fifa17 ff17;// = new Fifa17();
    private Gow4 gow4;// = new Gow4();
    private Halo5 h5;// = new Halo5();
    private Fh3 fh3;// = new Fh3();
    private Dbz2 dbz2;// = new Dbz2();
    private Fm6 fm6;// = new Fm6();
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);  
        /*ff17 = new Fifa17();
        gow4 = new Gow4();
        h5 = new Halo5();
        fh3 = new Fh3();
        dbz2 = new Dbz2();
        fm6 = new Fm6();*/
        CreaGame();      

        //MT();
    }

    private void CreaGame()
    {
        ff17 = new Fifa17();
        addObject(ff17, 140, 100 );

        gow4 = new Gow4();
        addObject(gow4, 400, 100 );

        h5 = new Halo5();
        addObject(h5, 680, 100 );

        fh3 = new Fh3();
        addObject(fh3, 100, 350 );

        dbz2 = new Dbz2();
        addObject(dbz2, 400, 370);

        fm6 = new Fm6();
        addObject(fm6, 700, 350 );

        BotonAtras = new BOTON(5);
        
    }

    public void act()
    {
        MuestraDF();
        MuestraDG();
        MuestraDHalo();
        MuestraDFh3();
        MuestraDbz();
        MuestraEF6();

        MuestraS();
        if(Greenfoot.getMouseInfo()!=null)
        {
            if(Greenfoot.mousePressed(ff17))
            {
                if(EFifa>0)
                {
                    RestaF();
                    RestaS();
                    if(S<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }

            if(Greenfoot.mousePressed(gow4))
            {
                if(EGow>0)
                {
                    RestaGow4();
                    RestaS();
                    if(S<0)
                        Greenfoot.setWorld(new Fin());
                }
            }

            if(Greenfoot.mousePressed(h5))
            {
                if(EHalo>0)
                {
                    RestaHalo();
                    RestaS();
                    if(S<0)
                        Greenfoot.setWorld(new Fin());
                }
            }

            if(Greenfoot.mousePressed(fh3))
            {
                if(EFh3>0)
                {
                    RestaFh3();
                    RestaS();
                    if(S<0)
                        Greenfoot.setWorld(new Fin());
                }
            }

            if(Greenfoot.mousePressed(dbz2))
            {
                if(EDbz>0)
                {
                    RestaDbz();
                    RestaS();
                    if(S<0)
                        Greenfoot.setWorld(new Fin());
                }
            }

            if(Greenfoot.mousePressed(fm6))
            {
                if(EF6>0)
                {
                    RestaEF6();
                    RestaS();
                    if(S<0)
                        Greenfoot.setWorld(new Fin());
                }
            }
        }
        
        addObject(BotonAtras,780,550);

        if(Greenfoot.getMouseInfo()!=null)//instruccion que checa la informacion del mouse
        {
            if(Greenfoot.mousePressed(BotonAtras))//Checa si se sio click en el boton Atras
            {
                Greenfoot.setWorld(new MyWorld());
            }
        }
        
    }

    public void RestaS()
    {
        S=S-Costo;
        showText("Saldo : " + S,80 ,560);
    }

    public void MuestraS()
    {
        showText("Saldo : " + S,80 ,560);
    }

    public void MuestraDF()
    {
        showText("Disponible: " + EFifa, 80,200);

    }

    public void RestaF()
    {
        EFifa=EFifa-1;
        showText("Disponible: " + EFifa, 80,200);

    }

    public void RestaGow4()
    {
        EGow=EGow-1;
        showText("Disponible: " + EGow, 360,237);

    }

    public void MuestraDG()
    {
        showText("Disponible: " + EGow, 360,237);
    }

    public void MuestraDHalo()
    {
        showText("Disponible: " + EHalo, 650,237);
    }

    public void RestaHalo()
    {
        EHalo = EHalo-1;
        showText("Disponible: " + EHalo, 650,237);
    }

    public void MuestraDFh3()
    {
        showText("Disponible: " + EFh3, 80,500);
    }

    public void RestaFh3()
    {
        EFh3 = EFh3-1;
        showText("Disponible: " + EFh3, 80,500);
    }

    public void MuestraDbz()
    {
        showText("Disponible: " + EDbz, 380,500);
    }

    public void RestaDbz()
    {
        EDbz = EDbz-1;
        showText("Disponible: " + EDbz, 380,500);
    }

    public void MuestraEF6()
    {
        showText("Disponible: " + EF6, 650,450);
    }

    public void RestaEF6()
    {
        EF6 = EF6-1;
        showText("Disponible: " + EF6, 650,450);
    }
}
