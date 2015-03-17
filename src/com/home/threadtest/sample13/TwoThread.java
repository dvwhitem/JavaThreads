package com.home.threadtest.sample13;

/**
 * Created by go1095 on 3/17/15.
 */
public class TwoThread {

    static int counter = 0;

    public static void main(String[] args) {
        final StringBuilder s = new StringBuilder();

        new Thread() {
            public void run() {
                synchronized (s) {
                    do{
                        s.append("A");
                        System.out.println(s);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            System.err.println(e);
                        }
                    } while (counter++ < 2);
                } // end synchronized
            }
        }.start();

        new Thread() {
            public void run() {
                synchronized (s) {
                    while (counter++ < 6) {
                        s.append("B");
                        System.out.println(s);
                    }
                } // end synchronized
            }
        }.start();
    }
}
