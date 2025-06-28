package javaPro.lesson5.studentArrayList;

import java.util.ArrayList;

public class Student {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Andrei");
        students.add("Bianca");
        students.add("Cristina");
        students.add("Daniel");
        students.add("Elena");

        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.println(students.get(i));
        }
        students.remove(2);

        System.out.println("\nList after deleting the student at index 2:");
        for (String student : students) {
            System.out.println(student);
        }
    }

}