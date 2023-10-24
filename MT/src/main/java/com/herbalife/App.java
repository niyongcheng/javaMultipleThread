package com.herbalife;

import com.herbalife.thread.CallbackThread;
import com.herbalife.thread.MyThread;
import com.herbalife.thread.YourThread;

import java.util.concurrent.*;

/**
 * Hello world!
 *
 */
public class App
{
    //this is
    private static ExecutorService pool = Executors.newFixedThreadPool(5);

    public static void main( String[] args ) throws ExecutionException, InterruptedException {
        System.out.println( "Hello World!" );

        MyThread myThread = new MyThread();

        YourThread yourThread = new YourThread();

        myThread.run();

        yourThread.start();

        new Thread(()->{
            //
            //for (int i = 0; i < 100; i++) {
            System.out.println("this is:" + "");
            //}
        }).start();

        //submit callback thread
        FutureTask<Integer> futuretask = new FutureTask<>(new CallbackThread());
        pool.submit(futuretask);

        CompletableFuture<Integer> myFuture = CompletableFuture.supplyAsync(() -> {
            return 1;
        });

        System.out.printf("this is my xxx:" + myFuture.get());
    }
}
