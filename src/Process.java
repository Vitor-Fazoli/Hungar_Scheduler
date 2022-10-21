
import java.util.Random;

/**
 * @author Fazoli
 */
public class Process implements Comparable<Process>{

    private final int id;
    private int height;
    private static int counter = 1;
    private final int delta = 5;

    public Process(int processTime) {

        id = counter;
        counter++;

        Random rnd = new Random();

        height = processTime;

        if (rnd.nextBoolean()) {
            height -= rnd.nextInt(delta);
        } else {
            height += rnd.nextInt(delta);
        }

        if (height <= 1) {
            height = 1;
        }
    }
    public String toString()
    {
        return "(Process: " + this.id + "; " + this.height +")";
    }

    public int getHeight() {
        return height;
    }

    public int getId() {
        return id;
    }


    @Override
    public int compareTo(Process o) {
        
        if (this.height < o.height) {
            return -1;
        }
        if (this.height> o.height) {
            return 1;
        }
        return 0;
    }
}
