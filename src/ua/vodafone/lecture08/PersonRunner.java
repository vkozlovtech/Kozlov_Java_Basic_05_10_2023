package ua.vodafone.lecture08;

public class PersonRunner {
    public static void main(String[] args) {
        Person firstPerson = new Person("Vitalii", "Kozlov", "Dnipro", "380996496395");
        System.out.println(firstPerson.personInfo());
        Person secondPerson = new Person("Arnold", "Schwarzenegger", "LA", "7599499634");
        System.out.println(secondPerson.personInfo());
        Person thirdPerson = new Person("Boris", "Johnson", "London", "02079460706");
        System.out.println(thirdPerson.personInfo());
    }
}
