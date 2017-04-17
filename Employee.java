package Users;


/**
 * Write a description of class employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee
{
    // instance variables - replace the example below with your own
    private String ID;
    private int Password;
    public enum IDs{akeam,loya,shemi,yohan,dwayz,robert};

    /**
     * Constructor for objects of class employee
     */
    public Employee(String ID, int Password)
    {
        // initialise instance variables
        this.ID=ID;
        this.Password=Password;
    } 
    public boolean realemployee(String ID)
    {
        if (ID.equals(q))
        return true;
    }
}
