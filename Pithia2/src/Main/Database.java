package Main;
import Main.TextFileDatabase;
import java.io.*;

public class Database {
    public static TextFileDatabase appDatabase = new TextFileDatabase();
    public static String databaseFileName = "projectDatabase.txt";
    
    // Public Methods
    public static void initDatabase() throws FileNotFoundException, IOException, ClassNotFoundException //read database
    {
        readFile();
    }
    public static void saveDatabase() throws FileNotFoundException, IOException, ClassNotFoundException // WRITE changes to database before program termination
    {
        updateFile();
    }
        
    // Private Methods
    private static void readFile() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        try
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(databaseFileName));
            appDatabase = (TextFileDatabase) in.readObject(); //reads object-data from text file to object
        }
        catch(FileNotFoundException fileNotFound)
        {
            //if file not found then create file and write database to files
            writeFile();
        }                
        
    }
    private static void updateFile() throws IOException
    {
        new FileOutputStream(databaseFileName).close(); //empty file before writing updated database to it
        writeFile();
    }
    
    private static void writeFile() throws IOException
    {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(databaseFileName));        
        out.writeObject(appDatabase);
    }
}
