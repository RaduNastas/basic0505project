package javaPro.lesson17.hellothreads;

public class HelloThreadsDemo {

    public static void main(String[] args) {
        HelloThreads thread1 = new HelloThreads();
        
        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + i + " Hello from thread 2");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Both threads have completed their work!");
    }

}