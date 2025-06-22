package javaBasis.lesson7.employee;

import javaBasis.utils.InputReader;

import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InputReader inputEmployee = new InputReader(scanner);

        String name = inputEmployee.readText("Input employee name: ");
        int hoursWorked = inputEmployee.readInt("Input hours worked per month: ");
        double hourlyRate = inputEmployee.readDouble("Input hourly rate: ");

        Employee employee = new Employee(name, hoursWorked, hourlyRate);
        System.out.println(employee);

        int newHoursWorked = inputEmployee.readInt("Update hours worked: ");
        employee.setHoursWorked(newHoursWorked);
        System.out.println(employee);
        scanner.close();
    }

}