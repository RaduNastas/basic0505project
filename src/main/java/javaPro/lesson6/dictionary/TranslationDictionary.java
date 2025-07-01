package javaPro.lesson6.dictionary;

import javaPro.utils.UserInputStaticScanner;

import java.util.HashMap;
import java.util.Map;

public class TranslationDictionary {

    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("apple ", "Apfel");
        dictionary.put("book ", "Buch");
        dictionary.put("room ", "Zimmer");
        dictionary.put("horse ", "Pferd");
        dictionary.put("water ", "Wasser");

        String inputWord = UserInputStaticScanner.inputText("Enter the English word to translate: ");

        if (dictionary.containsKey(inputWord)) {
            System.out.println("Translation: " + dictionary.get(inputWord));
        } else {
            System.out.println("The word was not found in the dictionary.");
        }

        String removeWord = UserInputStaticScanner.inputText("Enter the English word to delete:");

        if (dictionary.remove(removeWord) != null) {
            System.out.println("The word has been removed.");
        } else {
            System.out.println("Word not found.");
        }
        System.out.println("\nUpdated dictionary: ");
        System.out.println(dictionary);
    }

}