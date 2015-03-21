package com.home.threadtest.book.sample12;

import java.io.IOException;

/**
 * Created by go1095 on 3/16/15.
 */
public class SynchroRun {
    public static void main(String[] args) {
        Resource s = null;
        try {
            s = new Resource("src/data/result.txt");
            SyncThread t1 = new SyncThread("First", s);
            SyncThread t2 = new SyncThread("Second", s);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (IOException e) {
            System.err.println("error file " + e);
        } catch (InterruptedException e) {
            System.err.println("error thread " + e);
        } finally {
            s.close();
        }
    }
}
