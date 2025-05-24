package lesson12.numbersCompare;

import lesson12.utils.UserInputStaticScanner;

public class TwoNumbersCompare {

    public static void main(String[] args) {

        int firstNumber = UserInputStaticScanner.inputInt("Input first number: ");
        int secondNumber = UserInputStaticScanner.inputInt("Input second number: ");

        if (firstNumber > secondNumber) {
            System.out.println("First number is greater as second number: ");
        } else {
            System.out.println("Second number is greater as first number: ");
        }
        UserInputStaticScanner.close();
    }

}