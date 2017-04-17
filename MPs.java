
import Users.*;
import java.util.Scanner;

/**
 * Write a description of class MPs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MPs
{
    private CameraInput camera;
    private Log log;
    private VAP vap;
    private Exit exit;
    private Entrance entrance;
    private ParkingLot lot;
    private InToDataBase data;
    private Scanner scan;
    private String ID;
    private String password;
    public static void main(String[] agrs)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("       Welcome to MPs "+"\nwith your Security and Time in mind");
        System.out.print("\nPlease  enter user ID: ");
        String ID= scan.nextLine();
        System.out.print("\nPlease  enter user Password:  ");
        String password=scan.nextIntegrate();
     
        // open user account if it exist
          Employee employee = new Employee(ID,password);
          employee.typeEmployee(ID);
        
        
        
    }
    public Employee typeEmployee(String ID)
    {
        if( (ID.charAt(0)==1))
        {
            Guard guard = new Guard(ID,password,1);
        }
        if( (ID.charAt(0)==2))
        {
            Committeemember cm = new Committeemember(ID,password,2);
        }

    }
}