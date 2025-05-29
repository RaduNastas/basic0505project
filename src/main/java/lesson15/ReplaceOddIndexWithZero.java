package lesson15;

import java.util.Arrays;
import java.util.Random;

public class ReplaceOddIndexWithZero {

    public static void main(String[] args) {
        int[] nums = new int[8];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(51);
        }
        System.out.println("Original array: " + Arrays.toString(nums));

        for (int i = 0; i < nums.length; i ++) {
            if (i % 2 != 0) {
                nums[i] = 0;
            }
        }
        System.out.println("Modified array: " + Arrays.toString(nums));
    }

}