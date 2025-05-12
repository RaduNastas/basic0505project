package lesson5.temperature;

/**
 * Create a Temperature class that will store temperature
 * data in Celsius and Fahrenheit and provide a method
 * to convert temperature from Celsius to Fahrenheit.
 * Methods:
 * public void toFahrenheit() — converts temperature to Fahrenheit.
 * In the main() method, create an instance of the class and set the temperature
 * in Celsius, call the toFahrenheit() method and print
 * the result about the temperature in Fahrenheit
 */
public class Temperature {

    double celsius;
    double fahrenheit;

    public void toFahrenheit() {
        fahrenheit = celsius * 1.8 + 32;
        System.out.println("Temperature celsius to fahrenheit: " + fahrenheit);
    }

}