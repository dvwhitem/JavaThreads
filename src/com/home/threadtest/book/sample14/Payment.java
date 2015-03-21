package com.home.threadtest.book.sample14;

import java.util.Scanner;

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
                this.wait();  // остановка потока и освобождение от блокировки
                // после возврата выполнение будет продолжено
             }

            close = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Payment is closed : " + close);
    }

    public void initAmount() {
        Scanner scan = new Scanner(System.in);
        amount = scan.nextInt();
    }
}
