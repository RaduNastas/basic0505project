package javaBasis.lesson13.task4;

import javaBasis.lesson12.utils.UserInputStaticScanner;

public class SumOfOddAndEvenNumbers {

    public static void main(String[] args) {

        int countNumbers = UserInputStaticScanner.inputInt("How many numbers you want to input?");
        int evenNumbers = 0;
        int oddNumbers = 0;

        for (int i = 0; i < countNumbers; i++) {
            int userNumber = UserInputStaticScanner.inputInt("Input number: ");
            if (userNumber % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }

}