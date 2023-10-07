package ua.vodafone.lecture06.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int minAge = 18;
        int maxAge = 40;
        int teamSize = 25;
        int[] firstTeamPlayersAge = generatePlayersAge(minAge, maxAge, teamSize);
        int[] secondTeamPlayersAge = generatePlayersAge(minAge, maxAge, teamSize);

        System.out.print("Please enter name of the first team: ");
        String firstTeamName = SCANNER.nextLine();
        System.out.print("Please enter name of the second team: ");
        String secondTeamName = SCANNER.nextLine();
        System.out.println("--------------------------------------------------------------------------");

        outputPlayersAge(firstTeamName, firstTeamPlayersAge, teamSize);
        calculateAverageAge(teamSize, firstTeamPlayersAge);
        System.out.println("--------------------------------------------------------------------------");

        outputPlayersAge(secondTeamName, secondTeamPlayersAge, teamSize);
        calculateAverageAge(teamSize, secondTeamPlayersAge);
    }

    private static void calculateAverageAge(int teamSize, int[] playersAge) {
        double averageAge = (double) calculateTotalAge(playersAge, teamSize) / teamSize;
        System.out.println("Average player age: " + Math.round(averageAge) + ")");
    }

    private static int calculateTotalAge(int[] playersAge, int teamSize) {
        int totalAge = 0;
        for (int i = 0; i < teamSize; i++) {
            totalAge = totalAge + playersAge[i];
        }
        return totalAge;
    }

    private static void outputPlayersAge(String teamName, int[] playersAge, int teamSize) {
        System.out.println("The age of each player from the '" + teamName + "' team: ");
        for (int i : playersAge) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("(Total team age: " + calculateTotalAge(playersAge, teamSize) + ", ");
    }

    private static int[] generatePlayersAge(int minAge, int maxAge, int teamSize) {
        int[] teamPlayers = new int[teamSize];
        for (int i = 0; i < teamSize; i++) {
            int age = ThreadLocalRandom.current().nextInt(minAge, maxAge + 1);
            teamPlayers[i] = age;
        }
        return teamPlayers;
    }
}
