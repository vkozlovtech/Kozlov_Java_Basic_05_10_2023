package main.java.ua.vodafone.lecture06.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int minAge = 18;
        int maxAge = 40;
        int[] firstTeamPlayersAge = generatePlayersAge(minAge, maxAge);
        int[] secondTeamPlayersAge = generatePlayersAge(minAge, maxAge);

        System.out.print("Please enter name of the first team: ");
        String firstTeamName = SCANNER.nextLine();
        System.out.print("Please enter name of the second team: ");
        String secondTeamName = SCANNER.nextLine();

        System.out.println("--------------------------------------------------------------------------");
        outputPlayersAge(firstTeamName, firstTeamPlayersAge);

        System.out.println("--------------------------------------------------------------------------");
        outputPlayersAge(secondTeamName, secondTeamPlayersAge);
    }

    private static double calculateAverageAge(int[] playersAge) {
        int totalAge = 0;
        for (int age : playersAge) {
            totalAge += age;
        }
        return (double) totalAge / playersAge.length;
    }

    private static void outputPlayersAge(String teamName, int[] playersAge) {
        System.out.println("The age of each player from the '" + teamName + "' team: ");
        for (int age : playersAge) {
            System.out.print(age + " ");
        }
        System.out.println();
        System.out.println("The average age of the player is "
                + Math.round(calculateAverageAge(playersAge)) + " years old.");
    }

    private static int[] generatePlayersAge(int minAge, int maxAge) {
        int[] playersAge = new int[25];
        for (int i = 0; i < playersAge.length; i++) {
            int age = ThreadLocalRandom.current().nextInt(minAge, maxAge + 1);
            playersAge[i] = age;
        }
        return playersAge;
    }
}
