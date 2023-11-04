package main.java.ua.vodafone.lecture04.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        // Settings

        int minValue = 0;
        int maxValue = 10;
        int maxAttempts = 3;

        int randomValue = ThreadLocalRandom.current().nextInt(minValue, maxValue + 1);
        System.out.print("Enter the number that the computer guessed in the range from "
                + minValue + " to " + maxValue + ": ");
        int userValue = readInt(minValue, maxValue);

        for (int i = 0; i < maxAttempts; i++) {
            if (randomValue == userValue) {
                System.out.println("Congratulations! Your number matches the one guessed by the computer!");
                break;
            } else if (i == (maxAttempts - 1)) {
                System.out.println("The allowed number of attempts (" + maxAttempts
                        + ") has been reached, please restart the program.");
            } else {
                System.out.print("Oops! Number did not match, please re-enter it: ");
                userValue = readInt(minValue, maxValue);
            }
        }
    }

    private static int readInt(int minValue, int maxValue) {
        int userValue = SCANNER.nextInt();
        if (userValue < minValue | userValue > maxValue) {
            System.out.print("[Error] Entered value is out of range, please re-enter it: ");
            userValue = readInt(minValue, maxValue);
        }
        return userValue;
    }
}
