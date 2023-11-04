package main.java.ua.vodafone.lecture11.converterRunner;

import main.java.ua.vodafone.lecture11.converters.FahrenheitConverter;
import main.java.ua.vodafone.lecture11.converters.KelvinConverter;

public class ConverterRunner {
    public static void main(String[] args) {
        double celsius = 10;

        FahrenheitConverter toFahrenheit = new FahrenheitConverter();
        double fahrenheit = toFahrenheit.convertFromCelsius(celsius);
        System.out.println("Convert " + celsius + "°C to fahrenheit = " + fahrenheit + "°F.");
        System.out.println("Convert back " + fahrenheit + "°F to celsius = "
                + toFahrenheit.convertToCelsius(fahrenheit) + " °C.");

        KelvinConverter toKelvin = new KelvinConverter();
        double kelvin = toKelvin.convertFromCelsius(celsius);
        System.out.println("\nConvert " + celsius + "°C to kelvin = " + kelvin + "K.");
        System.out.println("Convert back " + kelvin + "K to celsius = " + toKelvin.convertToCelsius(kelvin) + " °C.");
    }
}
