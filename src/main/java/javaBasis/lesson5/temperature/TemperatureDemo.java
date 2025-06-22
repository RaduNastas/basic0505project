package javaBasis.lesson5.temperature;

public class TemperatureDemo {

    public static void main(String[] args) {

        Temperature temperature1 = new Temperature();
        temperature1.celsius = 10;
        temperature1.toFahrenheit();// 50.0

        Temperature temperature2 = new Temperature();
        temperature2.celsius = 25;
        temperature2.toFahrenheit();// 77.0
    }

}