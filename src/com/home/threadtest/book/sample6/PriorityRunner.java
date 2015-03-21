package com.home.threadtest.book.sample6;

/**
 * Created by go1095 on 2/16/15.
 */
public class PriorityRunner {
    public static void main(String[] args) {
        new Object();
        PriorityThread min = new PriorityThread("Min");
        PriorityThread max = new PriorityThread("Max");
        PriorityThread norm = new PriorityThread("Norm");

        min.setPriority(Thread.MIN_PRIORITY); // 1
        max.setPriority(Thread.MAX_PRIORITY); // 10
        norm.setPriority(Thread.NORM_PRIORITY); // 5

        min.start();
        max.start();
        norm.start();
    }
}
