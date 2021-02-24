package Model;
import java.io.Serializable;
import java.util.ArrayList;
public class Kathigitis extends Logariasmos implements Serializable{    
    private String am;
    private ArrayList <Mathima> didaskomenaMathimata = new ArrayList<Mathima>();
    //Constructor
    public Kathigitis(String username, String password, String onomatEpwnymo, String am) {
        super(username, password, onomatEpwnymo);
        this.am = am;
    }
    //Methods
    public Mathima searchDidaskomenaMathimata(String titlos){ //verify that teacher teaches that course he/she is about to put vathmos        
        for (Mathima mathimaObj : didaskomenaMathimata)
        {
            String onomaMathimatos = mathimaObj.getOnomaMathimatos();            
            if (onomaMathimatos.equalsIgnoreCase(titlos))
            {
               return mathimaObj;
            }            
        }
        return null;
    }

    public ArrayList<Mathima> getDidaskomenaMathimata() {
        return didaskomenaMathimata;
    }
    public void addDidaskomenoMathima(Mathima mathima){
        didaskomenaMathimata.add(mathima);
    }
    
}
