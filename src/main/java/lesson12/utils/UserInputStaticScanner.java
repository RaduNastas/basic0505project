package lesson12.utils;

import java.util.Scanner;

public class UserInputStaticScanner {

    static Scanner scanner = new Scanner(System.in);

    public static String inputText(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static int inputInt(String message) {
        System.out.println(message);
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public static double inputDouble(String message) {
        System.out.println(message);
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    public static boolean inputBoolean(String message) {
        System.out.println(message);
        String input = scanner.nextLine().trim().toLowerCase();

        while (!input.equals("on") && !input.equals("off")) {
            System.out.println("Please type On or Off:");
            input = scanner.nextLine().trim().toLowerCase();
        }
        return input.equals("on");
    }

    public static void close() {
        scanner.close();
    }

}