
/**
 * Write a description of class Entrance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrance
{
    // instance variables - replace the example below with your own
    private Log log;
    private VAP vap;

    /**
     * Constructor for objects of class Entrance
     */
    public Entrance(Log log,VAP vap)
    {
       this.log=log;
       this.vap=vap;
    } 
    public String getLP( VAP vap)
    {
        return vap.getLP();
    }

    
}
