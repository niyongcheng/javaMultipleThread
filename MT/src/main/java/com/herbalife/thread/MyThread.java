package com.herbalife.thread;

import java.util.concurrent.Callable;

public class MyThread implements Runnable {

    @Override
    public void run() {
        //
        System.out.println("this is from: myThread!");
    }
}
