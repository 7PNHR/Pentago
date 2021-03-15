public class Message {

    public int qNumber;
    public int pNumber;
    public Clockwise clockwise;
    public String message = null;

    public Message(int qNumber, int pNumber, Clockwise clockwise) {
        this.clockwise = clockwise;
        this.pNumber = pNumber;
        this.qNumber = qNumber;
    }

    public Message(String message) {
        this.message = message;
    }

}
