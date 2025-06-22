package javaPro.lesson1.task;

import javaPro.utils.UserInputStaticScanner;

public class TaskManager {
    private Task[] tasks = new Task[100];
    private int count = 0;

    public Task createTaskFromUserInput() {

        String title = UserInputStaticScanner.inputText("Enter task title: ");
        String description = UserInputStaticScanner.inputText("Enter task description: ");
        int priority = UserInputStaticScanner.inputInt("Enter priority (1 - high, 2 - medium, 3 - low): ");
        String status = UserInputStaticScanner.inputText("Enter status (e.g., New, In Progress, Done): ");

        return new Task(count + 1, title, description, priority, status);
    }

    public void addTask(Task task) {
        if (count < tasks.length) {
            tasks[count++] = task;
        } else {
            System.out.println("Task list is full.");
        }
    }

    public void sortTasks() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                Task task1 = tasks[j];
                Task task2 = tasks[j + 1];

                boolean shouldSwap = false;

                if (task1.getPriority() > task2.getPriority()) {
                    shouldSwap = true;
                } else if (task1.getPriority() == task2.getPriority()) {
                    if (task1.getTaskTitle().compareToIgnoreCase(task2.getTaskTitle()) > 0) {
                        shouldSwap = true;
                    }
                }

                if (shouldSwap) {
                    Task temp = tasks[j];
                    tasks[j] = tasks[j + 1];
                    tasks[j + 1] = temp;
                }
            }
        }
    }

    public void printTasks() {
        if (count == 0) {
            System.out.println("No tasks available.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(tasks[i]);
        }
    }

}