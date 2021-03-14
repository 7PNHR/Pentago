/**
 * Отрисовывает игровое поле
 */
public class Outer {

    public static void printMap(Map map) {
        for (Quadrant[] quadrants : map.quadrants) {
            printQuadrant(quadrants);
        }
    }

    private static void printQuadrant(Quadrant... quadrant) {
        for (int i = 0; i < quadrant[0].quadrant.length; i++) {
            for (Quadrant value : quadrant) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(value.quadrant[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printlnMessage(String message){
        if(message!=null) System.out.println(message);
    }

    public static void printMessage(String message){
        if(message!=null) System.out.print(message);
    }

}
/*
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
