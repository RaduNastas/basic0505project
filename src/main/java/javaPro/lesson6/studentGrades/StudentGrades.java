package javaPro.lesson6.studentGrades;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {

    public static void main(String[] args) {

        Map<String, Double> studentGrades = new HashMap<>();
        studentGrades.put("Andrei", 8.6);
        studentGrades.put("Bianca", 9.3);
        studentGrades.put("Cristina", 7.8);
        studentGrades.put("Daniel", 9.7);
        studentGrades.put("Elena", 8.9);

        String topStudent = null;
        double maxGrade = Double.MIN_VALUE;

        for (Map.Entry<String, Double> student : studentGrades.entrySet()) {
            if (student.getValue() > maxGrade) {
                maxGrade = student.getValue();
                topStudent = student.getKey();
            }
        }
        System.out.println("Student with the highest GPA: " + topStudent + " -> " + maxGrade);

        if (studentGrades.containsKey("Cristina")) {
            studentGrades.put("Cristina", 8.8);
            System.out.println("Cristina's grade updated to 8.8 ");
        }
        System.out.println(studentGrades);
    }

}