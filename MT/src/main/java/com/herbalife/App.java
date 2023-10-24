package com.herbalife;

import com.herbalife.thread.MyThread;
import com.herbalife.thread.YourThread;

/**
 * Hello world!
 *
 */
public class App
{
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
    }
}
