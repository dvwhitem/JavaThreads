package com.home.threadtest.book.sample2;

/**
 * Created by go1095 on 2/4/15.
 */
public class ExtendThread {

    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread myThread = new MyThread("Child #1");

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
