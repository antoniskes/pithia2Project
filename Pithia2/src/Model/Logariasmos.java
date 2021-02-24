package Model;
import java.io.Serializable;

public class Logariasmos implements Serializable{
    //Fields
    private String username;
    private String password;
    private String onomatEpwnymo="";
    private char typosLogariasmou;//f=Foititis, g=Grammateia, k=Kathigitis, d=Diaxeiristis
    
    //Constructor
    public Logariasmos(String username, String password, String onomatEpwnymo) {
            this.username = username;
            this.password = password;
            this.onomatEpwnymo = onomatEpwnymo;
            if (this instanceof Foititis)
                typosLogariasmou = 'f';
            else if (this instanceof Grammateia)
                typosLogariasmou = 'g';
            else if (this instanceof Kathigitis)
                typosLogariasmou = 'k';
            else if (this instanceof Diaxeiristis)
                typosLogariasmou = 'd';
    }
    
    //Methods
    public boolean validate(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password))
            return true;
        return false;
    }
    
    //Getters - Setters

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getOnomatEpwnymo() {
        return onomatEpwnymo;
    }

    public char getTyposLogariasmou() {
        return typosLogariasmou;
    }
    
    
}
