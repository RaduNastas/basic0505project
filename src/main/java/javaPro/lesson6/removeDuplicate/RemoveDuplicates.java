package javaPro.lesson6.removeDuplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Andrei");
        names.add("Bianca");
        names.add("Cristina");
        names.add("Andrei");
        names.add("Daniel");
        names.add("Cristina");

        System.out.println("Original list:");
        System.out.println(names);

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("List without duplicates:");
        System.out.println(uniqueNames);

        uniqueNames.add("Elena");
        uniqueNames.add("George");

        List<String> updatedList = new ArrayList<>(uniqueNames);
        System.out.println("Updated list:");
        System.out.println(updatedList);
    }

}