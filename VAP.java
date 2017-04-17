
/**
 * Write a description of class VPA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VAP
{
    private String LP;//text version of a licences plate number
    private int VAP;// vechicle acess pass 

    /**
     * Constructor for objects of class VPA
     * by take in the licences plate number and assign a VPA
     */
    public VAP(String LP,int VAP)
    { this.LP=LP;
      this.VAP= VAP;
    }
    /**
     * get the licences plate number
     */
    public String getLP()
    {
        return LP;
    }
    /**
     * get VPA number
     */
    public int getVAP()
    {
        return VAP;
    }
    /**
     * if licenes plate cannot be read by the system this maunal overide the system
     */    
    public void overRideSystem(String LP,int VPA)
    {
      this.LP=LP;
      this.VAP= VAP;
    }   
}
