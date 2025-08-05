package javaPro.lesson12;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        ToUpperCase upper = string -> string.toUpperCase();
        System.out.println(upper.apply("I love to learn java"));

        IntSum sum = (firstNumber, secondNumber) -> firstNumber + secondNumber;
        System.out.println(sum.apply(5, 6));
        System.out.println(sum.apply(10, 15));

        PalindromeChecker checker = string -> {
            String clean = string.replaceAll("[\\W_]+", "").toLowerCase();
            return new StringBuilder(clean).reverse().toString().equals(clean);
        };
        System.out.println(checker.isPalindrome("A man a plan a canal panama"));

        ListMerger<String> merger = (firstList, secondList) -> {
            List<String> result = new ArrayList<>(firstList);
            result.addAll(secondList);
            return result;
        };
        System.out.println(merger.merge(List.of("one", "two", "three"), List.of("four", "five")));

        Factorial factorial = number -> {
            BigDecimal result = BigDecimal.ONE;
            for (int i = 2; i <= number; i++) {
                result = result.multiply(BigDecimal.valueOf(i));
            }
            return result;
        };
        System.out.println("Factorial(5) = " + factorial.compute(5));
        System.out.println("Factorial(20) = " + factorial.compute(20));

        PrimeChecker primeChecker = number -> {
            if (number <= 1) return false;
            for (int i = 2; i * i <= number ; i++) {
                if (number % i == 0) return false;
            }
            return true;
        };
        System.out.println(primeChecker.isPrime(7));
        System.out.println(primeChecker.isPrime(9));
        System.out.println(primeChecker.isPrime(2));
    }
}
