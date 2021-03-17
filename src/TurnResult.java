import java.util.List;

public class TurnResult {

    public boolean isReal = false;
    public boolean isCurrentPlayerHaveRow = false;

    public TurnResult(boolean isReal, boolean isCurrentPlayerHaveRow){
        this.isReal=isReal;
        this.isCurrentPlayerHaveRow=isCurrentPlayerHaveRow;
    }

}
