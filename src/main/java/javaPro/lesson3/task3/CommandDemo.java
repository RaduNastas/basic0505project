package javaPro.lesson3.task3;

public class CommandDemo {
    public static void main(String[] args) {

        Command[] commands = {
                new PrintHello(),
                new PrintDate(),
                new PrintBye()
        };
        runAll(commands);
    }

    public static void runAll(Command[] commands) {
        for (Command command : commands) {
            command.execute();
        }
    }

}