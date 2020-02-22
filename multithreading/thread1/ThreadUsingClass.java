package thread1;

public class ThreadUsingClass extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("hello");
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Main{
    public static void main(String[] args) {
        ThreadUsingClass thread = new ThreadUsingClass();
        thread.start();
        ThreadUsingClass thread1 = new ThreadUsingClass();
        thread1.start();

    }
        }
