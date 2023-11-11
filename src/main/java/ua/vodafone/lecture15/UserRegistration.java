package ua.vodafone.lecture15;

import java.util.Scanner;

public class UserRegistration {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-= USER REGISTRATION =-");
        try {
            registerUser();
        } finally {
            System.out.println("\nThank you for using our service!");
        }
    }

    private static void registerUser() {
        int attempts = 3;
        for (int i = 0; i < attempts; i++) {
            try {
                new User(getLogin(), getPassword(), getConfirmPassword());
                break;
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.print(e.getMessage());
                if (i < 2) {
                    System.out.println("please try again.");
                } else {
                    System.out.println("allowed number of attempts has been reached.");
                }
            }
        }
    }

    private static String getLogin() {
        System.out.print("\nLogin: ");
        return SCANNER.nextLine();
    }

    private static String getPassword() {
        System.out.print("Password: ");
        return SCANNER.nextLine();
    }

    private static String getConfirmPassword() {
        System.out.print("Confirm password: ");
        return SCANNER.nextLine();
    }
}