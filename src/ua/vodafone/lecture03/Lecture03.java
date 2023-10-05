package ua.vodafone.lecture03;

import java.util.Scanner;

public class Lecture03 {
    public static void main(String[] args) {
 /*       long myLong = 12412354214L;
        float myFloat = 1.2F;
        double myDouble = 1.2;

        int a = 10;
        int b = 42;
        System.out.println("Started");
        calculateWithResult (a, b);
        System.out.println("FINISHED");
        doublesCompare();

        Scanner scanner = new Scanner(System.in);
        System.out.println("input data: ");
        String line = scanner.nextLine();
        System.out.println("input int: ");
        int x = scanner.nextInt();
        System.out.println("Your input: " + line);
        System.out.println("Your input: " + a);

        bitOperations();
        */

        ifExample();
    }

    private static void ifExample() {
        int age = 10;
        if (age < 0) {
            System.out.println("Wrong value");
        } else {
            System.out.println("Your age is " + age);
        }
    }

    private static void bitOperations() {
        byte a = 10;
        byte b = 13;
        System.out.println("and: " + (a & b));
        System.out.println("or: " + (a | b));
        System.out.println("xor: " + (a ^ b));
    }

    public static void calculate(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    public static int calculateWithResult(int a, int b) {
        System.out.println("a + b = " + (a + b));
        int result = a + b;
        System.out.println(result);
        return result;

    }

    public static void doublesCompare() {
        double a = 0.1 * 10;

        double b = 0;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;
        b += 0.1;

        double eps = 0.00000001;
        //    System.out.println("Compare result: " + (a==b));
        System.out.println("Compare result: " + (Math.abs(a - b) < eps));
    }

}
