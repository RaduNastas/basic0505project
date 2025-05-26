package lesson13.task1;

import lesson12.utils.UserInputStaticScanner;

public class NegativeOddNumber {

    public static void main(String[] args) {

        boolean condition = true;

        while (condition) {
            int userNumber = UserInputStaticScanner.inputInt("Input a number: ");

            if (userNumber < 0 && userNumber % 2 != 0) {
                System.out.println("Your number is odd and negative: " + userNumber);
                condition = false;
            } else {
                System.out.println("Your number is: " + userNumber);
            }
        }
    }
}
