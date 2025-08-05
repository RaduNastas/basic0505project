package javaPro.lesson15;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int size;

        do {
            System.out.print("Enter the array size (positive number): ");
            try {
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("The size must be a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter an integer.");
                scanner.nextLine();
                size = -1;
            }
        } while (size <= 0);

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("\nThe array was created successfully.");

        System.out.print("Enter the index of the item you want to view: ");
        try {
            int index = scanner.nextInt();
            System.out.println("Value of element by index " + index + ": " + array[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of array bounds.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Enter an integer as an index.");
        }
        scanner.close();
    }

}