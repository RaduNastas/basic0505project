package javaPro.lesson8.bracketValidator;

import java.util.Map;
import java.util.Stack;

public class BracketValidator {

    public static void main(String[] args) {
        String input = "{[()]}";

        if (isValid(input)) {
            System.out.println("The sequence is correct: ");
        } else {
            System.out.println("The sequence is incorrect: ");
        }
    }

    public static boolean isValid(String string) {
        if (string.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> bracketsMap = Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        );

        Stack<Character> stack = new Stack<>();

        for (char character : string.toCharArray()) {
            if (bracketsMap.containsValue(character)) {
                stack.push(character);
            } else if (bracketsMap.containsKey(character)) {
                if (stack.isEmpty() || stack.pop() != bracketsMap.get(character)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}