/**
 * Хранит в себе всю карту игры
 */
public class Map {

    Quadrant[][] quadrants;

    public Map() {
        quadrants = new Quadrant[][]{
                {new Quadrant(), new Quadrant()},
                {new Quadrant(), new Quadrant()}
        };
    }

}
