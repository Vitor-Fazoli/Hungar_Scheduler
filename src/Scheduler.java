import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

/**
 * @author Fazoli
 */
public class Scheduler {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de processos: ");
        List list = Core.makeProcess(sc.nextInt());
        
        Collections.sort(list);
        
        System.out.println(list.toString());
        
    }
}
