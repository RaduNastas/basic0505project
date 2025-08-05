package javaPro.lesson14.person;

import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String gender;
    private double salary;
    private List<String> skills;

    public Person(String name, int age, String gender, double salary, List<String> skills) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', age=%d, gender='%s', salary=%.2f, skills=%s}", name, age, gender, salary, skills);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(skills, person.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, salary, skills);
    }

}