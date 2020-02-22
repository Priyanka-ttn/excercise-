package semaphore;

import java.util.concurrent.Semaphore;


class Shared{
    static int count = 0;
}

public class SemphoreExampple extends Thread {
    Semaphore sem;
    String thread_name;

    public SemphoreExampple(Semaphore sem, String thread_name) {
        super(thread_name);
        this.sem = sem;
        this.thread_name = thread_name;
    }

    @Override
    public void run() {
        if (this.getName().equals("Normal")) {
            System.out.println("Starting " + thread_name);

            try {
                sem.acquire();

                System.out.println(thread_name + "  gets the permit..now starting");

                for (int i = 0; i < 5; i++) {
                    Shared.count= Shared.count+i;
                    System.out.println(thread_name + " : " + Shared.count);

                    Thread.sleep(200);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("release the permit. ");
            sem.release();

        } else {
            if (this.getName().equals("Reverse")) {
                System.out.println("Starting " + thread_name);

                try {
                    sem.acquire();

                    System.out.println(thread_name + "  gets the permit..now starting");

                    for (int i = 0; i < 5; i++) {
                        Shared.count= Shared.count-i;
                        System.out.println(thread_name + " : " + Shared.count);

                        Thread.sleep(200);

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("release the permit. ");
                sem.release();


            }
        }
    }
}

class SemaphoreTest{
    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(1);

        SemphoreExampple semtest = new SemphoreExampple(sem,"Normal");
        SemphoreExampple semtest2 = new SemphoreExampple(sem,"Reverse");

        semtest.start();
        semtest2.start();

        semtest.join();
        semtest2.join();

        System.out.println("Count : " +Shared.count);


    }
}
