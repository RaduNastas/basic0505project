package javaPro.lesson2.employee;

public class Employee {
    protected String name;
    protected int age;
    protected String position;

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", age: " + age + ", position: " + position);
    }

}