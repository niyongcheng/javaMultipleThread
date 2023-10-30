package com.herbalife.thread;

public class TicketRunnable implements Runnable{

    private int ticket = 100;

    private static Object lock = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (lock){
                if(ticket >0){
                    //使用sleep模拟一下出票时间 //模拟一下出票的时间
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在卖票："+ticket--);
                }
            }

        }
    }
}
