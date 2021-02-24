package Main;
import Controllers.*;
import Model.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        createDatabase();
        //Database.saveDatabase() is called in above methods        
        
        Database.initDatabase();                                
        
    }
    public static void createDatabase() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        addCourses();
        addStudents();
        addSuperUsers();
    }
    public static void addStudents() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        //(String username, String password, String onomatEpwnymo, int AM, int eksamino, String email)
        Logariasmos student1 = new Foititis("f151234","pass", "ΑΘΑΝΑΣΙΟΥ ΚΙΜΩΝ", 151234, 9, "f151234@ihu.edu.gr");
        Logariasmos student2 = new Foititis("f163217","pass", "ΒΑΣΙΛΕΙΑΔΟΥ ΑΝΔΡΟΜΑΧΗ", 163217, 7, "f163217@ihu.edu.gr");
        Logariasmos student3 = new Foititis("f172278","pass", "ΓΕΩΡΓΙΟΥ ΑΛΚΗΣ", 172278, 5, "f172278@ihu.edu.gr");
        
        Database.appDatabase.database.accounts.add(student1);
        Database.appDatabase.database.accounts.add(student2);
        Database.appDatabase.database.accounts.add(student3);
        
        Database.saveDatabase();
        
    }
    public static void addSuperUsers() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        Logariasmos admin = new Diaxeiristis("admin", "admin", "admin");
        
        Logariasmos teacher1 = new Kathigitis("teacher1", "teacher1", "teacher1", "0001");
        ((Kathigitis)teacher1).addDidaskomenoMathima(new Mathima("Αντικειμενοστρεφής Προγραμματισμός (Θ)", "1205-Θ", 3, 6, true, 6, null));
        ((Kathigitis)teacher1).addDidaskomenoMathima(new Mathima("Αντικειμενοστρεφής Προγραμματισμός (Ε)", "1205-Ε", 3, 6, true, 6, null));      
        
        Logariasmos teacher2 = new Kathigitis("teacher2", "teacher2", "teacher2", "0002");
        ((Kathigitis)teacher2).addDidaskomenoMathima(new Mathima("Δομές Δεδομένων και Ανάλυση Αλγορίθμων","1305-Θ", 7, 6, true, 6, new Mathima("Αντικειμενοστρεφής Προγραμματισμός (Θ)", "1205-Θ", 3, 6, true, 6, null)));
        ((Kathigitis)teacher2).addDidaskomenoMathima(new Mathima("ΜΗΧΑΝΙΚΗ ΛΟΓΙΣΜΙΚΟΥ","1742-Θ", 7, 4, false, 6, new Mathima("Αντικειμενοστρεφής Προγραμματισμός (Θ)", "1205-Θ", 3, 6, true, 6, null)));
        
        Logariasmos grammateia = new Grammateia("clerk", "clerk", "clerk");
        Database.appDatabase.database.accounts.add(admin);
        Database.appDatabase.database.accounts.add(teacher1);
        Database.appDatabase.database.accounts.add(teacher2);
        Database.appDatabase.database.accounts.add(grammateia);
        
        Database.saveDatabase();
    }
    public static void addCourses() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        //(String onomaMathimatos, int kodikosMathimatos, int eksamino, int oresDidaskalias, boolean ergastiriakoMeros, int ECTS)
        Mathima mathima1 = new Mathima("Αντικειμενοστρεφής Προγραμματισμός (Θ)", "1205-Θ", 3, 6, true, 6, null);
        Mathima mathima2 = new Mathima("Αντικειμενοστρεφής Προγραμματισμός (Ε)", "1205-Ε", 3, 6, true, 6, null);
        Mathima mathima3 = new Mathima("Δομές Δεδομένων και Ανάλυση Αλγορίθμων","1305-Θ", 7, 6, true, 6, mathima1);        
        Mathima mathima4 = new Mathima("ΜΗΧΑΝΙΚΗ ΛΟΓΙΣΜΙΚΟΥ","1742-Θ", 7, 4, false, 6, mathima1);        
        
        Database.appDatabase.database.mathimata.add(mathima1);
        Database.appDatabase.database.mathimata.add(mathima2);
        Database.appDatabase.database.mathimata.add(mathima3);
        Database.appDatabase.database.mathimata.add(mathima4);
        
        Database.saveDatabase();
    }
}
