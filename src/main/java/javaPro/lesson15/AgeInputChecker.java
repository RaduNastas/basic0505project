package javaPro.lesson15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInputChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            try {
                System.out.print("Enter your age: ");
                age = scanner.nextInt();

                if (age <= 0) {
                    System.out.println("Age must be a positive number. Try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
                age = -1;
            }
        } while (age <= 0);

        System.out.println("Your age: " + age);
        scanner.close();
    }

}