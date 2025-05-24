package lesson12.numbersCompare;

import lesson12.utils.UserInputStaticScanner;

public class ThreeNumbersCompare {

    public static void main(String[] args) {

        int firstNumber = UserInputStaticScanner.inputInt("Input first number: ");
        int secondNumber = UserInputStaticScanner.inputInt("Input second number: ");
        int thirdNumber = UserInputStaticScanner.inputInt("Input third number: ");

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.printf("First number is the greatest: %d", firstNumber);

        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.printf("Second number is  the greatest: %d", secondNumber);

        } else {
            System.out.printf("Third number is the greatest: %d",thirdNumber);
        }
    }

}