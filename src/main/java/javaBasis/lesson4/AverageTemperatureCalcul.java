package javaBasis.lesson4;
/**
 * Find the temperature data for your city over the past week on the Internet.
 * Calculate the average temperature for the week and print it.
 */

public class AverageTemperatureCalcul {

    public static void main(String[] args) {
        byte day1 = 14;
        byte day2 = 14;
        byte day3 = 17;
        byte day4 = 16;
        byte day5 = 16;
        byte day6 = 19;
        byte day7 = 17;
        double result = day1 + day2 + day3 + day4 + day5 + day6 + day7;
        double averageResult = result / 7;
        System.out.printf("Average temperature for the last seven days: %.2f%n", averageResult); // 16,14
    }

}