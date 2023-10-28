package ua.vodafone.lecture11.converters;

public class FahrenheitConverter extends Converters {
    private static final int FAHRENHEIT_CONSTANT = 32;
    private static final double FAHRENHEIT_MULTIPLICATION_CONSTANT = 1.8;

    @Override
    public double convertFromCelsius(double celsius) {
        return celsius * FAHRENHEIT_MULTIPLICATION_CONSTANT + FAHRENHEIT_CONSTANT;
    }

    @Override
    public double convertToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_CONSTANT) / FAHRENHEIT_MULTIPLICATION_CONSTANT;
    }
}

