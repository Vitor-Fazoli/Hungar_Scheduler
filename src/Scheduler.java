import java.io.IOException;
import java.util.List;
import java.util.Collections;

/**
 * @author Fazoli
 */
public class Scheduler {

    public static void main(String[] args) throws IOException {
        // 70/30 for process  
        List listMinus = Core.makeProcess(7000, 10, 20);
        List listPlus = Core.makeProcess(3000, 100, 200);
  
        Collections.sort(listMinus);
        Collections.sort(listPlus);
        
        List result = Core.insertList(listMinus, listPlus);
        
        
        Core.processFinished(result);
    }
}
