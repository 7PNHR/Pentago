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

    public Game() {
        Outer.printMessage("Для начала введите имена игроков\nИмя первого игрока:");
        this.firstPlayerName = Inter.getValue();
        Outer.printMessage("Имя второго игрока:");
        this.secondPlayerName = Inter.getValue();
        this.map = new Map();
    }

    public void run() {
        byte playerTurn = 1;
        while (true) {
            Outer.printMap(map);
            Outer.printMessage(String.format(messageFormat, firstPlayerName));
            String message = Inter.getValue();
            Message mess = MessageHandler.convertLine(message);
        }
    }

}
