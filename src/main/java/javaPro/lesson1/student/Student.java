package javaPro.lesson1.student;

public class Student {
    private String lastName;
    private String firstName;
    private int age;

    public Student(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + ", age: " + age;
    }

}