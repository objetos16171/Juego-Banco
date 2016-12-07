import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ab extends World
{
    private BOTON BotonAtras;
    
    public int S = 10000;

    public int Em = 5;
    public int Es = 4;
    public int Eu = 3;
    public int Ep = 2;
    public int Emn = 4;
    public int En = 3;
    public int Epr = 4;

    public int Costo = 500;

    private Melon m;// = new Melon();
    Sandia s;// = new Sandia();
    Uva u;// = new Uva();
    Naranja n;// = new Naranja();
    Manzana mn;// = new Manzana();
    Pera pr;// = new Pera();
    Piña p;// = new Piña();
    /**
     * Constructor for objects of class Ab.
     * 
     */
    public Ab()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 473, 1); 

        CreaF();
    }

    public void CreaF()
    {
        m = new Melon();
        addObject(m, 210, 130 );

        s = new Sandia();
        addObject(s, 120, 135 );

        u = new Uva();
        addObject(u, 480, 135 );

        p = new Piña();
        addObject(p, 315, 135 );

        mn = new Manzana();
        addObject(mn, 390, 135 );

        n = new Naranja();
        addObject(n, 120, 200 );

        pr = new Pera();
        addObject(pr, 250, 200 );
        
        BotonAtras = new BOTON(5);
    }

    public void act()
    {
        Muestram();
        Muestras();
        Muestrau();
        Muestrap();
        Muestramn();
        Muestran();
        Muestrapr();

        MuestraS();
        if(Greenfoot.getMouseInfo()!=null)
        {
            if(Greenfoot.mousePressed(m))
            {
                if(Em>0)//melon
                {
                    Restam();
                    RestaS();
                    if(S<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }

            if(Greenfoot.mousePressed(s))
            {
                if(Es>0)//sandia
                {
                    Restas();
                    RestaS();
                    if(S<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }

            if(Greenfoot.mousePressed(u))
            {
                if(Eu>0)//uva
                {
                    Restau();
                    RestaS();
                    if(S<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }

            if(Greenfoot.mousePressed(p))
            {
                if(Ep>0)//piña
                {
                    Restap();
                    RestaS();
                    if(S<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }

            if(Greenfoot.mousePressed(mn))
            {
                if(Emn>0)//manzana
                {
                    Restamn();
                    RestaS();
                    if(S<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }

            if(Greenfoot.mousePressed(n))
            {
                if(En>0)//naranja
                {
                    Restan();
                    RestaS();
                    if(S<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }

            if(Greenfoot.mousePressed(pr))
            {
                if(Epr>0)
                {
                    Restapr();
                    RestaS();
                    if(S<0)
                    {
                        Greenfoot.setWorld(new Fin());
                    }
                }
            }
        }
        
        addObject(BotonAtras,60,30);

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
        showText("Saldo : " + S,300 ,400);
    }

    public void MuestraS()
    {
        showText("Saldo : " + S,300 ,400);
    }

    public void Muestram()
    {
        showText("Disponible: " + Em,  210, 100);

    }

    public void Restam()
    {
        Em=Em-1;
        showText("Disponible: " + Em, 210, 100);

    }

    public void Restas()
    {
        Es=Es-1;
        showText("Disponible: " + Es, 120, 160);

    }

    public void Muestras()
    {
        showText("Disponible: " + Es, 120, 160);
    }

    public void Muestrau()
    {
        showText("Disponible: " + Eu, 480, 160);
    }

    public void Restau()
    {
        Eu = Eu-1;
        showText("Disponible: " + Eu, 480, 160);
    }

    public void Muestrap()
    {
        showText("Disponible: " + Ep, 315, 160);
    }

    public void Restap()
    {
        Ep = Ep-1;
        showText("Disponible: " + Ep,315, 160);
    }

    public void Muestramn()
    {
        showText("Disponible: " + Emn, 390, 100);
    }

    public void Restamn()
    {
        Emn = Emn-1;
        showText("Disponible: " + Emn, 390, 100);
    }

    public void Muestran()
    {
        showText("Disponible: " + En, 120, 230);
    }

    public void Restan()
    {
        En = En-1;
        showText("Disponible: " + En, 120, 230);
    }

    public void Muestrapr()
    {
        showText("Disponible: " + Epr, 250, 230);
    }

    public void Restapr()
    {
        Epr = Epr-1;
        showText("Disponible: " + Epr, 250, 230);
    }
}

