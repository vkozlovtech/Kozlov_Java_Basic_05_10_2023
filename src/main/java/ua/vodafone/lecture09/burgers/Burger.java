package main.java.ua.vodafone.lecture09.burgers;

public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String lettuce;
    private String mayonnaise;

    public Burger(String bun, String meat, String cheese, String lettuce, String mayonnaise) {
        this.bun = bun + " bun";
        this.meat = meat + " meat";
        this.cheese = cheese + " cheese";
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;
        System.out.println("You ordered a regular burger. It consists of: " + this.bun + ", " + this.meat + ", "
                + this.cheese + ", " + this.lettuce + ", " + this.mayonnaise + ".");
    }

    public Burger(String bun, String meat, String additionalMeat, String cheese, String lettuce, String mayonnaise) {
        this.bun = bun + " bun";
        this.meat = meat + " and " + additionalMeat + " meat";
        this.cheese = cheese + " cheese";
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;
        System.out.println("You ordered a double meat burger. It consists of: " + this.bun + ", " + this.meat + ", "
                + this.cheese + ", " + this.lettuce + ", " + this.mayonnaise + ".");
    }

    public Burger(String bun, String meat, String cheese, String lettuce) {
        this.bun = bun + " bun";
        this.meat = meat + " meat";
        this.cheese = cheese + " cheese";
        this.lettuce = lettuce;
        System.out.println("You ordered a diet burger. It consists of: " + this.bun + ", " + this.meat + ", "
                + this.cheese + ", " + this.lettuce + ".");
    }
}
