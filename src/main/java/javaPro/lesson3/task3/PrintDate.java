package javaPro.lesson3.task3;

public class PrintDate implements Command {
    @Override
    public void execute() {
        System.out.println("Today is June 19");
    }

}