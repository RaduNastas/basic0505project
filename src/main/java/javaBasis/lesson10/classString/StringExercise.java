package javaBasis.lesson10.classString;

import java.util.Locale;

/**
 * 4.
 * 1 Создайте строку через new - I study Basic Java!
 * 2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
 * 3 Распечатать последний символ строки. Используем метод String.charAt().
 * 4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
 * 5 Заменить все символы “а” на “о”.
 * 6 Преобразуйте строку к верхнему регистру.
 * 7 Преобразуйте строку к нижнему регистру.
 * 8 Вырезать строку Java c помощью метода String.substring().
 * <p>
 * <p>
 * 5.
 * Введите 2 слова, используйте сканер.
 * Получить слово, состоящее из первой половины первого слова и второй половины второго слова.
 * Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать.
 * Распечатать на консоль.
 */
public class StringExercise {

    public static void main(String[] args) {

        String text = new String("I study Basic Java!");

        printLastChar(text);
        checkIfContains(text, "Java");
        symbolSubstitution(text, "a", "o");
        stringToUppercase(text);
        stringToLowerCase(text);
        cutString(text,"Java");

    }

    public static void printLastChar(String input) {
        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Last character of the line: " + lastChar);
    }

    public static void checkIfContains(String input, String text) {
        boolean contains = input.contains(text);
        System.out.println("Contains '" + text + "' : " + contains);
    }

    public static void symbolSubstitution(String input, String from, String to) {
        String replaced = input.replace(from, to);
        System.out.println("After substitution: " + replaced);
    }

    public static void stringToUppercase(String input) {
        String result = input.toUpperCase();
        System.out.println("Uppercase: " + result);
    }

    public static void stringToLowerCase(String input) {
        String result = input.toLowerCase();
        System.out.println("Lowercase: " + result);
    }

    public static void cutString(String input, String text) {

        int start = input.indexOf(text);
        int end = start + text.length();

        String result = input.substring(start, end);
        System.out.println(result);
    }
}
