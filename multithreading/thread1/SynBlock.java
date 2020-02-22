package thread1;

public class SynBlock {

    public static void main(String[] args) {
        Sync s = new Sync();
        s.dowork();
    }
    private int  count =0;
    public  void increment(){
        synchronized (this){
            count++;
        }
    }

    public void dowork(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i <1000 ; i++) {
                    increment();
                }
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }

}


