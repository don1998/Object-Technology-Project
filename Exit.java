
/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit
{
    // instance variables - replace the example below with your own
    private Log log;
    private VAP vap;
    private Entrance entrance;
    /**
     * Constructor for objects of class Exit
     */
    public Exit(Log log,VAP vap)
    {
       this.log=log;
       this.vap=vap;
    }
    public void getEntrance(Entrance e)
    {
        this.entrance=e;
    }
    public void match(VAP vap)
    {
        String x=entrance.getLP(vap);
        String y=  vap.getLP();
        if (y.equals(x))
        { 
            vap=null;
        }
        else
        {
            System.out.println("error VPA does not match Licnecs plate number");
        }     
    }
    
}
