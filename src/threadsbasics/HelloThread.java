package threadsbasics;

public class HelloThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + " hola desde Extends " + Thread.currentThread().getName());
        }

    }
}