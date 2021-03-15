public class Inspector {

    public static boolean checkMessage(Message message){
        if(message.message!=null && (message.message.equals("Mistake")||message.message.equals("Empty Line")))
            return false;
        return !(message.qNumber<1 || message.qNumber>4
                || message.pNumber<1 || message.pNumber>9);
    }



}
