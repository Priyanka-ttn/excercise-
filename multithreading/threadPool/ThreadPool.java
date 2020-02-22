package threadPool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class ThreadPool1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                synchronized (this) {
                    System.out.println("Thread1: " + i);
                }
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class ThreadPool2 implements Runnable {


    @Override
    public  void run() {
        for (int i = 0; i < 20; i++) {
            if (!(i % 2 == 0)) {
                 synchronized (this) {
                     System.out.println("Thread2: " + i);
                 }
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

public class ThreadPool {


    public static void main(String[] args) {
       Thread tp1 = new Thread(new ThreadPool1());
        Thread tp2 = new Thread(new ThreadPool2());

        tp1.start();
        tp2.start();

        try {
            tp1.join();
            tp2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ExecutorService executor = Executors.newFixedThreadPool(2);//creating a pool of 5 threads

        executor.execute(tp1);
        executor.execute(tp2);

        executor.shutdown();
        System.out.println("Finished all threads");

    }

}

