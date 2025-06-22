package javaPro.lesson1.task;

public class Task {
    private int id;
    private String taskTitle;
    private String taskDescription;
    private int priority;
    private String status;

    public Task(int id, String taskTitle, String taskDescription, int priority, String status) {
        this.id = id;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.priority = priority;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task #" + id + ": " + taskTitle +
                "\nDescription: " + taskDescription +
                "\nPriority: " + priority +
                "\nStatus: " + status + "\n";
    }

}