package javaPro.lesson6.uniqueName;

import java.util.HashSet;
import java.util.Set;

public class UniqueNames {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Andrei");
        names.add("Bianca");
        names.add("Cristina");
        names.add("Daniel");
        names.add("Elena");
        names.add("Cristina");
        names.add("Andrei");
        names.add("Florin");
        names.add("George");
        names.add("Hanna");
        System.out.println("Number of unique names: " + names.size());

        String nameToCheck = "Cristina";

        if (names.contains(nameToCheck)) {
            System.out.println("The set contains the names: " + nameToCheck);
        } else {
            System.out.println("The set contains not the names: " + nameToCheck);
        }
        System.out.println("All unique names: ");
        for (String name : names) {
            System.out.println(name);
        }
    }

}