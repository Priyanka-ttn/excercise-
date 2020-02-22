package threadPool;

import java.util.Scanner;

public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        Pc pc = new Pc();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
class Pc{
    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer Thread Running:  ");

            wait();

            System.out.println("Resumed");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(1000);
        Scanner scan = new Scanner(System.in);

        synchronized (this){
            System.out.println("Press enter...");
            scan.nextLine();
            System.out.println("key pressed");

            notify();

            Thread.sleep(2000);
        }
    }
}
