package javaPro.lesson1.student;

import javaPro.utils.UserInputStaticScanner;

public class StudentService {

    public Student[] createStudentsArrayFromUserInput() {
        int size = UserInputStaticScanner.inputInt("Enter number of students: ");
        return new Student[size];
    }

    public void fillStudentsArrayFromUserInput(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter data for student #" + (i + 1));
            students[i] = createStudentFromUserInput();
        }
    }

    public Student createStudentFromUserInput() {

        String lastName = UserInputStaticScanner.inputText("Last name: ");
        String firstName = UserInputStaticScanner.inputText("First name: ");
        int age = UserInputStaticScanner.inputInt("Age: ");

        return new Student(lastName, firstName, age);
    }


    public void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getLastName().compareTo(students[j + 1].getLastName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public void printStudents(Student[] students) {
        System.out.println("\nSorted list of students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

}