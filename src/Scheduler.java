import java.io.IOException;
import java.util.List;
import java.util.Collections;

/**
 * @author Fazoli
 */
public class Scheduler {

    public static void main(String[] args) throws IOException {
        // 70/30 for process  
        List listMinus = Core.makeProcess(70000, 5, 20);
        List listPlus = Core.makeProcess(30000, 25, 50);
  
        Collections.sort(listMinus);
        Collections.sort(listPlus);
        
        List result = Core.insertList(listMinus, listPlus);
        
        System.out.println(result.toString());
        
        
        Core.processFinished(result);
    }
}
