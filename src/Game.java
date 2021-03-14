/**
 * Инициализирует объекты других классов, необходимых для игры
 * и цикличит игру
 * *-пустое поле X-первый игрок 0-второй игрок
 */
public class Game {

    private final Map map;
    private final String firstPlayerName;
    private final String secondPlayerName;
    private static final String messageFormat = "%s, ваш ход, если вдруг забыли формат хода(rules):\n";

    private static final String rules = "Правила:\n" +
            "Всего 3 параметра:\n" +
            "1-число это номер квадранта 1 2 2-номер клетки 1 2 3 и третий параметр это сторона вращения:\n" +
            "                            3 4                4 5 6                            c(clockwise)\n" +
            "                                               7 8 9                   cc(counter-clockwise)\n";

    public Game(String firstPlayerName, String secondPlayerName) {
        this.map = new Map();
        this.firstPlayerName = String.valueOf(firstPlayerName.toCharArray());
        this.secondPlayerName = String.valueOf(secondPlayerName.toCharArray());
    }

    public void run() {
        Outer.printMap(map);
        Outer.printMessage(String.format(messageFormat,firstPlayerName));
        String message = Inter.getValue();
        Message mess = MessageHandler.convertLine(message);

    }

}
