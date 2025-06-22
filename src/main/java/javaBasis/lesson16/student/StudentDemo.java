package javaBasis.lesson16.student;

public class StudentDemo {

    public static void main(String[] args) {

        // === VARIANT A ===
        Student student1 = new Student("Anton", "Gr 001");
        Student student2 = new Student("Ana", "Gr 001");
        Student student3 = new Student("Valentina", "Gr 002");
        Student student4 = new Student("Marina", "Gr 002");
        Student student5 = new Student("John", "Gr 003");
        Student student6 = new Student("Katarina", "Gr 003");
        Student student7 = new Student("Vlad", "Gr 003");


        Student[] students1 = {student1, student2};
        Student[] students2 = {student3, student4};
        Student[] students3 = {student5, student6, student7};

        Group group1 = new Group("Gr 001", students1);
        Group group2 = new Group("Gr 002", students2);
        Group group3 = new Group("Gr 003", students3);

        System.out.println("=== VARIANT A ===");
        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);

        // === VARIANT B ===
        Group group01 = new Group("Gr 001", new Student[2]);
        Group group02 = new Group("Gr 002", new Student[2]);
        Group group03 = new Group("Gr 003", new Student[3]);


        group01.getStudentsForGroup()[0] = student1;
        group01.getStudentsForGroup()[1] = student2;

        group02.getStudentsForGroup()[0] = student3;
        group02.getStudentsForGroup()[1] = student4;

        group03.getStudentsForGroup()[0] = student5;
        group03.getStudentsForGroup()[1] = student6;
        group03.getStudentsForGroup()[2] = student7;

        System.out.println("\n=== VARIANT B ===");
        System.out.println(group01);
        System.out.println(group02);
        System.out.println(group03);
    }

}