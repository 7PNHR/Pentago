public class GameInitialization {

    private static final String firstPlayerStandardName = "Player1";
    private static final String secondPlayerStandardName = "Player2";
    private static final String firstPlayerStandardSymbol = "X";
    private static final String secondPlayerStandardSymbol = "O";

    public static Game getGame(boolean needGetNames, boolean needGetSymbols) {
        String[] names = new String[]{firstPlayerStandardName,secondPlayerStandardName};
        String[] symbols = new String[]{firstPlayerStandardSymbol,secondPlayerStandardSymbol};
        if(needGetNames) names=getNames();
        if(needGetSymbols) names=getSymbols();
        return new Game(new Player(names[0],symbols[0]), new Player(names[1],symbols[1]));
    }

    private static String[] getNames() {
        String[] names = new String[2];
        Outer.printMessage("Введите имена игроков\nИмя первого игрока:");
        names[0] = Inter.getValue();
        Outer.printMessage("Имя второго игрока:");
        names[1] = Inter.getValue();
        return names;
    }

    private static String[] getSymbols() {
        String[] symbols = new String[2];
        Outer.printMessage("Введите символы игроков(1 символ (X,O,P,8,W и т.д.))\nСимвол первого игрока:");
        symbols[0] = Inter.getValue();
        Outer.printMessage("Символ второго игрока:");
        symbols[1] = Inter.getValue();
        return symbols;
    }


}
