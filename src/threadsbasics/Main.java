package threadsbasics;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hola desde el principal "+ Thread.currentThread().getName());
            HelloThread hilo1 = new HelloThread();
            Thread hilo2 = new Thread(new HelloRunnable());
            hilo1.start();
            hilo2.start();
            hilo1.join();
            hilo2.join();
            System.out.println("Todos terminaron correctamente");

            //Counter counter = new Counter(0);
            //SynchronizedThread hilo1 = new SynchronizedThread(counter);
            //SynchronizedThread hilo2 = new SynchronizedThread(counter);
            //hilo1.start();
            //hilo2.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}