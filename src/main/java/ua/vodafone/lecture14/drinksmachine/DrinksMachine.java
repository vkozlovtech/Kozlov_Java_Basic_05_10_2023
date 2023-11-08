package ua.vodafone.lecture14.drinksmachine;

import java.util.Scanner;

public class DrinksMachine {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Drinks[] drinks = Drinks.values();
        showMenu(drinks);
        System.out.println("\nPlease enter name of the drink:");
        processOrder(drinks);
    }

    private static void processOrder(Drinks[] drinks) {
        String userChoice = receiveAndTransformUserChoice();
        if (Drinks.getCount() == 0 && userChoice.equals("END")) {
            System.out.println("[Warning] You have not ordered anything. Please enter name of the drink:");
            processOrder(drinks);
        } else if (userChoice.equals("END")) {
            showOrderDetails();
        } else {
            for (Drinks drink : drinks) {
                if (drink.name().equals(userChoice)) {
                    startDrinkMaking(drink);
                    System.out.println("Your " + drink.name +
                            " is ready. Continue your order or complete it by entering 'End':");
                    processOrder(drinks);
                    break;
                } else if (drink == drinks[drinks.length - 1]) {
                    System.out.println("[Error] Wrong drink name, please choose one from menu:");
                    processOrder(drinks);
                }
            }
        }
    }

    private static void showOrderDetails() {
        System.out.println("\n-= THANK YOU FOR ORDER! ^-^ =-\n\nTotal quantity of drinks: " + Drinks.getCount() +
                "\nTotal price: " + Drinks.getTotalPrice() + " USD");
    }

    private static String receiveAndTransformUserChoice() {
        String userChoice = SCANNER.nextLine().toUpperCase();
        if (userChoice.contains(" ")) {
            userChoice = userChoice.replace(" ", "_");
        } else if (userChoice.contains("-")) {
            userChoice = userChoice.replace("-", "_");
        }
        return userChoice;
    }

    private static void startDrinkMaking(Drinks drink) {
        switch (drink) {
            case COFFEE -> drink.brew();
            case TEA -> drink.make();
            case MOJITO -> drink.mix();
            case LEMONADE -> drink.cut();
            case COCA_COLA -> drink.open();
            case MINERAL_WATER -> drink.pour();
        }
    }

    private static void showMenu(Drinks[] drinks) {
        System.out.println("-= DRINKS MACHINE MENU =-\n\n[=====================]");
        for (Drinks drink : drinks) {
            System.out.println(drink.toString());
        }
        System.out.println("[=====================]");
    }

    enum Drinks implements MakingMethods {
        COFFEE("Coffee", 2.79),
        TEA("Tea", 1.99),
        LEMONADE("Lemonade", 1.59),
        MOJITO("Mojito", 2.19),
        MINERAL_WATER("Mineral water", 0.99),
        COCA_COLA("Coca Cola", 1.79);

        private final String name;
        private final double price;
        private static int count = 0;
        private static double totalPrice = 0;

        Drinks(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public static double getTotalPrice() {
            return totalPrice;
        }

        public static int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return name + ": " + price + " USD";
        }

        @Override
        public void brew() {
            System.out.println("[" + name + " is brewing...]");
            count++;
            totalPrice += this.price;
        }

        @Override
        public void make() {
            System.out.println("[Making " + name + "...]");
            count++;
            totalPrice += this.price;
        }

        @Override
        public void cut() {
            System.out.println("[Cutting fruits for " + name + "...]");
            count++;
            totalPrice += this.price;
        }


        @Override
        public void open() {
            System.out.println("[Opening the bottle of " + name + "...]");
            count++;
            totalPrice += this.price;
        }

        @Override
        public void mix() {
            System.out.println("[Mixing " + name + "...]");
            count++;
            totalPrice += this.price;
        }

        @Override
        public void pour() {
            System.out.println("[Pouring " + name + " into a glass...]");
            count++;
            totalPrice += this.price;
        }
    }
}
