package src.Ch14;

import java.util.concurrent.*;

public class CallableSubmitExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i = 0; i<=100 ; i++){
            final int idx = i;
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for(int i=0; i<=idx; i++){
                        sum += i;
                    }
                    Thread thread=Thread.currentThread();
                    System.out.println(thread.getName() + idx);
                    return sum;
                }
            });
        try{
            int result = future.get();
            System.out.println(result);
        }catch(Exception e){}
        }

        executorService.shutdown();
    }
}
