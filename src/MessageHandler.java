public class MessageHandler {

    public static Message convertLine(String inputLine){
        if(inputLine.length()==0) return new Message("Empty Line");
        String[] array = inputLine.split(" ");
        if(array.length==1 && array[0].equals("rules") ) return new Message(inputLine);
        else if(array.length==3) {
            int qNumber = Integer.parseInt(array[0]);
            int pNumber = Integer.parseInt(array[1]);
            Clockwise clockwise = array[2].equals("c") ? Clockwise.CLOCKWISE : Clockwise.COUNTER_CLOCKWISE;
            return new Message(qNumber,pNumber,clockwise);
        }
        else return new Message("Mistake");
    }


}

