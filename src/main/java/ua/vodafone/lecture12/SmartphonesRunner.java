package ua.vodafone.lecture12;

public class SmartphonesRunner {
    public static void main(String[] args) {
        Smartphones[] smartphones = {
                new Android("Samsung", "S22", 13.02),
                new Android("Google", "Pixel 6", 14.0),
                new Android("Asus", "Zenfone 10", 14.1),
                new Iphone("Apple", "iPhone 5s", 7.6),
                new Iphone("Apple", "iPhone 15 Pro Max", 17.0),
                new Iphone("Apple", "iPhone 13", 15.4)
        };

        System.out.println("-= Android =-\n");
        smartphones[0].call("380996496395");
        smartphones[1].sms("380996496395", "Hello Dad!");
        smartphones[2].internet("www.google.com");
        ((Android) smartphones[0]).checkUpdateLinuxOS();
        ((Android) smartphones[1]).checkUpdateLinuxOS();
        ((Android) smartphones[2]).checkUpdateLinuxOS();

        System.out.println("\n-= iPhone =-\n");
        smartphones[3].call("380662582058");
        smartphones[4].sms("380662582058", "Hello Mum!");
        smartphones[5].internet("www.youtube.com");
        ((Iphone) smartphones[3]).checkUpdateIOs();
        ((Iphone) smartphones[4]).checkUpdateIOs();
        ((Iphone) smartphones[5]).checkUpdateIOs();

        System.out.println("\n-= For-each =-\n");
        for (Smartphones phone : smartphones) {
            phone.call("380662584000");
        }
    }
}


