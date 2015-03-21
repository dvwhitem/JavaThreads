package com.home.threadtest.book.sample7;

/**
 * Created by go1095 on 2/18/15.
 */
public class JoinThread extends Thread {

    public JoinThread(String name) {
        super(name);
    }

    public void run() {
        String nameT = getName();
        long timeout = 0;
        System.out.println("Start thread " + nameT);
        try {
            if (nameT.equals("First")) {
                timeout = 5000;
            } else if (nameT.equals("Second")) {
                timeout = 1000;
            }
            Thread.sleep(timeout);
            System.out.println("Finish thread " + nameT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
