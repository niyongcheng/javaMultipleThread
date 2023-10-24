package com.herbalife.thread;


import java.util.concurrent.Callable;

public class CallbackThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.printf("this is thread from callbackThread");
        return 1;
    }
}
