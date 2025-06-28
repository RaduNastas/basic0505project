package javaPro.lesson5.numberLinkedList;

import java.util.LinkedList;
import java.util.Random;

public class NumberListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(101));
        }

        System.out.println("Initial list: " + numbers);

        int min = numbers.getFirst();
        int max = numbers.getFirst();

        for (Integer number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }

        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);

        numbers.sort(null);
        System.out.println("Sorted list: " + numbers);
    }

}