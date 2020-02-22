package countlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {


    CountDownLatch latch = new CountDownLatch(3);

    Worker first = new Worker("First" ,latch);
    Worker second = new Worker("Second" ,latch);
    Worker third = new Worker("Third" ,latch);


    first.start();
    second.start();
    third.start();

    latch.await();

    System.out.println(Thread.currentThread().getName() +" has finished");
    }
}

class Worker extends Thread {
    String worker_name;
    CountDownLatch count;

    public Worker(String worker_name, CountDownLatch count) {
        this.worker_name = worker_name;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            count.countDown();
            System.out.println(Thread.currentThread().getName()
                    + " finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}