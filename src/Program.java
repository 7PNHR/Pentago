public class Program {

    public static void main(String[] args){
        Outer.printMessage("Для начала введите имена игроков\nИмя первого игрока:");
        String firstName = Inter.getValue();
        Outer.printMessage("Имя второго игрока:");
        String secondName = Inter.getValue();
        Game game = new Game(firstName,secondName);
        game.run();
    }

}
