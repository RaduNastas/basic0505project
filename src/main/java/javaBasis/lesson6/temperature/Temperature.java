package javaBasis.lesson6.temperature;

/**
 * Create a Temperature class that will represent the temperature in degrees Celsius and
 * provide methods for converting the temperature to other units.
 * Methods:
 * double toFahrenheit(double celsius) — returns the temperature in degrees Fahrenheit.
 * In the main() method, set the temperature in degrees Celsius,
 * call the toFahrenheit(double celsius) method,
 * save the result and print it_
 */

public class Temperature {

    double toFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

}