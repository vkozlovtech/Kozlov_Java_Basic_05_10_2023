package main.java.ua.vodafone.lecture04;

public class Lecture04 {
    public static void main(String[] args) {

        arrayDemo();




        System.out.println("you are: " + ternaryOperator(10));
        logicalNot();
    }

    private static void arrayDemo() {
        int firstPlayer = 10;
        int secondPlayer = 6;
        int thirdPlayer = 0;

        int[] players = new int[4];
//        int anotherPlayers[] = new int[4]; NOT USE THIS FORM
        players[0] = 10;
        players[1] = 6;
        players[2] = 0;
        players[3] = 13;
        System.out.println(players[1]);

        int[] anotherPlayers = {10, 6, 0 ,13};
        System.out.println(anotherPlayers);
    }

    private static String ternaryOperator(int age) {
//        if(age > 16) {
//            return "adult";
//        } else {
//            return "child";
//        }
        return age > 16 ? "adult" : "child";
    }

    private static void logicalNot() {
        int value = 15;
        System.out.println("value = " + value);
        System.out.println(Integer.toBinaryString(value));

    }
}
