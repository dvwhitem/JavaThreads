package com.home.threadtest.sample3;


/**
 * Created by go1095 on 2/4/15.
 */
public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("main thread starting.");

        MyThread myThread1 = new MyThread("Child #1");
        MyThread myThread2 = new MyThread("Child #2");
        MyThread myThread3 = new MyThread("Child #3");

        for(int i=0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Main thrad ending.");
    }
}
