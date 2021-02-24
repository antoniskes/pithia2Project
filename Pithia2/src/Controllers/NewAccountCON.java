
package Controllers;
import Main.Database;
import Model.*;
import java.io.*;
public class NewAccountCON {
    //Account creation has to do only about students. Other type of users will have built-in accounts, no need to create one.
    public static void createNewAccount(String username, String password, String onomatEpwnymo, int AM, int eksamino, String email) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        //username is going to be automatically created 
        Logariasmos newAccount = new Foititis(username, password, onomatEpwnymo, AM, eksamino, email);
        Database.appDatabase.database.accounts.add(newAccount);
        Database.saveDatabase();
    }
    
    //usernameGeneration should be called from the UI and the UI should not allow user to change generatedUsername
    public static String usernameGeneration(int AM)
    {
        // username is to be automatically created based on AM and type of user
        // username: [account-type][AM] e.g. f171111
        StringBuilder sb = new StringBuilder();
        sb.append("f");
        sb.append(AM);
        
        String generatedUsername = sb.toString();
        
        return generatedUsername;        
    }
}
