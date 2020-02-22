package thread1;

public class ThreadUsingRunnable implements Runnable{

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

class App{
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadUsingRunnable());
        t.start();
    }

}
