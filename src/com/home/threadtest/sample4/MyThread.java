package com.home.threadtest.sample4;

/**
 * Created by go1095 on 2/5/15.
 */
public class MyThread implements Runnable {
    Thread thread;

    public MyThread(String name) {
        thread = new Thread(this, name);
        thread.start(); // start thread
    }


    public void run() {
        System.out.println(thread.getName() + " starting.");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + thread.getName() + ", count is" + i);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " interrupted.");
        }

        System.out.println(thread.getName() + " terminating.");
    }
}
