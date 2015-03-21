package com.home.threadtest.book.sample10;

/**
 * Created by go1095 on 2/23/15.
 */
public class ExceptionMainDemo {
    public static void main(String[] args) {
        new SimpleThread().start();
        System.out.println("end of main with exception");
        throw new RuntimeException();
    }
}
