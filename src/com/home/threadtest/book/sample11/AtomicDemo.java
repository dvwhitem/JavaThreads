package com.home.threadtest.book.sample11;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by go1095 on 2/23/15.
 */
public class AtomicDemo {
    private  static final int NUMBER_BROKERS = 30;

    public static void main(String[] args) {
        Market market = new Market(new AtomicLong(100));
        market.start();
        for (int i = 0; i < AtomicDemo.NUMBER_BROKERS; i++) {
            new Broker(market).start();
        }
    }
}
