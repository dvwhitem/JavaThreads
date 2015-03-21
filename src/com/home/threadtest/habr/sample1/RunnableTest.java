package com.home.threadtest.habr.sample1;

/**
 * Created by vitaliy on 20.03.15.
 */
public class RunnableTest implements Runnable {
    public void run() {
        System.out.println("Second thread");
    }
}
