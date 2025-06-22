package javaPro.lesson1.task;

import javaPro.utils.UserInputStaticScanner;

public class TaskDemo {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        int numberOfTasks = UserInputStaticScanner.inputInt("Enter number of tasks to create: ");

        for (int i = 0; i < numberOfTasks; i++) {
            System.out.println("\n--- Enter data for task #" + (i + 1) + " ---");
            Task task = manager.createTaskFromUserInput();
            manager.addTask(task);
        }

        manager.sortTasks();
        System.out.println("\n--- Task List ---");
        manager.printTasks();
    }

}