package javaPro.lesson14.person;

import java.util.List;

public class PersonDemo {

    public static void run() {
        List<Person> people = List.of(
                new Person("Ana", 30, "Female", 6000, List.of("Java", "Python")),
                new Person("Vlad", 27, "Male", 7200, List.of("C++", "Python", "Java")),
                new Person("Mihai", 24, "Male", 5100, List.of("C#", "SQL")),
                new Person("Claudia", 35, "Female", 8000, List.of("Java", "Scala", "Kotlin"))
        );
        System.out.println("Unique skills of people over 25:");

        List<String> uniqueSkills = people.stream()
                .filter(person -> person.getAge() > 25)
                .flatMap(person -> person.getSkills().stream())
                .distinct()
                .sorted()
                .toList();
        uniqueSkills.forEach(System.out::println);

        double avgSalary = people.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("Male"))
                .filter(person -> person.getAge() >= 25 && person.getAge() <= 40)
                .mapToDouble(Person::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("\nAverage salary of men 25–40 years old: " + avgSalary);
    }

}