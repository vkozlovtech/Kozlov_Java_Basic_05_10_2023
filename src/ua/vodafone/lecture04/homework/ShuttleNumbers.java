package ua.vodafone.lecture04.homework;

public class ShuttleNumbers {
    public static void main(String[] args) {

        int[] shuttleNumber = new int[100];
        fillArrayExcludingFourAndNine(shuttleNumber);
        outputShuttleNumbers(shuttleNumber);
    }

    private static void fillArrayExcludingFourAndNine(int[] shuttleNumber) {
        int index = 0;
        while (index < shuttleNumber.length) {
            String stringShuttleNumber = String.valueOf(++shuttleNumber[index]);
            if (stringShuttleNumber.contains("4") || stringShuttleNumber.contains("9")) {
                continue;
            }
            if (index < (shuttleNumber.length - 1)) {
                shuttleNumber[index + 1] = Integer.parseInt(stringShuttleNumber);
                index++;
            } else {
                break;
            }
        }
    }

    private static void outputShuttleNumbers(int[] shuttleNumber) {
        for (int index = 1; index < (shuttleNumber.length + 1); index++) {
            System.out.println("The " + index + " shuttle has an assigned number: " + shuttleNumber[index - 1]);
        }
    }
}