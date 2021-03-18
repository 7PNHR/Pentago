public class Player {

    private final String name;
    private final char symbol;
    public boolean haveWinningRow;

    public Player(String playerName, char playerSymbol) {
        this.name = playerName;
        this.symbol = playerSymbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public static String checkWinAndGetPlayer(Player firstPlayer, Player secondPlayer, Player currentPlayer){
        if (firstPlayer.haveWinningRow || secondPlayer.haveWinningRow) {
            if (firstPlayer.haveWinningRow && secondPlayer.haveWinningRow)
                return "Победила дружба!!!";
            else if (firstPlayer.haveWinningRow && currentPlayer!=firstPlayer)
                return(String.format("Победил %s", firstPlayer.getName()));
            else if(secondPlayer.haveWinningRow && currentPlayer!=secondPlayer)
                return(String.format("Победил %s", secondPlayer.getName()));
        }
        return null;
    }

}
