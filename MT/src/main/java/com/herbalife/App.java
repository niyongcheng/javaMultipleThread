package com.herbalife;

import com.herbalife.thread.CallbackThread;
import com.herbalife.thread.MyThread;
import com.herbalife.thread.TicketRunnable;
import com.herbalife.thread.YourThread;
import com.sun.security.auth.UnixNumericUserPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
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

        /*System.out.println( "Hello World!" );

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

        //
        //completedFutureExample();

        threadState();*/

        /*ThreadLocal<String> local = new ThreadLocal<>();

        Thread t1 = new Thread(() -> {
            local.set("lbwnb");
            System.out.println("变量值已设定！");
            System.out.println(local.get());
        });

        Thread t2 = new Thread(() -> {
            System.out.println(local.get());
        });

        t2.start();
        Thread.sleep(3000);
        t1.start();*/

        /*Object o1 = new Object();

        Thread t1 = new Thread(() -> {

            synchronized (o1){

                try {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("start to wait");
                    o1.wait();
                    System.out.println("wait to end");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread t2 = new Thread(() -> {
            synchronized (o1){
                System.out.println("start to invoke");
                o1.notify();
                System.out.println(Thread.currentThread().getName());
                for (int i = 0; i < 50; i++) {
                    System.out.println(i);
                }
            }
        });

        t1.start();
        Thread.sleep(1000);
        t2.start();*/

        //
        /*List<String> list = new Vector<>();

        for(int i = 1;i<=10;i++){
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            }).start();
        }*/

        TicketRunnable t = new TicketRunnable();
        Thread t1 = new Thread(t,"窗口1");
        Thread t2 = new Thread(t,"窗口2");
        Thread t3 = new Thread(t,"窗口3");
        //3个窗口同时卖票
        t1.start();
        t2.start();
        t3.start();
    }

    static void completedFutureExample() throws ExecutionException, InterruptedException {
        //define CompletableFuture
        CompletableFuture<String> cf = CompletableFuture.completedFuture("Message");
        System.out.printf(cf.get());
    }

    static void threadState(){
        //
        System.out.println("XXXXXXXXXXXXXXX");
        //
        for (Thread.State state: Thread.State.values()){
            System.out.println(state);
        }
    }
}
