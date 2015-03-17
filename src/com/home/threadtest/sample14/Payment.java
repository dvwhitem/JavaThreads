package com.home.threadtest.sample14;

/**
 * Created by go1095 on 3/17/15.
 */
public class Payment {
    private int amount;
    private boolean close;

    public int getAmount() {
        return amount;
    }

    public boolean isClose() {
        return close;
    }

    public synchronized void doPayment() {
        try {
            System.out.println("Start payment: ");
            while (amount <=0) {
                this.wait(); 
             }
        }
    }
}
