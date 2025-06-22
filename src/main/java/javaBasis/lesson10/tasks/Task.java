package javaBasis.lesson10.tasks;

public class Task {
    private String title;
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Task: %s\nDescription: %s\n", title, description);
    }

}