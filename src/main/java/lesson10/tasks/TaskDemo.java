package lesson10.tasks;

public class TaskDemo {
    public static void main(String[] args) {

        Task task1 = new Task("Buy groceries", "Milk, eggs, and bread");
        Task task2 = new Task("Workout", "30-minute run and stretching");

        System.out.println(task1);
        System.out.println(task2);
    }
}
