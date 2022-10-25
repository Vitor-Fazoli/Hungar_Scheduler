import java.io.IOException;
import java.util.List;
import java.util.Collections;

/**
 * @author Fazoli
 */
public class Scheduler {

    public static void main(String[] args) throws IOException {
        // 70/30 for process  
        double initialTime = System.currentTimeMillis();
        List listMinus = Core.makeProcess(14, 10, 20);
        List listPlus = Core.makeProcess(6, 50, 200);
  
        Collections.sort(listMinus);
        Collections.sort(listPlus);
        
        List result = Core.insertList(listMinus, listPlus);
        
        Core.processFinished(result);
        double finishTime = System.currentTimeMillis();
        
        System.out.println(finishTime - initialTime + " Miliseconds");
    }
}
