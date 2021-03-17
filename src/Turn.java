import java.util.List;

public class Turn {

    public static TurnResult getTurnResult(Message message, Map map, Player currentPlayer, Player anotherPlayer) {
        Quadrant quadrant = map.quadrantHashMap.get(message.qNumber - 1);
        String line = quadrant.lines.get((message.pNumber - 1) / 3);
        if (line.charAt((message.pNumber - 1) % 3) == '*') {
            char[] newLine = line.toCharArray();
            newLine[(message.pNumber - 1) % 3] = currentPlayer.getSymbol().charAt(0);
            quadrant.lines.put((message.pNumber - 1) / 3, String.valueOf(newLine));
            boolean value = Checker.isPlayerHaveWinRow(map, currentPlayer.getSymbol());
            return new TurnResult(true, value);
        } else
            return new TurnResult(false, false);
    }

}
