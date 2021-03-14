/**
 * Вращает Quadrant
 */
public class Rotator {

    public static Quadrant rotate(Quadrant quadrant, Clockwise clockwise){
        return clockwise==Clockwise.CLOCKWISE?clockwiseRotate(quadrant):counterClockwiseRotate(quadrant);
    }

    private static Quadrant clockwiseRotate(Quadrant quadrant){
        char first = quadrant.quadrant[1][1];
        quadrant.quadrant[1][1]=quadrant.quadrant[3][1];
        quadrant.quadrant[3][1]=quadrant.quadrant[3][3];
        quadrant.quadrant[3][3]=quadrant.quadrant[1][3];
        quadrant.quadrant[1][3]=first;
        first=quadrant.quadrant[1][2];
        quadrant.quadrant[1][2]=quadrant.quadrant[2][1];
        quadrant.quadrant[2][1]=quadrant.quadrant[3][2];
        quadrant.quadrant[3][2]=quadrant.quadrant[2][3];
        quadrant.quadrant[2][3]=first;
        return null;
    }

    private static Quadrant counterClockwiseRotate(Quadrant quadrant){
        char first = quadrant.quadrant[1][1];
        quadrant.quadrant[1][1]=quadrant.quadrant[1][3];
        quadrant.quadrant[1][3]=quadrant.quadrant[3][3];
        quadrant.quadrant[3][3]=quadrant.quadrant[3][1];
        quadrant.quadrant[3][1]=first;
        first=quadrant.quadrant[1][2];
        quadrant.quadrant[1][2]=quadrant.quadrant[2][3];
        quadrant.quadrant[2][3]=quadrant.quadrant[3][2];
        quadrant.quadrant[3][2]=quadrant.quadrant[2][1];
        quadrant.quadrant[2][1]=first;
        return null;
    }

}
