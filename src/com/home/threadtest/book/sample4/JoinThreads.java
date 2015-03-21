package com.home.threadtest.book.sample4;

/**
 * Created by go1095 on 2/5/15.
 */
public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread myThread1 = new MyThread("Child #1");
        MyThread myThread2 = new MyThread("Child #2");
        MyThread myThread3 = new MyThread("Child #3");

        try {
            myThread1.thread.join();
            System.out.println("Child #1 joined.");
            myThread2.thread.join();
            System.out.println("Child #2 joined.");
            myThread3.thread.join();
            System.out.println("Child #3 joined.");
        } catch (Exception e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread ending.");
    }
}
