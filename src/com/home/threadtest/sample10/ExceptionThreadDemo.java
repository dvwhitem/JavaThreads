package com.home.threadtest.sample10;

/**
 * Created by go1095 on 2/23/15.
 */
public class ExceptionThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        new ExceptThread().start();
        Thread.sleep(100);
        System.out.println("end of main");
    }
}
