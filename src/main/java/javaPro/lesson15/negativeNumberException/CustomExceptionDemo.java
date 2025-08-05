package javaPro.lesson15.negativeNumberException;

import javaPro.utils.UserInputStaticScanner;
import java.util.InputMismatchException;

public class CustomExceptionDemo {

    public static void main(String[] args) {
        try {
            int number = readPositiveNumber();
            System.out.println("You entered: " + number);

        } catch (NegativeNumberException e) {
            System.out.println("Warning: " + e.getMessage());
        }
    }

    public static int readPositiveNumber() throws NegativeNumberException {

        try {
            int number = UserInputStaticScanner.inputInt("Please enter a positive number:");
            UserInputStaticScanner.close();
            if (number < 0) {
                throw new NegativeNumberException("The number cannot be negative: " + number);
            }
            return number;

        } catch (InputMismatchException e) {
            throw new NegativeNumberException("Invalid input. An integer is required.");
        }
    }


}