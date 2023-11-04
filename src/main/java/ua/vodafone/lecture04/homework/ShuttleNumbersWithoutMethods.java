package main.java.ua.vodafone.lecture04.homework;

public class ShuttleNumbersWithoutMethods {
    public static void main(String[] args) {

        int[] intShuttleNumber = new int[100];

        int index = 0;
        while (index < intShuttleNumber.length) {
            String stringShuttleNumber = String.valueOf(++intShuttleNumber[index]);
            if (stringShuttleNumber.contains("4") || stringShuttleNumber.contains("9")) {
                continue;
            }
            if (index < (intShuttleNumber.length - 1)) {
                intShuttleNumber[index + 1] = Integer.parseInt(stringShuttleNumber);
                index++;
            } else {
                break;
            }
        }

        for (int number = 1; number < (intShuttleNumber.length + 1); number++) {
            System.out.println("The " + number + " shuttle has an assigned number: " + intShuttleNumber[number - 1]);
        }
    }
}
