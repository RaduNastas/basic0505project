package javaPro.lesson16;

import javaPro.utils.UserInputStaticScanner;

import java.io.*;

public class NotTextFileCopyExample {

    public static void main(String[] args) throws IOException {
        String fileSource = UserInputStaticScanner.inputText("Input source file: ");
        String fileTarget = UserInputStaticScanner.inputText("Input target file: ");

        copyExample(fileSource, fileTarget);
    }

    private static void copyExample(String fileSource, String fileTarget) throws IOException {

        String path = "src/main/java/javaPro/lesson16/resources/";

        FileInputStream inputStream = new FileInputStream(path + fileSource);
        FileOutputStream outputStream = new FileOutputStream(path + fileTarget);

        int readByte;

        do {
            readByte = inputStream.read();
            if (readByte >= 0) outputStream.write(readByte);
        } while (readByte != -1);

        inputStream.close();
        outputStream.close();

    }

}