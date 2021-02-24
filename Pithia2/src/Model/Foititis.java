package Model;
import Main.Database;
import java.util.ArrayList;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Foititis extends Logariasmos implements Serializable{
    // Fields
        //Personal Details
    private int AM;
    private int eksamino;
    private String email;
    
        //Courses Registration
    private ArrayList <Mathima> dilomenaMathimata = new ArrayList<Mathima>();
    public Object[][] dilosiDate = new Object[30][2];//saves when the student registered to course
        //Vathmologies
    private Object[][] vathmologies = new Object[30][2]; //vathmologies[Mathima][Vathmos] //Vathmos -> Double
    public Object[][] vathmologisiDate = new Object[30][2];//saves when teacher added vathmos to student to course
    public int vathmologiesNextEmptyRow = 0;
    
    // Constructor
    public Foititis(String username, String password, String onomatEpwnymo, int AM, int eksamino, String email) 
    {
        super(username, password, onomatEpwnymo);
        this.AM = AM;
        this.eksamino = eksamino;
        this.email = email;
    }
    
    //Methods
    public Mathima addMathima(String titlos) {
       
        Mathima mathimaToAdd = searchMathima(titlos);
        if (mathimaToAdd != null)
        {
            dilomenaMathimata.add((mathimaToAdd));
            return mathimaToAdd;// successful
        }            
        else
            return null;//error
        
    }
    public Mathima getDilomenoMathima(String titlos) {
        Mathima mathimaToAdd = null;
        for (Mathima mathimaObj : dilomenaMathimata)
        {
            String onomaMathimatos = mathimaObj.getOnomaMathimatos();
            if (onomaMathimatos.equalsIgnoreCase(titlos))
            {
               return mathimaToAdd = mathimaObj;
            }            
        }
        if (mathimaToAdd != null)
        {            
            return mathimaToAdd;// registered to course
        }            
        else
            return null;// not registered to course
        
    }
    
    private Mathima searchMathima(String titlos){         
        for (Mathima mathimaObj : Database.appDatabase.database.mathimata)
        {
            String onomaMathimatos = mathimaObj.getOnomaMathimatos();
            if (onomaMathimatos.equalsIgnoreCase(titlos))
            {
               return mathimaObj;
            }            
        }
        return null;
    }
    
    //Getters - Setters
    public int getAM()
    {
        return AM;
    }

    public int getEksamino() {
        return eksamino;
    }

    public ArrayList<Mathima> getDilomenaMathimata() {
        return dilomenaMathimata;
    }
    
    public Object[][] getVathmologies() {
        return vathmologies;
    }

    public String getEmail() {
        return email;
    }

    public void setDilomenaMathimata(ArrayList<Mathima> dilomenaMathimata) {
        this.dilomenaMathimata = dilomenaMathimata;
    }

    public void setVathmologia(int mathima, double vathmos) {
        vathmologies[mathima][1] = (Double) vathmos;
    }
    public void addMathimaToVathmologies(Mathima course)
    {
        vathmologies[vathmologiesNextEmptyRow][0] = course;
        vathmologies[vathmologiesNextEmptyRow][1] = -999.0; // vathmos
        vathmologiesNextEmptyRow++;
    }
    public void addDilosiDate(Mathima course)
    {
        dilosiDate[vathmologiesNextEmptyRow][0] = course;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();
        dilosiDate[vathmologiesNextEmptyRow][1] = formatter.format(date);        
    }
    
    
}
