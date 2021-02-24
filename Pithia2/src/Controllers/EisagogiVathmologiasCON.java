
package Controllers;
import Main.Database;
import Model.*;
import java.io.IOException;
public class EisagogiVathmologiasCON {
    
    public static void addVathmos(Kathigitis teacher, Foititis student, double vathmos, String onomaMathimatos)
    {        
        String courseT = teacher.searchDidaskomenaMathimata(onomaMathimatos).getOnomaMathimatos();
        Mathima course = teacher.searchDidaskomenaMathimata(onomaMathimatos);
        Object [][] vathmologiesFoititi = student.getVathmologies();
        
        int i=0;
        boolean flag = true;
        while (flag)
        {
            String courseS = ((Mathima) vathmologiesFoititi[i][0]).getOnomaMathimatos();            
            if (courseS == null ? courseT == null : courseS.equals(courseT))
                flag = false;
            else
                i++;
            
            if (courseS == null)
            {
                flag = false;
                i = -1;
            }
        }
        if (i != -1){
            student.setVathmologia(i, vathmos);
            printAnalytKatastFoititon.addEntry("Vathmologia", course, student, "Επιτυχής", vathmos);
        }
        try {
            Database.saveDatabase();
        } catch (IOException ex) {
            System.out.println("IOException in EisagogiVathmologiasCON");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException in EisagogiVathmologiasCON");
        }        
    }
}
