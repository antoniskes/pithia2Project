package Controllers;
import Main.Database;
import Model.*;
import java.io.*;
public class LogoutCON {
    public static void logout() throws FileNotFoundException, IOException, ClassNotFoundException // method should be called from UI from logoutBtnActionPerformed
    {        
        Database.saveDatabase();
    }    
}
