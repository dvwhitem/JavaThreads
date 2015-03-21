package com.home.threadtest.habr.sample2;

/**
 * Created by vitaliy on 20.03.15.
 */
public class Program {

    static AffableThread thread;

    public static void main(String[] args) throws InterruptedException {
        thread = new AffableThread();
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finish");
    }
}
