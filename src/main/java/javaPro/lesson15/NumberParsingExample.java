package javaPro.lesson15;

import javaPro.utils.UserInputStaticScanner;

public class NumberParsingExample {

    public static void main(String[] args) {
        String input = UserInputStaticScanner.inputText("Enter the string to convert to a number: ");

        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Error: The string entered is not a valid integer.");
        }

        UserInputStaticScanner.close();
    }

}