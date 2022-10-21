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
        List list = Core.makeProcess(sc.nextInt(), 0, 10);
        System.out.print("Digite a quantidade de processos: ");
        List list2 = Core.makeProcess(sc.nextInt(), 10, 20);
        
        Collections.sort(list);
        Collections.sort(list2);
    }
}
