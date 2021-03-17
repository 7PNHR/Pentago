import java.util.HashMap;
/**
 * Отрисовывает игровое поле
 */
public class Outer {

    private static HashMap<Integer, Integer> pairs;

    public static void printMap(Map map) {
        if (pairs == null)
            pairs = createPairs();
        printlnMessage(getMapWithFrame(map));
    }

    private static HashMap<Integer, Integer> createPairs() {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        pairs.put(1, 0);
        pairs.put(2, 1);
        pairs.put(3, 2);
        pairs.put(5, 0);
        pairs.put(6, 1);
        pairs.put(7, 2);
        return pairs;
    }

    private static String getMapWithFrame(Map map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (i == 0)
                stringBuilder.append("┌───────┐\n");
            else if (i == 4)
                stringBuilder.append("│───┼───│\n");
            else if (i == 8)
                stringBuilder.append("└───────┘\n");
            else {
                stringBuilder.append("│")
                        .append(map.quadrantHashMap.get(i < 4 ? 0 : 2).lines.get(pairs.get(i)))
                        .append("|")
                        .append(map.quadrantHashMap.get(i < 4 ? 1 : 3).lines.get(pairs.get(i)))
                        .append("|\n");
            }
        }
        return stringBuilder.toString();
    }

    public static void printlnMessage(String message) {
        if (message != null) System.out.println(message);
    }

    public static void printMessage(String message) {
        if (message != null) System.out.print(message);
    }

}
/*
Тут были варики как представлять
┌───────┐
│***│***│
│***│***│
│***│***│
│───┼───│
│***│***│
│***│***│
│***│***│
└───────┘

┌───┐ ┌───┐
│***│ │***│
│***│ │***│
│***│ │***│
└───┘ └───┘
┌───┐ ┌───┐
│***│ │***│
│***│ │***│
│***│ │***│
└───┘ └───┘

***|***
***|***
***|***
-------
***|***
***|***
***|***

*** ***
*** ***
*** ***
*** ***
*** ***
*** ***
*/
