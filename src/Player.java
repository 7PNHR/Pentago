import java.util.List;

public class Player {

    private final String name;
    private final String symbol;
    public boolean haveWinningRow;

    public Player(String playerName, String playerSymbol) {
        this.name = playerName;
        this.symbol = playerSymbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

}
