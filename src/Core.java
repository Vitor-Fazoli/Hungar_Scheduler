
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
            System.out.println(p1.getHeight());
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
        
        int size = lMinus.size();
        boolean swap = false;
        
        List<Process> list = new ArrayList<>();
        for(int i = 0; i <= size; i++){
            if(swap){
                list.add(lMinus.get(i));
                swap = false;
            }else{
                list.add(lPlus.get(i));
                swap = true;
            }
        }
        
        return list;
    }
    
    public static void processFinished() {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            System.out.print(".");
            count++;
            if (i == 100) {
                System.out.println("processo realizado");
            }
        }
    }
}
