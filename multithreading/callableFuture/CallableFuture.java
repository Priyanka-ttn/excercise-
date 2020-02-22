package callableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable call = new Call();
        FutureTask futureTask = new FutureTask(call);

        Thread t = new Thread(futureTask);
        t.start();

        System.out.println(futureTask.get());
    }
}
class Call implements Callable{

    @Override
    public Object call() throws Exception {
        int num =0;
        for (int i = 0; i < 5; i++) {
            if(i%2 == 0){
               num = i;
            }

        }
        Thread.sleep(1000);
        return num;
    }
}
