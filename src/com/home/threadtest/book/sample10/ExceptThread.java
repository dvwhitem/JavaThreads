package com.home.threadtest.book.sample10;

/**
 * Created by go1095 on 2/23/15.
 */
public class ExceptThread extends Thread {
    public void run() {
        boolean flag = true;
        if(flag) {
            throw  new RuntimeException();
        }
        System.out.println("end of ExceptThread");
    }
}
