package lesson10.tasks;

public class DayTask {
    private int taskNumber;
    private Task task;

    public DayTask(int taskNumber, Task task) {
        this.taskNumber = taskNumber;
        this.task = task;
    }

    @Override
    public String toString() {
        return String.format("Task #%d\n%s", taskNumber, task);
    }

}