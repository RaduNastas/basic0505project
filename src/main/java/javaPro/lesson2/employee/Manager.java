package javaPro.lesson2.employee;

public class Manager extends Employee {
    private Employee[] subordinates;

    public Manager(String name, int age, Employee[] subordinates) {
        super(name, age, "Manager");
        this.subordinates = subordinates;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subordinates:");
        if (subordinates != null && subordinates.length > 0) {
            for (Employee employee : subordinates) {
                System.out.print(" - ");
                employee.displayInfo();
            }
        } else {
            System.out.println("No Subordinates.");
        }
    }

}