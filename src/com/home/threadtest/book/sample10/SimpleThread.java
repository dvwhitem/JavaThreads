package com.home.threadtest.book.sample10;

/**
 * Created by go1095 on 2/23/15.
 */
public class SimpleThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println("end of SimpleThread");
    }
}
