package javaBasis.lesson16.student1;

public class StudentDemo {

    public static void main(String[] args) {

        Student student1 = new Student("Anton");
        Student student2 = new Student("Vlad");
        Student student3 = new Student("Ana");
        Student student4 = new Student("Valentina");
        Student student5 = new Student("Marina");

        Student[] students = {student1, student2, student3, student4, student5};

        String startsWithLetter = "A";
        int counter = 0;

        System.out.println("Students whose names start with '" + startsWithLetter + "':");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().startsWith(startsWithLetter)) {
                System.out.println("- " + students[i].getName());
                counter++;
            }
        }
        System.out.println("Total students with names starting with '" + startsWithLetter + "': " + counter);
    }

}