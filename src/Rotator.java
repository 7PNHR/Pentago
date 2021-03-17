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
                stringBuilder.append(quadrant.lines
                        .get(clockwise == Clockwise.CLOCKWISE ? 2 - j : j)
                        .charAt(clockwise == Clockwise.CLOCKWISE ? i : 2 - i));
            }
            newLines.put(i, stringBuilder.toString());
            stringBuilder = new StringBuilder();
        }
        quadrant.lines = newLines;
    }


}
