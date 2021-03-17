import java.util.Scanner;
/**
 * Считывает данные из консоли
 */
public class Inter {

    private final static Scanner scanner = new Scanner(System.in);

    public static String getValue() {
        return scanner.nextLine();
    }

}
