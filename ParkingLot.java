
/**
 * Write a description of class ParkingLot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParkingLot
{
    // instance variables - replace the example below with your own
    private String name;
    private int space;
    private Log log;

    /**
     * Constructor for objects of class lot
     */
    public ParkingLot(String name,int space)
    {
        // initialise instance variables
        this.name= name;
        this.space=space;
    }
    public int Addspace()
    {
        return 0;
    }
    public int reduceSpace()
    {
        return  0;
    }
    public void enter(String parkinglotuse,String timeplentry)
    {
        log.setplEnter(parkinglotuse,timeplentry);
    }
    public void exit(String timeplexit)
    {
        log.setplExit(timeplexit);
    }
    }
