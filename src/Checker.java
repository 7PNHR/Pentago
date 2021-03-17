import java.util.ArrayList;
import java.util.List;

public class Checker {

    public static boolean isMessageNormal(Message message) {
        return !(message.message != null ||
                message.qNumber < 1 || message.qNumber > 4
                || message.pNumber < 1 || message.pNumber > 9);
    }

    public static boolean isPlayerHaveWinRow(Map map, String symbol) {
        char[][] mergedMap = new char[6][6];
        for (int i = 0; i < 6; i++) {
            mergedMap[i] = (map.quadrantHashMap.get(i < 4 ? 0 : 2).lines.get(i % 3)
                    + map.quadrantHashMap.get(i < 4 ? 1 : 3).lines.get(i % 3)).toCharArray();
        }
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (mergedMap[j][i] == symbol.charAt(0))
                    points.add(new Point(j, i));
            }
        }
        for (Point point : points) {
            boolean isWin = isPlayerHaveWinRow(mergedMap,symbol.charAt(0),point,new Point(0,0),0);
            if(isWin) return true;
        }
        return false;
    }

    private static boolean isPlayerHaveWinRow(char[][] map, char symbol, Point point, Point direction, int rowLength) {
        //Direction это точка с кооринатами от -1 до 1 показывающая направление
        int newX = point.x + direction.x;
        int newY = point.y + direction.y;
        if (direction.x == 0 && direction.y == 0) {
            for (int dy = -1; dy <= 1; dy++) {
                for (int dx = -1; dx <= 1; dx++) {
                    if (dy == 0 && dx == 0) continue;
                    boolean isWin = false;
                    if (newX >= 0 && newX < 6 && newY >= 0 && newY < 6 && map[newY][newX] == symbol)
                        isWin = isPlayerHaveWinRow(map, symbol, new Point(newX, newY), new Point(dx, dy), rowLength + 1);
                    if (isWin) return true;
                }
            }
        }
        else if (newX >= 0 && newX < 6 && newY >= 0 && newY < 6 && map[newY][newX] == symbol)
            return rowLength == 4 || isPlayerHaveWinRow(map, symbol, new Point(newX, newY), direction, rowLength + 1);
        return false;
    }

}
