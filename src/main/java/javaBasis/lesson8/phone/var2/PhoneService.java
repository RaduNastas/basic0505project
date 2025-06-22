package javaBasis.lesson8.phone.var2;

import java.util.Scanner;

public class PhoneService {

    public void changeSilentStatus(Phone myphone) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input new silent status: ");
        String newStatus = scanner.nextLine();
        myphone.setIsSilent(newStatus);
        scanner.close();
    }

}