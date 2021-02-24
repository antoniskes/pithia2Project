
package Controllers;
import Main.Database;
import Model.*;
import java.io.IOException;
public class DilosiMathimatonCON {
    public static int courseRegistration(Foititis student, double vathmos, String onomaMathimatos)
    {
        Mathima courseRegistration = student.addMathima(onomaMathimatos);
        if (courseRegistration == null)//error
            return 1; // informs UI that registration was unsuccessful
        else
        {            
            student.addMathimaToVathmologies(courseRegistration);//add course entry to vathmologies array
            student.addDilosiDate(courseRegistration);
            
            printAnalytKatastFoititon.addEntry("Dilosi", courseRegistration, student, "Επιτυχής", vathmos);
        }
        
        
        
        try {
            Database.saveDatabase();
        } catch (IOException ex) {
            System.out.println("IOException in DilosiMathimatonCON");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException in DilosiMathimatonCON");
        }
        return 0; //registration successful
        
    }    
}