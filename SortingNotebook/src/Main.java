import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int rndPrice(int min, int max, int step) {
        max -= min;
        return (int) ((Math.random() * ++max) + min) / step * step;


    }

    public static int rndMemory(int min, int max, int step) {
        max -= min;
        return (int) ((Math.random() * ++max) + min) / step * step;


    }

    public static String rndName() {
        return NoteBookManufacturer.names[rnd(0, 4)];
    }

    public static void main(String[] args) {
        ArrayList<Notebook> notebooks = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            notebooks.add(new Notebook(rndPrice(500, 3000, 50), rndMemory(4, 24, 4), rndName()));

        }
        for (Notebook n : notebooks
        ) {
            System.out.println(n.toString());
        }
        Collections.sort(notebooks);
        System.out.println("________________________________________");
        for (Notebook n : notebooks
        ) {
            System.out.println(n.toString());
        }
    }
}
