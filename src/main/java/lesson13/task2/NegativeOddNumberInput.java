package lesson13.task2;

import lesson12.utils.UserInputStaticScanner;

public class NegativeOddNumberInput {

    public static void main(String[] args) {

        int countNumber = UserInputStaticScanner.inputInt("How many numbers do you want to enter?");

        for (int i = 0; i < countNumber; i++) {
            int userNumber = UserInputStaticScanner.inputInt("Input number: ");

            if (userNumber < 0 && userNumber % 2 != 0) {
                System.out.println("ERROR in data entry! ");
            } else {
                System.out.println("Your number is: " + userNumber);
            }
        }

    }

}