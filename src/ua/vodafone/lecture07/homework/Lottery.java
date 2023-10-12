package ua.vodafone.lecture07.homework;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {

        int[] companyNumbers = generateNumbers();
        int[] playerNumbers = generateNumbers();

        System.out.println("(Original)");
        System.out.println("Company guessed numbers: ");
        printNumbers(companyNumbers);
        System.out.println("\nPlayer guessed numbers: ");
        printNumbers(playerNumbers);

        numbersSort(companyNumbers);
        numbersSort(playerNumbers);

        System.out.println("\n\n(Sorted)");
        System.out.println("Company guessed numbers: ");
        printNumbers(companyNumbers);
        System.out.println("\nPlayer guessed numbers: ");
        printNumbers(playerNumbers);

        System.out.println("\n\nNumber of coincidences = " + compareNumbers(companyNumbers, playerNumbers));
    }

    private static int compareNumbers(int[] companyNumbers, int[] playerNumbers) {
        int coincidence = 0;
        for (int i = 0; i < Math.min(companyNumbers.length, playerNumbers.length); i++) {
            if (companyNumbers[i] == playerNumbers[i]) {
                coincidence++;
            }
        }
        return coincidence;
    }

    private static void numbersSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j);
                }
            }
        }
    }

    private static void swap(int[] numbers, int j) {
        int tmp = numbers[j];
        numbers[j] = numbers[j + 1];
        numbers[j + 1] = tmp;
    }

    private static void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static int[] generateNumbers() {
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) {
            int number = ThreadLocalRandom.current().nextInt(10);
            numbers[i] = number;
        }
        return numbers;
    }
}
