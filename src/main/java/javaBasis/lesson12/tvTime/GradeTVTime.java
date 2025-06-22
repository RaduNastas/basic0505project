package javaBasis.lesson12.tvTime;

import java.util.Random;

public class GradeTVTime {

    public static void main(String[] args) {
        Random random = new Random();

        int grade = random.nextInt(13);
        int timeLeft = 45;

        System.out.println("Grade received: " + grade);

        switch (grade) {
            case 12, 11, 10 -> {
                System.out.println("Excellent! I'm really proud of you!");
                timeLeft = timeLeft + 60;
            }
            case 9, 8, 7 -> {
                System.out.println("Well done! Keep it up!");
                timeLeft = timeLeft + 45;
            }
            case 6, 5, 4 -> {
                System.out.println("That's okay, but you can do better.");
                timeLeft = timeLeft + 15;
            }
            case 3 -> {
                System.out.println("That's disappointing. Less screen time today.");
                timeLeft = timeLeft - 30;
            }
            default -> {
                System.out.println("This is unacceptable. No TV today.");
                timeLeft = 0;
            }
        }
        if (timeLeft > 60) {
            timeLeft = 60;
        }

        System.out.println("Allowed TV time today: " + timeLeft + " minutes.");
    }

}