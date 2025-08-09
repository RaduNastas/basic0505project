package javaPro.lesson16;

import javaPro.utils.UserInputStaticScanner;
import java.io.*;

public class FileCopyExample {

    public static void main(String[] args) {
        String fileSource = UserInputStaticScanner.inputText("Input source file: ");
        String fileTarget = UserInputStaticScanner.inputText("Input target file: ");

        copyExample(fileSource, fileTarget);
    }

    private static void copyExample(String fileSource, String fileTarget) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(fileSource));
                FileWriter writer = new FileWriter(fileTarget)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + System.lineSeparator());
            }
            System.out.println("File successfully copied to: " + fileTarget);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }

}