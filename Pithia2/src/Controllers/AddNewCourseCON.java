
package Controllers;
import Main.Database;
import Model.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AddNewCourseCON {
    
    public static void addNewCourse(String onomaMathimatos, String kodikosMathimatos, int eksamino, int oresDidaskalias, boolean ergastiriakoMeros, int ECTS, Mathima proapaitoumenoMathima){
        Mathima newMathima = new Mathima(onomaMathimatos, kodikosMathimatos, eksamino, oresDidaskalias, ergastiriakoMeros, ECTS, proapaitoumenoMathima);
        Database.appDatabase.database.mathimata.add(newMathima);
        try {
            Database.saveDatabase();
        } catch (IOException ex) {
            System.out.println("IOException in AddNewCourseCON");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException in AddNewCourseCON");
        }
    }   
    
}
