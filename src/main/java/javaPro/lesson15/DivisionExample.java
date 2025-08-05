package javaPro.lesson15;

import javaPro.utils.UserInputStaticScanner;

public class DivisionExample {

    public static void main(String[] args) {

        double firstNumber = UserInputStaticScanner.inputDouble("Input first number: ");
        double secondNumber = UserInputStaticScanner.inputDouble("Input second number: ");

        if (secondNumber == 0) {
            System.out.println("Error: Division by zero is not possible!");
        } else {
            double result = firstNumber / secondNumber;
            System.out.println("The result of division: " + result);

            UserInputStaticScanner.close();
        }
    }

}