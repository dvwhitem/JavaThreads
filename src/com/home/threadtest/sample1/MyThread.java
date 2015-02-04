package com.home.threadtest.sample1;

/**
 * Created by vitaliy on 04.02.15.
 */
public class MyThread implements Runnable {
    public String thrdName;

    public MyThread(String thrdName) {
        this.thrdName = thrdName;
    }

    public void run() {
        System.out.println("thrdName = " + thrdName + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In  " + thrdName + ", count is " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thrdName +  " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
}
