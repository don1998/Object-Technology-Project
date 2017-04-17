import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 * Write a description of class CameraInput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CameraInput
{
    // instance variables - replace the example below with your own
    private Scanner scan;
    private ArrayList<String> LPs;

    /**
     * Constructor for objects of class CameraInput
     */
    public void CameraInput(String LP)
    {
        // initialise instance variables
        try{
            scan = new Scanner(new File(LP));
        }
            catch(Exception e)
            {
                System.out.println("oops! An error has occurred LP read not readed");
            }
        }
    public ArrayList readImage()
       {  
        LPs= new ArrayList<String>();
        while (scan.hasNext())
        {   String s=scan.nextLine();
            
             LPs.add(s);
        }
        return LPs ;
     }
    public void closeFile()
        {
            scan.close();
        }
    }
