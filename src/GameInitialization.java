public class GameInitialization {

    private static final String firstPlayerStandardName = "Player1";
    private static final String secondPlayerStandardName = "Player2";
    private static final char firstPlayerStandardSymbol = 'X';
    private static final char secondPlayerStandardSymbol = '0';

    public static Game getGame(boolean needGetNames, boolean needGetSymbols) {
        String[] names = new String[]{firstPlayerStandardName,secondPlayerStandardName};
        char[] symbols = new char[]{firstPlayerStandardSymbol,secondPlayerStandardSymbol};
        if(needGetNames) names=getNames();
        if(needGetSymbols) symbols=getSymbols();
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

    private static char[] getSymbols() {
        char[] symbols = new char[2];
        Outer.printMessage("Введите символы игроков(1 символ (X,O,P,8,W и т.д.))\nСимвол первого игрока:");
        symbols[0] = Inter.getValue().charAt(0);
        Outer.printMessage("Символ второго игрока:");
        symbols[1] = Inter.getValue().charAt(0);
        return symbols;
    }


}
