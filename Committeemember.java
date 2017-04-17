package Users;
 

/**
 * Write a description of class committeemember here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Committeemember extends Employee
{
    // instance variables - replace the example below with your own
    private String ID;
    private int Password;
    private int tag;
    
    /**
     * Constructor for objects of class committeemember
     */
    public Committeemember(String ID, int Password, int tag)
    {
        // initialise instance variables
       super(ID,Password);
       this.tag=tag;
    }
   }
