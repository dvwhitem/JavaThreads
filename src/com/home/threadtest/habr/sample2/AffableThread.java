package com.home.threadtest.habr.sample2;

/**
 * Created by vitaliy on 20.03.15.
 */
public class AffableThread extends Thread {

    @Override
    public void run() {
        System.out.println("Second thread!");
    }
}
