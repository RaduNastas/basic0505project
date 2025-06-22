package javaPro.lesson1.student;

public class StudentDemo {

    public static void main(String[] args) {
        StudentService service = new StudentService();

        Student[] students = service.createStudentsArrayFromUserInput();
        service.fillStudentsArrayFromUserInput(students);
        service.sortStudents(students);
        service.printStudents(students);
    }

}