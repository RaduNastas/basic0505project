package javaPro.lesson17.countdownthread;

public class CountDownThread extends Thread {

    @Override
    public void run() {
        int i = 10;
        while (i >= 1) {

            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i--;
        }
    }

}