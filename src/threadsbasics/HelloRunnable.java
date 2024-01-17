package threadsbasics;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + " hola desde Hilo Runnable " + Thread.currentThread().getName());
        }

    }
}