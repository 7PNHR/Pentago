/**
 * Инициализирует объекты других классов, необходимых для игры
 * и цикличит игру
 * *-пустое поле X-первый игрок 0-второй игрок
 */
public class Game {

    private final Map map;
    private final Player firstPlayer;
    private final Player secondPlayer;
    private static final String messageFormat = "%s, ваш ход, если вдруг забыли формат хода(rules):\n";
    private static final String rules = "Правила:\n" +
            "Всего 3 параметра:\n" +
            "1-число это номер квадранта 1 2 2-номер клетки 1 2 3 третий-номер вращаемого квадранта и 4 параметр это сторона вращения:\n" +
            "                            3 4                4 5 6                                                         c(clockwise)\n" +
            "                                               7 8 9                                                cc(counter-clockwise)\n";

    public Game(Player fp, Player sp) {
        firstPlayer = fp;
        secondPlayer = sp;
        this.map = new Map();
    }

    public void run() {
        byte playerTurn = 1;
        boolean isRulesMustBeShown = false;
        while (true) {
            Player currentPlayer = playerTurn % 2 == 1 ? firstPlayer : secondPlayer;
            Outer.printMap(map);
            if (isRulesMustBeShown) {
                Outer.printlnMessage(rules);
                isRulesMustBeShown = false;
            }
            Outer.printMessage(String.format(messageFormat, currentPlayer.getName()));
            String message = Inter.getValue();
            Message mess = MessageHandler.convertLine(message);
            if (!Checker.isMessageNormal(mess)) {
                if (mess.message.equals("rules"))
                    isRulesMustBeShown = true;
                continue;
            }
            TurnResult turnResult = Turn.getTurnResult(mess, map, currentPlayer, playerTurn % 2 != 1 ? firstPlayer : secondPlayer);
            if (turnResult.isCurrentPlayerHaveRow)
                currentPlayer.haveWinningRow = true;
            if (turnResult.isReal) playerTurn++;
            String line = Player.checkWinAndGetPlayer(firstPlayer,secondPlayer,currentPlayer);
            if(line!=null){
                Outer.printlnMessage(line);
                return;
            }
        }
    }

}
