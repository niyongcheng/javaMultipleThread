package com.herbalife;

import com.herbalife.thread.CallbackThread;
import com.herbalife.thread.MyThread;
import com.herbalife.thread.YourThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Hello world!
 *
 */
public class App
{
    //this is
    private static ExecutorService pool = Executors.newFixedThreadPool(5);

    public static void main( String[] args )
    {
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
    }
}
