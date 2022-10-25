
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author fazoli
 */
public class Core {
    
    public static List<Process> makeProcess(int n, int initial, int finall) {
        Random rnd = new Random();
        List<Process> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Process p1 = new Process(rnd.nextInt(initial, finall));
            list.add(p1);
        }

        return list;
    }
    
    /**
     *  
     * @param lMinus use the list with the lowest values
     * @param lPlus use the list with the highest values
     * @return a list which intercalate between the lists
    */
    public static List<Process> insertList(List<Process> lMinus, List <Process> lPlus){
        
        boolean swap = true;
            
        
        List<Process> list = new ArrayList<>();
        for(int i = 0; i < lPlus.size(); i++){
            if(swap){
                list.add(lMinus.get(i));
                swap = false;
            }else{
                list.add(lPlus.get(i));
                swap = true;
            }
        }

        for(int i = lPlus.size(); i < lMinus.size() ; i++){
            list.add(lMinus.get(i));
        }
        
        return list;
    }
    private static void processing(){
        for(int i =0; i <= 100; i++){
            if(i == 100){
                System.out.println(".");
            }
        }
    }
    public static void processFinished(List<Process> o) {
        
        for(int i = 0; i < o.size(); i++){
            int height = o.get(i).getHeight();
            for (int k = 0; k <= height; k++) {
                    processing();
            }
        }
    }
}
