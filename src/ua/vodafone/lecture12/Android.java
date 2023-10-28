package ua.vodafone.lecture12;

public class Android implements Smartphones, LinuxOS {
    private final String vendor;
    private final String model;
    private final double osVersion;

    public Android(String vendor, String model, double osVersion) {
        this.vendor = vendor;
        this.model = model;
        this.osVersion = osVersion;
    }

    @Override
    public void call(String number) {
        System.out.println(vendor + " " + model + " called the " + number + ".");
    }

    @Override
    public void sms(String text) {
        System.out.println(vendor + " " + model + " sent sms '" + text + "'.");
    }

    @Override
    public void internet(String website) {
        System.out.println(vendor + " " + model + " visited " + website + ".");
    }

    @Override
    public void checkUpdateLinuxOS() {
        if (osVersion < 14) {
            System.out.println("LinuxOS version on " + vendor + " " + model + " is lower than 14. You need to update.");
        }   else {
            System.out.println("Your " + vendor + " " + model + " has the latest LinuxOS version.");
        }
    }
}
