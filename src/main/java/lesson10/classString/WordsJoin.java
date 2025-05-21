package lesson10.classString;

import java.util.Scanner;

public class WordsJoin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first word: ");
        String firstWord = scanner.nextLine();

        System.out.println("Input second word: ");
        String secondWord = scanner.nextLine();

        String result = joinWords(firstWord, secondWord);
        System.out.println("Rezultatul: " + result);

        scanner.close();
    }
    public static String joinWords(String firstWord, String secondWord) {
        int firstHalf = firstWord.length() / 2;
        int secondHalf = secondWord.length() / 2;

        String firstPart = firstWord.substring(0, firstHalf);
        String secondPart;

        if (secondWord.length() % 2 == 0) {
            secondPart = secondWord.substring(secondHalf);
        } else {
            secondPart = secondWord.substring(secondHalf + 1);
        }
        return firstPart + secondPart;
    }

}