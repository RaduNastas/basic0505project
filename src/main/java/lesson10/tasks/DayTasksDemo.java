package lesson10.tasks;

public class DayTasksDemo {

    public static void main(String[] args) {

        Task task1 = new Task("Read book", "Read 30 pages from novel");
        Task task2 = new Task("Call mom", "Talk at least 15 minutes");

        DayTask day1 = new DayTask(1, task1);
        DayTask day2 = new DayTask(2, task2);

        System.out.println(day1);
        System.out.println(day2);
    }
}
