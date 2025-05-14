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

}
