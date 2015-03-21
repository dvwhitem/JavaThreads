package com.home.threadtest.habr.sample1;

/**
 * Created by vitaliy on 20.03.15.
 */
public class Program {

    static RunnableTest runnableTestest;

    public static void main(String[] args) throws InterruptedException {
        runnableTestest = new RunnableTest();

        Thread thread = new Thread(runnableTestest);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finish...");
    }
}
