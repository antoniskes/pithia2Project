
package Controllers;
import Model.*;
public class ProsopikaStoixeiaCON {
    
    public static Object[] getDetails(Foititis student){
        int AM = student.getAM();
        int eksamino = student.getEksamino();
        String onomatEpwnymo = student.getOnomatEpwnymo();
        String username = student.getUsername();
        
        Object returnData[] = new Object[4];
        returnData[0] = AM;
        returnData[1] = eksamino;
        returnData[2] = onomatEpwnymo;
        returnData[3] = username;
        
        return returnData;
    }
}
