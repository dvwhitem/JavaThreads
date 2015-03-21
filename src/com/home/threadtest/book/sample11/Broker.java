package com.home.threadtest.book.sample11;

/**
 * Created by go1095 on 2/23/15.
 */
public class Broker extends Thread {
    private Market market;
    private static final int PAUSE = 500; // millis

    public Broker(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Currrent index: " + market.getIndex());
                Thread.sleep(PAUSE);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
