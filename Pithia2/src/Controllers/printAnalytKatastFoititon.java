package Controllers;
import Main.*;
import Model.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class printAnalytKatastFoititon {
    public static void addEntry(String ergasia, Mathima course, Foititis student, String msg, double vathmos)
    {
        Object[][] printAnalytikisKatastasisFoititon = Database.appDatabase.database.printAnalytikisKatastasisFoititon;
        int nextEmptyRow = Database.appDatabase.database.nextEmptyRow;
        
        if (ergasia.equalsIgnoreCase("Dilosi"))
        {
            printAnalytikisKatastasisFoititon[nextEmptyRow][0] = "Δήλωση";
            printAnalytikisKatastasisFoititon[nextEmptyRow][1] = student.getAM();
            printAnalytikisKatastasisFoititon[nextEmptyRow][2] = course.getKodikosMathimatos();
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
            Date date = new Date();
            printAnalytikisKatastasisFoititon[nextEmptyRow][3] = formatter.format(date);
            
            printAnalytikisKatastasisFoititon[nextEmptyRow][4] = msg;
            printAnalytikisKatastasisFoititon[nextEmptyRow][5] = "";//imerominia exetasis
            printAnalytikisKatastasisFoititon[nextEmptyRow][6] = "";//vathmos
        }
        else if (ergasia.equalsIgnoreCase("Vathmologia"))
        {
            printAnalytikisKatastasisFoititon[nextEmptyRow][0] = "Βαθμολογία";
            printAnalytikisKatastasisFoititon[nextEmptyRow][1] = student.getAM();
            printAnalytikisKatastasisFoititon[nextEmptyRow][2] = course.getKodikosMathimatos();                        
            printAnalytikisKatastasisFoititon[nextEmptyRow][3] = "";//imerominia dilosis            
            printAnalytikisKatastasisFoititon[nextEmptyRow][4] = "";//minima
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
            Date date = new Date();
            printAnalytikisKatastasisFoititon[nextEmptyRow][5] = formatter.format(date);//imerominia exetasis
            printAnalytikisKatastasisFoititon[nextEmptyRow][6] = vathmos;
        }
        
    }
    
    public static String printCL()
    {
        Object[][] printAnalytikisKatastasisFoititon = Database.appDatabase.database.printAnalytikisKatastasisFoititon;
        String strToPrint = "";
        for (int i=0;i<7;i++)
        {
            for (int j=0;j<7;j++)
            {
                strToPrint += printAnalytikisKatastasisFoititon[i][j] + " ";
            }
            strToPrint += "\n";
        }        
        System.out.println(strToPrint);
        return strToPrint;
    }
}
