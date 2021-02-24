package Main;
import Model.*;
import java.io.*;
public class TextFileDatabase implements Serializable{    
    public ClassOfArrays database; 
    
    // Constructors
    public TextFileDatabase()
    {
        database = new ClassOfArrays();// creates object of type ClassOfPinakes        
    }
    public TextFileDatabase(String fileName)
    {
        database = new ClassOfArrays();// creates object of type ClassOfPinakes        
    }

}
