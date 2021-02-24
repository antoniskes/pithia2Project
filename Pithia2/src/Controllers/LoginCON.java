package Controllers;
import Main.Database;
import Model.*;
import View.*;
public class LoginCON {
    
    
    public static Logariasmos login(String username, String password) {
       for (Logariasmos account : Database.appDatabase.database.accounts) {
           if (account.validate(username, password)) {
               return account;
           }
       }             
       return null;//returns null to UI
    }
}
         

