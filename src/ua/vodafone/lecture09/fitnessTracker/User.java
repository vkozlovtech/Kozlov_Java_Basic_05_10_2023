package ua.vodafone.lecture09.fitnessTracker;

public class User {
    private static final int CURRENT_YEAR = 2023;
    private final String firstName;
    private final String birthDate;
    private final String email;
    private final String phone;
    private final int age;
    private String lastName;
    private double weight;
    private String pressure;
    private int stepsPerDay;

    public User(String firstName, int day, int month, int year, String email, String phone, String lastName,
                double weight, String pressure, int stepsPerDay) {
        this.firstName = firstName;
        this.birthDate = makeBirthDate(day, month, year);
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
        this.age = CURRENT_YEAR - year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastName() {
        return lastName;
    }

    public double getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public void printAccountInfo() {
        System.out.println("---------------------------------------------------------");
        System.out.println("User: " + firstName + " " + lastName + ", " + birthDate + ", " + age +
                " y.o.\nContact information: " + phone + ", " + email + "\nHealth data: " + weight + " kg, "
                + pressure + " mmHg, " + stepsPerDay + " steps per day");
    }

    private String makeBirthDate(int day, int month, int year) {
        if (day < 10 && month < 10) {
            return "0" + day + ".0" + month + "." + year;
        } else if (month < 10) {
            return day + ".0" + month + "." + year;
        } else {
            return "0" + day + "." + month + "." + year;
        }
    }
}
