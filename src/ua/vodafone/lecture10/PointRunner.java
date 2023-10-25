package ua.vodafone.lecture10;

public class PointRunner {
    public static void main(String[] args) {
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
                + "\n" + Point.comparePoints(firstPoint, secondPoint));

        Point copiedFirstPoint = new Point(firstPoint);
        System.out.println("\n-= Copy first point via constructor =-\n" +
                "Copied point coordinates: " + copiedFirstPoint);

        Point copiedSecondPoint = Point.clone(secondPoint);
        System.out.println("\n-= Copy second point via method clone =-\n" +
                "Copied point coordinates: " + copiedSecondPoint);
    }
}
