package ua.vodafone.lecture10;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        x = point.x;
        y = point.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateDistanceToOther(Point otherPoint) {
        if (otherPoint != null) {
            return calculateDistanceBetweenTwo(this, otherPoint);
        }
        return -1;
    }

    public static double calculateDistanceBetweenTwo(Point firstPoint, Point secondPoint) {
        if (firstPoint != null && secondPoint != null) {
            return Math.sqrt(Math.pow((secondPoint.x - firstPoint.x), 2) + Math.pow((secondPoint.y - firstPoint.y), 2));
        }
        return -1;
    }

    public static String comparePoints(Point firstPoint, Point secondPoint) {
        boolean equals = firstPoint.equals(secondPoint);
        if (equals) {
            return "Points are equal.";
        }
        return "Points are different.";
    }

    public static Point clone(Point point) {
        return new Point(point.x, point.y);
    }

    @Override
    public String toString() {
        return "{" + "x=" + x + ", y=" + y + "}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Point point = (Point) object;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
