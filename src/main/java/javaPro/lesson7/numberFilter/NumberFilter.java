package javaPro.lesson7.numberFilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberFilter {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10, 25, 5, 30, 15, 8));
        int removeGreaterThan = 15;

        removeGreaterThan(numbers, removeGreaterThan);

        System.out.println("Modified list: " + numbers);
    }

    public static void removeGreaterThan(List<Integer> list, int numberToRemove) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > numberToRemove) {
                iterator.remove();
            }
        }
    }

}