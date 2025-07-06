package javaPro.lesson7.stringReplacer;

import java.util.ArrayList;
import java.util.List;

public class StringReplacer {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("apple", "banana", "cherry", "kiwi", "grape"));

        replaceWordsWithA(words);

        System.out.println("Modificat: " + words);
    }

    public static void replaceWordsWithA(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("a")) {
                list.set(i, "…");
            }
        }
    }

}