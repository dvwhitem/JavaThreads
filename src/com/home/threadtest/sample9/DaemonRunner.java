package com.home.threadtest.sample9;

/**
 * Created by go1095 on 2/19/15.
 */
public class DaemonRunner {
    public static void main(String[] args) {
        SimpleThread usual = new SimpleThread();
        SimpleThread daemon = new SimpleThread();
        daemon.setDaemon(true);
        daemon.start();
        usual.start();
        System.out.println("Main.");
    }
}
