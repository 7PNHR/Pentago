/**
 * Хранит в себе один из 4 квадрантов
 */
public class Quadrant {

    public char[][] quadrant;
    Color[][] colors;

    public Quadrant() {
        this.quadrant = new char[][]{
                {'┌', '─', '─', '─', '┐'},
                {'│', '*', '*', '*', '│'},
                {'│', '*', '*', '*', '│'},
                {'│', '*', '*', '*', '│'},
                {'└', '─', '─', '─', '┘'}
        };
        colors = new Color[][]{
                {Color.None, Color.None, Color.None},
                {Color.None, Color.None, Color.None},
                {Color.None, Color.None, Color.None}
        };
    }
}
