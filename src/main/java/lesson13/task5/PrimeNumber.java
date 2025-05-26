package lesson13.task5;

import lesson12.utils.UserInputStaticScanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int number = UserInputStaticScanner.inputInt("Input a number: ");

        if (number <= 1) {
            System.out.println("The number must be greater than 1.");
            return;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println(number + " — is not a prime number.");
                return;
            }
        }
        System.out.println(number + " — This is a prime number.");
    }

}