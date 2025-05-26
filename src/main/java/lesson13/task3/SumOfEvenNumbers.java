package lesson13.task3;

import lesson12.utils.UserInputStaticScanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {

        int countNumber = UserInputStaticScanner.inputInt("How many numbers you want to input?");
        int sum = 0;

        for (int i = 0; i < countNumber; i++) {
            int userNumber = UserInputStaticScanner.inputInt("Input number: ");
            if (userNumber % 2 == 0) {
                sum = sum + userNumber;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }

}