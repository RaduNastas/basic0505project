package javaPro.lesson16;

import javaPro.utils.UserInputStaticScanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReaderExample {

    public static void main(String[] args) {
        String csvFile = "src/main/java/javaPro/lesson16/resources/example_csv_file.csv";
        String line;
        String csvDelimiter = ",";
        double sum = 0.0;
        String searchText = UserInputStaticScanner.inputText("Input text: ");

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(csvDelimiter);

                String text = fields[0];
                double value = Double.parseDouble(fields[1]);
                sum = sum + value;

                if (text.equalsIgnoreCase(searchText)) {
                    System.out.printf("Found: %s with value %.2f\n", searchText, value);
                }
            }
            System.out.printf("Total sum of values: %.2f\n", sum);
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }

}