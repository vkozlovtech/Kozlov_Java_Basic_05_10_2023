package ua.vodafone.lecture10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void toOtherDistanceCalculation() {
        Point firstPoint = new Point(1, 2);
        Point secondPoint = new Point(3, 4);
        double result = firstPoint.calculateDistanceToOther(secondPoint);
        Assertions.assertEquals(2.8284271247461903, result);
    }

    @Test
    public void toOtherFirstPointNull() {
        Point firstPoint = null;
        Point secondPoint = new Point(3, 4);
        Assertions.assertThrows(NullPointerException.class, () -> firstPoint.calculateDistanceToOther(secondPoint));
    }

    @Test
    public void toOtherSecondPointNull() {
        Point firstPoint = new Point(1, 2);
        Point secondPoint = null;
        double result = firstPoint.calculateDistanceToOther(secondPoint);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void betweenTwoDistanceCalculation() {
        Point firstPoint = new Point(3, 4);
        Point secondPoint = new Point(8, 8);
        double result = Point.calculateDistanceBetweenTwo(firstPoint, secondPoint);
        Assertions.assertEquals(6.4031242374328485, result);
    }

    @Test
    public void betweenTwoFirstPointNull() {
        Point firstPoint = null;
        Point secondPoint = new Point(8, 8);
        double result = Point.calculateDistanceBetweenTwo(firstPoint, secondPoint);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void betweenTwoSecondPointNull() {
        Point firstPoint = new Point(3, 4);
        Point secondPoint = null;
        double result = Point.calculateDistanceBetweenTwo(firstPoint, secondPoint);
        Assertions.assertEquals(-1, result);
    }
}
