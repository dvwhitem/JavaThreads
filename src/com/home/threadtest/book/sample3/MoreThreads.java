package com.home.threadtest.book.sample3;


/**
 * Created by go1095 on 2/4/15.
 */
public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("main thread starting.");

        MyThread myThread1 = new MyThread("Child #1");
        MyThread myThread2 = new MyThread("Child #2");
        MyThread myThread3 = new MyThread("Child #3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        } while(myThread1.thread.isAlive() ||
                myThread2.thread.isAlive() ||
                myThread3.thread.isAlive());

        System.out.println("Main thrad ending.");
    }
}
