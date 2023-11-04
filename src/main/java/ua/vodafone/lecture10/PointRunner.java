package main.java.ua.vodafone.lecture10;

public class PointRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point firstPoint = new Point(1, 2);
        Point secondPoint = new Point(3, 4);
        Point thirdPoint = new Point(8, 8);

        System.out.println("-= Get separate coordinates / Get both coordinates =-\n" +
                "First point 'x' = " + firstPoint.getX() +
                "\nSecond point 'y' = " + secondPoint.getY() +
                "\nThird point coordinates: " + thirdPoint);

        System.out.println("\n-= Distances =-\n" +
                "Distance to other point: " + firstPoint.calculateDistanceToOther(secondPoint) +
                "\nDistance between two points: " + Point.calculateDistanceBetweenTwo(secondPoint, thirdPoint));

        System.out.println("\n-= Point comparison =-\n"
                + "First point coordinates: " + firstPoint
                + "\nSecond point coordinates: " + secondPoint
                + "\nComparison result: " + firstPoint.equals(secondPoint));

        Point copiedFirstPoint = new Point(firstPoint);
        System.out.println("\n-= Copy first point via constructor =-\n" +
                "Copied point coordinates: " + copiedFirstPoint
                + "\n[==] = " + (firstPoint == copiedFirstPoint)
                + "\n[equals] = " + (firstPoint.equals(copiedFirstPoint)));

        Point clonedSecondPoint = secondPoint.clone();
        System.out.println("\n-= Clone second point via method clone() =-\n" +
                "Cloned point coordinates: " + clonedSecondPoint
                + "\n[==] = " + (secondPoint == clonedSecondPoint)
                + "\n[equals] = " + (secondPoint.equals(clonedSecondPoint)));
    }
}
