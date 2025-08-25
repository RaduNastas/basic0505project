package javaPro.lesson17.countdownthread;

public class CountDownThreadDemo {

    public static void main(String[] args) {
        CountDownThread countdown = new CountDownThread();
        countdown.start();

        try {
            countdown.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Let's go!");
    }

}