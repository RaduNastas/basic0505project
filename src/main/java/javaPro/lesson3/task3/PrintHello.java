package javaPro.lesson3.task3;

public class PrintHello implements Command {
    @Override
    public void execute() {
        System.out.println("Hello");
    }

}