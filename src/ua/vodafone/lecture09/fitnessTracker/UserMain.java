package ua.vodafone.lecture09.fitnessTracker;

public class UserMain {
    public static void main(String[] args) {

        User firstUser = new User("Vitalii", 18, 6, 1996, "vkozlov@vodafone.ua", "+38(099)6496395", "Kozlov", "86.7",
                "120/80", "10000");
        User secondUser = new User("Arnold", 30, 7, 1947, "IronArny@gmail.com", "+1(213)4587197", "Schwarzenegger", "107",
                "110/70", "15000");
        User thirdUser = new User("Boris", 19, 6, 1964, "BoryaJohnsonyk@gov.uk", "+44(20)71234567", "Johnson", "112",
                "130/90", "5000");

        firstUser.printAccountInfo();
        secondUser.printAccountInfo();
        thirdUser.printAccountInfo();
        System.out.println("---------------------------------------------------------\n\n[Edited User data]\n");

        firstUser.setWeight("100");
        firstUser.setStepsPerDay("18000");

        thirdUser.setPressure("120/80");
        thirdUser.setLastName("Johnsonyk");

        firstUser.printAccountInfo();
        thirdUser.printAccountInfo();
        System.out.println("---------------------------------------------------------");
    }
}
