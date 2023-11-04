package main.java.ua.vodafone.lecture02;

public class Lecture02 {
    public static void main(String[] args) {
        byte first = 123;
        byte second = 10;
        System.out.println("Division: " + (first / second));


        int a = 1000;
        int b = 2000;
        int result = a + b;
        System.out.println(result);

        long l = 10000000000L;

        first = 6;
        System.out.println("first: " + first);
        first = 0b110;
        System.out.println("first: " + first);
        first = 0x01F;
        System.out.println("first: " + first);

        float f = 1.2F;
        double d = 1.2;
        d =  f / d;
        System.out.println(d);

        a = 1;
        //a += 10;
        //a++;
        //++a;
        b = 23;
        a = a++ + ++b;
        System.out.println("a = " + a);

        char ch1 = 'A' + 1;
        char ch2 = 'A';
        char ch3 = 65;
        char ch4 = '\u0041';
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);

        boolean flag = true;
        flag = false;

    }
}
