package ua.vodafone.lecture09.fitnessTracker;

public class User {
    private String firstName;
    private String birthDate;
    private String email;
    private String phone;
    private int age;
    String lastName;
    String weight;
    String pressure;
    String stepsPerDay;

    public User(String firstName, int day, int month, int year, String email, String phone, String lastName,
                String weight, String pressure, String stepsPerDay) {
        this.firstName = firstName;
        this.birthDate = day + ".0" + month + "." + year;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
        this.age = 2023 - year;
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

    public String getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public String getStepsPerDay() {
        return stepsPerDay;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setStepsPerDay(String stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public void printAccountInfo() {
        System.out.println("---------------------------------------------------------");
        System.out.println("User: " + firstName + " " + lastName + ", " + birthDate + ", " + age +
                " y.o.\nContact information: " + phone + ", " + email + "\nHealth data: " + weight + " kg, "
                + pressure + " mmHg, " + stepsPerDay + " steps per day");
    }
}
