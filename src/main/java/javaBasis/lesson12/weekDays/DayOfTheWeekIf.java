package javaBasis.lesson12.weekDays;

import javaBasis.lesson12.utils.UserInputStaticScanner;

public class DayOfTheWeekIf {

    public static void main(String[] args) {
        int dayNumber = UserInputStaticScanner
                .inputInt("Please input day of the week from 1 to 7: ");

        if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else if (dayNumber == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong input:");
        }
    }

}