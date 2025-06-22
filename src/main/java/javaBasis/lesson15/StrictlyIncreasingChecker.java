package javaBasis.lesson15;

import java.util.Arrays;
import java.util.Random;

public class StrictlyIncreasingChecker {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(90) + 10;
        }
        System.out.println("Arrays: " + Arrays.toString(numbers));

        boolean isStrictlyIncreasing = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }
        if (isStrictlyIncreasing) {
            System.out.println("The array is a strictly increasing sequence.");
        } else {
            System.out.println("The array is NOT a strictly increasing sequence.");
        }
    }

}