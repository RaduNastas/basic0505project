package javaPro.lesson9.wordGrouper;

import java.util.*;

public class WordGrouper {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "apricot", "cherry", "cranberry", "almond");

        Map<String, List<String>> groupedWords = new LinkedHashMap<>();
        for (String word : words) {
            String firstLetter = word.substring(0, 1).toLowerCase();

            if (!groupedWords.containsKey(firstLetter)) {
                groupedWords.put(firstLetter, new ArrayList<>());
            }
            groupedWords.get(firstLetter).add(word);
        }
        for (Map.Entry<String, List<String>> entry : groupedWords.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}