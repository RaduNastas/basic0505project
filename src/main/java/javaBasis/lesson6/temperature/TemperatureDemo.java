package javaBasis.lesson6.temperature;

public class TemperatureDemo {

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        double celsius = 10;
        double fahrenheit = temperature.toFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

}