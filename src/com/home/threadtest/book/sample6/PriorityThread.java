package com.home.threadtest.book.sample6;

/**
 * Created by go1095 on 2/16/15.
 */
public class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
