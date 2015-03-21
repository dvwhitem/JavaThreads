package com.home.threadtest.book.sample9;

/**
 * Created by go1095 on 2/19/15.
 */
public class SimpleThread extends Thread {
    public void run() {
        try {
            if(isDaemon()) {
                System.out.println("start daemon thread");
                Thread.sleep(10000);
            } else {
                System.out.println("start usual thread");
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        } finally {
            if(!isDaemon()) {
                System.out.println("finish usual thread");
            } else {
                System.out.println("finish daemon thread");
            }
        }
    }
}
