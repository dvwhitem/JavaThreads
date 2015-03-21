package com.home.threadtest.book.sample12;

/**
 * Created by go1095 on 3/16/15.
 */
public class SyncThread extends Thread {
    private Resource rs;
    public SyncThread(String name, Resource rs) {
        super(name);
        this.rs = rs;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            rs.writing(getName(), i);
        }
    }
}
