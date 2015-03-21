package com.home.threadtest.book.sample1;

/**
 * Created by vitaliy on 04.02.15.
 */
public class MyThread implements Runnable {
    public Thread thread;

    public MyThread(String thrdName) {
        this.thread = new Thread(this, thrdName);
        thread.start();
    }

    public void run() {
        System.out.println("thrdName = " + thread.getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In  " + thread.getName() + ", count is " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() +  " interrupted.");
        }
        System.out.println(thread.getName() + " terminating.");
    }
}
