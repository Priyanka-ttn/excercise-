package deadlock;

public class Deadlockexample
{
    String str1 = "Dead";
    String str2 = "Lock";

    Thread thread1 = new Thread("My Thread 1"){
        public void run(){
            while(true){
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };

    Thread thread2 = new Thread("My Thread 2"){
        public void run(){
            while(true){
                synchronized(str2){
                    synchronized(str1){
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };

    public static void main(String a[]){
        Deadlockexample deadlock = new Deadlockexample();
        deadlock.thread1.start();
        deadlock.thread2.start();
    }
}
