package thread1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VolatileKey extends Thread {
    private int value =0;
    private volatile boolean running = true;

    @Override
    public void run() {
        for (int i = 0; running ; i++) {
            System.out.println(value+" : "+ i);
            value += i;
        }



        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shutdown() {
        running = false;
        System.out.println("value: "+ value);
    }
}

class Procrssor{
    public static void main(String[] args) {
        VolatileKey vk = new VolatileKey();
        vk.start();

        System.out.println("press enter to stop....");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        vk.shutdown();

    }
}