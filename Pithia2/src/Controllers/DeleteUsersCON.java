package Controllers;
import Main.Database;
import Model.*;
import java.io.IOException;

public class DeleteUsersCON {
    public static void deleteUser(Logariasmos account){
        Database.appDatabase.database.accounts.remove(account);
        try {
            Database.saveDatabase();
        } catch (IOException ex) {
            System.out.println("IOException in DeleteUsersCON");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException in DeleteUsersCON");
        }
    }
}
