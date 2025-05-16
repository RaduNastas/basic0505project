package utils;

import java.util.Scanner;

public class InputReader {

    private final Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readText(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public int readInt(String message) {
        System.out.println(message);
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public double readDouble(String message) {
        System.out.println(message);
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    public boolean readBoolean(String message) {
        System.out.println(message);
        String input = scanner.nextLine().trim().toLowerCase();

        while (!input.equals("on") && !input.equals("off")) {
            System.out.println("Please type On or Off:");
            input = scanner.nextLine().trim().toLowerCase();
        }
        return input.equals("on");
    }

}