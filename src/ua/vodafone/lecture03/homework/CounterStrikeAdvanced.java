package ua.vodafone.lecture03.homework;

import java.util.Scanner;

public class CounterStrikeAdvanced {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static int teamFrags = 0;

    public static void main(String[] args) {

        // Counter-terrorists data input

        System.out.print("Enter counter-terrorists team name: ");
        String counterTerroristsName = SCANNER.nextLine();
        System.out.println("Enter the number of frags for each of the 5 players:");
        int counterTerroristsFrags = fragCounter(teamFrags);
        double counterTerroristsAverage = (double) counterTerroristsFrags / 5;
        System.out.println("Counter-terrorists have " + counterTerroristsAverage + " frags in average.");
        System.out.println("--------------------------------------------------------");

        // Terrorists data input

        String tmp = SCANNER.nextLine();
        System.out.print("Enter terrorists team name: ");
        String terroristsName = SCANNER.nextLine();
        System.out.println("Enter the number of frags for each of the 5 players:");
        int terroristsFrags = fragCounter(teamFrags);
        double terroristsAverage = (double) terroristsFrags / 5;
        System.out.println("Terrorists have " + terroristsAverage + " frags in average.");
        System.out.println("--------------------------------------------------------");

        // Determination of the winner

        if (counterTerroristsAverage > terroristsAverage) {
            System.out.println("Counter-terrorists team '" + counterTerroristsName + "' won with "
                    + counterTerroristsAverage + " frags in average.");
        } else if (counterTerroristsAverage < terroristsAverage) {
            System.out.println("Terrorists team '" + terroristsName + "' won with "
                    + terroristsAverage + " frags in average.");
        } else {
            System.out.println("A draw, the teams have the same average number of frags.");
        }

    }

    private static int fragCounter(int teamFrags) {
        for (int i = 0; i < 5; i++) {
            int playerFrags = SCANNER.nextInt();
            teamFrags += playerFrags;
        }
        return teamFrags;
    }
}
