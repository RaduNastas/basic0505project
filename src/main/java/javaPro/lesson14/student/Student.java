package javaPro.lesson14.student;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private double avgGrade;
    private int year;

    public Student(String name, int age, double avgGrade, int year) {
        this.name = name;
        this.age = age;
        this.avgGrade = avgGrade;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', age=%d, avgGrade=%.2f, year=%d}", name, age, avgGrade, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return age == student.age
                && Double.compare(student.avgGrade, avgGrade) == 0
                && year == student.year
                && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, avgGrade, year);
    }

}