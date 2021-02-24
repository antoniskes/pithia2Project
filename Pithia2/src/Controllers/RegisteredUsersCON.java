package Controllers;
import Main.Database;
import Model.*;
import java.util.*;

public class RegisteredUsersCON {
    
    public ArrayList getUsers(){
        return Database.appDatabase.database.accounts;
    }
}
