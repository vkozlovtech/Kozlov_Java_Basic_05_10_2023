package ua.vodafone.lecture05;

public class Lecture05 {
    public static void main(String[] args) {
        int angleCount = 3;
        ifElseDemo(angleCount);
    }

    private static void ifElseDemo(int angles) {

        if (angles == 3) {
            System.out.println("Triangle");
        } else if (angles == 4) {
            System.out.println("Square");
        } else {
            System.out.println("Unknown");
        }
    }
}
