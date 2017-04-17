import java.io.*;
/**
 * Write a description of class InToDataBase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InToDataBase
{
    // instance variables - replace the example below with your own
    private String fileName;// name of database where there the information is store
    private Log masterlog;// information that should be store

    /**
     * Constructor for objects of class InToDataBase which send information to the database
     */
    public InToDataBase(String fileName,Log masterlog)
    {
        PrintWriter outFile =null;
        String file =fileName;
        try
        {
            FileWriter fw = new FileWriter(file,true);
            outFile=  new PrintWriter(fw);
                   }
        catch(Exception e)
        {
            System.out.println("oops an errors have occur with Master Log.");
        }
        outFile.println(masterlog.toString());
        outFile.close();
      }
    }
