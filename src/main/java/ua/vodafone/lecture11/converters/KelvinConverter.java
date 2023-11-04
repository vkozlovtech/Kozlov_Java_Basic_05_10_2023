package main.java.ua.vodafone.lecture11.converters;

public class KelvinConverter extends Converters {
    private static final double KELVIN_CONSTANT = 273.15;

    @Override
    public double convertFromCelsius(double temperature) {
        return temperature + KELVIN_CONSTANT;
    }

    @Override
    public double convertToCelsius(double temperature) {
        return temperature - KELVIN_CONSTANT;
    }
}
