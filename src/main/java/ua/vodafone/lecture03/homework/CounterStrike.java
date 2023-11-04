package main.java.ua.vodafone.lecture03.homework;

import java.util.Scanner;

public class CounterStrike {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        // Counter-terrorists (ct) data input

        System.out.print("Enter counter-terrorists team name: ");
        String policeTeamName = SCANNER.nextLine();
        System.out.println("Enter the number of frags for each of the 5 players:");
        int policeFirst = SCANNER.nextInt();
        int policeSecond = SCANNER.nextInt();
        int policeThird = SCANNER.nextInt();
        int policeFourth = SCANNER.nextInt();
        int policeFifth = SCANNER.nextInt();
        double policeTeamAverage = (double) (policeFirst + policeSecond + policeThird + policeFourth + policeFifth) / 5;
        System.out.println("'" + policeTeamName + "' team have " + policeTeamAverage + " frags in average.");
        System.out.println("--------------------------------------------------------");

        // Terrorists (t) data input

        SCANNER.nextLine();
        System.out.print("Enter terrorists team name: ");
        String terroristTeamName = SCANNER.nextLine();
        System.out.println("Enter the number of frags for each of the 5 players:");
        int terroristFirst = SCANNER.nextInt();
        int terroristSecond = SCANNER.nextInt();
        int terroristThird = SCANNER.nextInt();
        int terroristFourth = SCANNER.nextInt();
        int terroristFifth = SCANNER.nextInt();
        double terroristTeamAverage = (double) (terroristFirst + terroristSecond +
                terroristThird + terroristFourth + terroristFifth) / 5;
        System.out.println("'" + terroristTeamName + "' team have " + terroristTeamAverage + " frags in average.");
        System.out.println("--------------------------------------------------------");

        // Winner determination

        double eps = 0.01;
        if (Math.abs(policeTeamAverage - terroristTeamAverage) < eps) {
            System.out.println("A draw, the teams have the same average number of frags.");
        } else if (policeTeamAverage > terroristTeamAverage) {
            System.out.println("Congrats! '" + policeTeamName + "' team won with " + policeTeamAverage + " frags in average.");
        } else {
            System.out.println("Congrats! '" + terroristTeamName + "' team won with " + terroristTeamAverage + " frags in average.");
        }
    }
}
