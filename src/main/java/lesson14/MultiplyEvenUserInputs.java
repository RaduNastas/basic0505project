package lesson14;

import lesson12.utils.UserInputStaticScanner;

public class MultiplyEvenUserInputs {

    public static void main(String[] args) {

        int result = 1;

        while (true) {
            int userNumber = UserInputStaticScanner.inputInt("Input number or (0 to stop): ");
            if (userNumber == 0) break;

            if (userNumber % 2 == 0) {
                result = result * userNumber;
            }
        }
        if (result != 1) {
            System.out.println("Product of even numbers: " + result);
        } else {
            System.out.println("No even numbers were inputted: ");
        }
    }

}