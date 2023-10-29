package ua.vodafone.lecture12;

public class Iphone implements Smartphones, IOs {

    private final String vendor;
    private final String model;
    private final double osVersion;

    public Iphone(String vendor, String model, double osVersion) {
        this.vendor = vendor;
        this.model = model;
        this.osVersion = osVersion;
    }

    @Override
    public void call(String number) {
        System.out.println(vendor + " " + model + " called the " + number + ".");
    }

    @Override
    public void sms(String number, String text) {
        System.out.println(vendor + " " + model + " sent sms to " + number + " with text '" + text + "'.");
    }

    @Override
    public void internet(String website) {
        System.out.println(vendor + " " + model + " visited " + website + ".");
    }

    @Override
    public void checkUpdateIOs() {
        if (osVersion < 13) {
            System.out.println("iOS version on " + vendor + " " + model +
                    " is too old to update.");
        } else if (osVersion < 17) {
            System.out.println("iOS version on " + vendor + " " + model +
                    " is lower than 17. You need to update.");
        } else {
            System.out.println("Your " + vendor + " " + model + " has the latest iOS version.");
        }
    }
}
