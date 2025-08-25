package javaPro.lesson17.suminthread;

public class SumInThreadDemo {

    public static void main(String[] args) {
        SumInThread thread1 = new SumInThread(1, 50);
        SumInThread thread2 = new SumInThread(51, 100);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long totalSum = thread1.getSum() + thread2.getSum();
        System.out.println("Total sum from both threads " + totalSum);
    }

}