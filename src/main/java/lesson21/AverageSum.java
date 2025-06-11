package lesson21;

public class AverageSum {

    public double getAverageSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum = sum + number;
        }
        return (double) sum / array.length;
    }

}