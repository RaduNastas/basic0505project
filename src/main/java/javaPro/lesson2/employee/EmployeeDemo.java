package javaPro.lesson2.employee;

public class EmployeeDemo {

    public static void main(String[] args) {
        Developer dev1 = new Developer("Andrei", 28, new String[]{"CRM System", "Mobile App"});
        Developer dev2 = new Developer("Marina", 30, new String[]{"E-commerce Platform"});

        Manager manager = new Manager("Vlad", 40, new Employee[]{dev1, dev2});

        System.out.println("=== Manager ===");
        manager.displayInfo();

        System.out.println("\n=== Developer ===");
        dev1.displayInfo();
        dev2.displayInfo();
    }

}