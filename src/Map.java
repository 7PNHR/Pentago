import java.util.HashMap;

/**
 * Хранит в себе всю карту игры
 */
public class Map {

    HashMap<Integer, Quadrant> quadrantHashMap = new HashMap<>();

    public Map() {
        for (int i = 0; i < 4; i++) {
            quadrantHashMap.put(i, new Quadrant());
        }
    }

}
