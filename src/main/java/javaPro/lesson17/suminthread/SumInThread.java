package javaPro.lesson17.suminthread;

public class SumInThread extends Thread {

    private final int start;
    private final int end;
    private long sum;

    public SumInThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
    }

    public long getSum() {
        return sum;
    }
}
