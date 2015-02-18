package com.home.threadtest.sample8;

/**
 * Created by go1095 on 2/18/15.
 */
public class YieldRunner {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                System.out.println("start thread 1");
                Thread.yield();
                System.out.println("finish thread 1");
            }
        }.start();

        new Thread() {
            public void run() {
                System.out.println("start thread 2");
                System.out.println("finish thread 2");
            }
        }.start();
    }
}
