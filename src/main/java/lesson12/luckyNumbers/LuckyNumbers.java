package lesson12.luckyNumbers;

import lesson12.utils.UserInputStaticScanner;

public class LuckyNumbers {

    public static void main(String[] args) {

        String fourNumbers = UserInputStaticScanner.inputText("Input four digits:");

        if (fourNumbers.length() != 4) {
            System.out.println("Only four digits are required: ");
            return;
        }
        int left = Character.getNumericValue(fourNumbers.charAt(0)) + Character.getNumericValue(fourNumbers.charAt(1));
        int right = Character.getNumericValue(fourNumbers.charAt(2)) + Character.getNumericValue(fourNumbers.charAt(3));

        if (left == right) {
            System.out.println("lucky number: " + fourNumbers);
        } else {
            System.out.println("Not lucky number: " + fourNumbers);
        }
    }

}