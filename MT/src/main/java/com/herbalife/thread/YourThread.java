package com.herbalife.thread;

public class YourThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("this is from: yourThread!");
    }
}
