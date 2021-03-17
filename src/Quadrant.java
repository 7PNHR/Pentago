import java.util.HashMap;

/**
 * Хранит в себе один из 4 квадрантов
 */
public class Quadrant {

    HashMap<Integer,String> lines = new HashMap<>();

    public Quadrant() {
        for (int i = 0; i < 3; i++) {
            lines.put(i,"***");
        }
    }

}
