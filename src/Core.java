
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author fazoli
 */
public class Core {
    
       public static List<Process> makeProcess(int n) {
        Random rnd = new Random();
        List<Process> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Process p1 = new Process(rnd.nextInt(40));
            System.out.println(p1.getHeight());
            list.add(p1);
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
