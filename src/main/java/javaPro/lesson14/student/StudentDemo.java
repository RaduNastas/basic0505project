package javaPro.lesson14.student;

import java.util.*;
import java.util.stream.Collectors;

public class StudentDemo {

    public static void run() {
        List<Student> students = List.of(
                new Student("Andrei", 22, 4.6, 2021),
                new Student("Ioana", 24, 4.9, 2020),
                new Student("Maria", 20, 4.3, 2022),
                new Student("Vlad", 23, 5.0, 2020),
                new Student("Elena", 21, 4.7, 2021)
        );
        System.out.println("Top 3 students with the highest averages:");

        students.stream()
                .sorted(Comparator.comparingDouble(Student::getAvgGrade).reversed())
                .limit(3)
                .sorted(Comparator.comparingInt(Student::getYear))
                .forEach(System.out::println);
        System.out.println("\nStudents grouped by year:");

        Map<Integer, List<Student>> groupedByYear = students.stream()
                .collect(Collectors.groupingBy(Student::getYear));
        groupedByYear.forEach((year, list) -> {
            System.out.println(year + ": " + list);
        });
    }

}