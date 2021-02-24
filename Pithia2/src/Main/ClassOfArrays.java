package Main;
import Model.Logariasmos;
import Model.Mathima;
import java.io.Serializable;
import java.util.ArrayList;

public class ClassOfArrays implements Serializable {
    
    public ArrayList <Logariasmos> accounts = new ArrayList<Logariasmos>();       
    public ArrayList <Mathima> mathimata = new ArrayList<Mathima>();
    public Object[][] printAnalytikisKatastasisFoititon = new Object[100][7];//Εργασία ΑΜ Μάθημα Ημερομ. δήλωσης Μήνυμα Ημερομ. εξέτασης Βαθμός
    public int nextEmptyRow = 0;//helpful var
    //Constructor
    public ClassOfArrays(){}
    
    //Methods
    public Logariasmos getAccount(String username)
    {
        for (Logariasmos account : accounts)
        {
           if ( account.getUsername().equalsIgnoreCase(username))
               return account;
        }     
        return null;        
    }
}
