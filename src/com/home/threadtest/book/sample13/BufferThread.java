package com.home.threadtest.book.sample13;

/**
 * Created by go1095 on 3/17/15.
 */
public class BufferThread {
    static int counter = 0;
    static StringBuilder s = new StringBuilder(); // replace StringBuilder
    public static void main(String[] args) throws InterruptedException{
        new Thread() {
            public void run() {
                synchronized (s) {
                    while (BufferThread.counter++ < 3) {
                        s.append("A");
                        System.out.print("> " + counter + " ");
                        System.out.println(s);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
        Thread.sleep(100);
        while (BufferThread.counter++ < 6) {
            System.out.print("< " + counter + " ");
            s.append("B");
            System.out.println(s);
        }
    }
}
