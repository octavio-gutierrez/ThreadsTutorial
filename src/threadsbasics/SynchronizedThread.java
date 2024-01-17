package threadsbasics;

public class SynchronizedThread extends Thread {
    private Counter counter;

    public SynchronizedThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increase(Thread.currentThread().getName());
    }
}