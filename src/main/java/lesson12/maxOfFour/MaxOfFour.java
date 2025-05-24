package lesson12.maxOfFour;

import java.util.Random;

public class MaxOfFour {

    public static void main(String[] args) {
        Random random = new Random();

        int firstNumber = random.nextInt(101);
        int secondNumber = random.nextInt(101);
        int thirdNumber = random.nextInt(101);
        int fourthNumber = random.nextInt(101);

        System.out.printf("Generated numbers: \nFirst number: %d\nSecond number: %d\nThird number: %d\nFourth number: %d \n",
                firstNumber, secondNumber, thirdNumber, fourthNumber);

        int maxNumber = Math.max(Math.max(firstNumber, secondNumber), Math.max(thirdNumber, fourthNumber));

        System.out.println("Max number is: " + maxNumber);
    }

}