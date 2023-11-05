package ua.vodafone.lecture10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void toOtherEqualPoints() {
        // given
        Point firstPoint = new Point(1, 2);
        Point secondPoint = new Point(1, 2);

        // when
        double result = firstPoint.calculateDistanceToOther(secondPoint);

        // then
        Assertions.assertEquals(0, result, 0.001);
    }

    @Test
    public void toOtherDistanceCalculation() {
        // given
        Point firstPoint = new Point(1, 2);
        Point secondPoint = new Point(3, 4);

        // when
        double result = firstPoint.calculateDistanceToOther(secondPoint);

        // then
        Assertions.assertEquals(2.8284271247461903, result, 0.001);
    }

    @Test
    public void toOtherSecondPointNull() {
        // given
        Point firstPoint = new Point(1, 2);
        Point secondPoint = null;

        // when
        double result = firstPoint.calculateDistanceToOther(secondPoint);

        // then
        Assertions.assertEquals(-1, result, 0.001);
    }

    @Test
    public void betweenTwoDistanceCalculation() {
        // given
        Point firstPoint = new Point(3, 4);
        Point secondPoint = new Point(8, 8);

        // when
        double result = Point.calculateDistanceBetweenTwo(firstPoint, secondPoint);

        // then
        Assertions.assertEquals(6.4031242374328485, result, 0.001);
    }

    @Test
    public void betweenTwoFirstPointNull() {
        // given
        Point firstPoint = null;
        Point secondPoint = new Point(8, 8);

        // when
        double result = Point.calculateDistanceBetweenTwo(firstPoint, secondPoint);

        // then
        Assertions.assertEquals(-1, result, 0.001);
    }

    @Test
    public void betweenTwoSecondPointNull() {
        // given
        Point firstPoint = new Point(3, 4);
        Point secondPoint = null;

        // when
        double result = Point.calculateDistanceBetweenTwo(firstPoint, secondPoint);

        // then
        Assertions.assertEquals(-1, result, 0.001);
    }

    @Test
    public void betweenTwoBothPointsNull() {
        // given
        Point firstPoint = null;
        Point secondPoint = null;

        // when
        double result = Point.calculateDistanceBetweenTwo(firstPoint, secondPoint);

        // then
        Assertions.assertEquals(-1, result, 0.001);
    }
}
