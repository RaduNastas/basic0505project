package javaBasis.lesson4.manager;

/**
 * In the main method, create an instance of this class.
 * Assign values to the fields.
 * Display information about the manager.
 * Your manager has celebrated his birthday.
 * Make the necessary changes to the data and display information
 * about the manager to the console again.
 * Create a second manager and perform the same operations with him.
 */
public class Main {
    public static void main(String[] args) {

        // First manager
        Manager manager1 = new Manager();
        manager1.age = 34;
        manager1.salary = 3568.89;
        System.out.println("Manager one:");
        System.out.println("Age: " + manager1.age);
        System.out.println("Salary: " + manager1.salary + " €");

        // Birthday!
        manager1.age = 35;
        System.out.println();
        System.out.println("Manager one after birthday:");
        System.out.println("Age: " + manager1.age);
        System.out.println("Salary: " + manager1.salary + " €");

        System.out.println("-----------------------------");

        // Second manager
        Manager manager2 = new Manager();
        manager2.age = 55;
        manager2.salary = 5876.99;
        System.out.println("Manager two:");
        System.out.println("Age: " + manager2.age);
        System.out.println("Salary: " + manager2.salary + " €");

        // Birthday!
        manager2.age = 56;
        System.out.println();
        System.out.println("Manager two after birthday:");
        System.out.println("Age: " + manager2.age);
        System.out.println("Salary: " + manager2.salary + " €");
    }

}