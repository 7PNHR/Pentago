import java.util.HashMap;

/**
 * Вращает Quadrant
 */

public class Rotator {

    public static void rotate(Quadrant quadrant, Clockwise clockwise) {
        HashMap<Integer, String> newLines = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                stringBuilder.append(quadrant.lines.get(2 - j).charAt(i));
            }
            if(clockwise==Clockwise.CLOCKWISE)
                newLines.put(i , stringBuilder.toString());
            else
                newLines.put(2-i , stringBuilder.reverse().toString());
            stringBuilder = new StringBuilder();
        }
        quadrant.lines = newLines;
    }


}
