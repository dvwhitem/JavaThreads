package com.home.threadtest.sample2;

/**
 * Created by go1095 on 2/4/15.
 */
public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        start();
    }

    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " terminating.");
    }
}
