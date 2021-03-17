import java.util.List;

public class Checker {

    public static boolean isMessageNormal(Message message) {
        return !(message.message != null ||
                message.qNumber < 1 || message.qNumber > 4
                || message.pNumber < 1 || message.pNumber > 9);
    }

    public static boolean isPlayerHaveWinRow(Map map, String symbol) {
        char[][] mergedMap = new char[6][6];
        String[] lines = new String[6];
        for (int i = 0; i < 6; i++) {
            lines[i]=map.quadrantHashMap.get(i<4?0:2).lines.get(i%3)+map.quadrantHashMap.get(i<4?1:3).lines.get(i%3);
        }
        for (int i = 0; i < lines.length; i++) {
            mergedMap[i] = lines[i].toCharArray();
        }

        return false;
    }

}
