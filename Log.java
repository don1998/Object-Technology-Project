
/**
 * Write a description of class Log here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Log
{
    // instance variables - replace the example below with your own
    private String LP; // text versions licences plate number
    private int VAP;  // vehicle access pas
    private String time;// time of entry
    private String pointOfEntry; // point of enter use motorist use to gian access to the campus
    private String pointOfExit; // point of  exit use motorist use to leaves the campus
    private String timeofExit;//time of eixt
    private String parkinglotuse;// the parking lots enter by the motorist while on the campus
    private String timeplentry; //time of entry to the parking lot
    private String timeplexit;//time of exit to the parking lot
    
    /**
     * Constructor for objects of class Log for point of entry
     */
    public Log(String LP, int VAP,String time,String pointOfEntry)
    {
        this.LP=LP;
        this.VAP = VAP ;
        this.time= time;
        this.pointOfEntry =pointOfEntry;
        
    }
    /**
     * create a log for point of exit
     */
    public Log(String LP, int VAP ,String time,String pointOfEntry,String pointOfExit,String timeofExit)
    { 
        this.LP=LP;
        this.VAP = VAP ;
        this.time= time;
        this.pointOfEntry =pointOfEntry;
        this.pointOfExit =pointOfExit;
        this.timeofExit= timeofExit;
        
    }
    /**
     * create a Master log with information from point of enter,exit and the parkinglots
     */
    public Log(String LP, int VAP ,String time,String pointOfEntry,String pointOfExit,String timeofExit,String parkinglotuse,String timeplentry,String timeplexit)
    {
        this.LP=LP;
        this.VAP = VAP ;
        this.time= time;
        this.pointOfEntry =pointOfEntry;
        this.pointOfExit =pointOfExit;
        this.timeofExit= timeofExit;
        this.parkinglotuse=parkinglotuse;
        this.timeplentry=timeplentry;
        this.timeplexit=timeplexit;
    }
    public void setplEnter(String parkinglotuse,String timeplentry)
    {
        this.parkinglotuse=parkinglotuse;
        this.timeplentry=timeplentry;
    }
    public void setplExit( String timeplexit)
    {
        this.timeplexit=timeplexit;
    }
    /**
     * store log information.
     */
    public String toStirng()
    {
        return(LP+ VAP  + time + pointOfEntry + pointOfExit + timeofExit + parkinglotuse + timeplentry + timeplexit);
    }  
    /**
     * allow user to view log.
     */
    public String Viewlog()
    {
        return toString();
    }
}
