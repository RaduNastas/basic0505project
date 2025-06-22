package javaBasis.lesson12.weekDays;

import javaBasis.lesson12.utils.UserInputStaticScanner;

public class DayOfTheWeekSwitch {

    public static void main(String[] args) {
        int dayNumber = UserInputStaticScanner
                .inputInt("Please input day of the week from 1 to 7: ");

        switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Wrong input:");
        }
    }

}