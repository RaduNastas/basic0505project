package javaPro.lesson1.arrayService;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayService {
    private final Scanner scanner = new Scanner(System.in);

    public int[] createArrayFromUserInput() {
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        return new int[size];
    }

    public int[] fillArrayFromUserInput(int[] array) {
        System.out.println("Enter " + array.length + " integer values:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public void sort(int[] array) {
        Arrays.sort(array);
        reverse(array);
    }

    private void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public void printArray(int[] array) {
        System.out.println("Sorted array (descending):");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}