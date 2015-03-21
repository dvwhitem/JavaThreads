package com.home.threadtest.book.sample14;

/**
 * Created by vitaliy on 20.03.15.
 */
public class PaymentRunner {
    public static void main(String[] args) throws InterruptedException {
        final Payment payment = new Payment();
        new Thread() {
            public void run() {
                payment.doPayment(); // вызов synchronized метода
            }
        }.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (payment) {
            System.out.println("Init amount:");
            payment.initAmount();
            payment.notify();
        }

        synchronized (payment) {
            payment.wait(1000);
            System.out.println("ok");
        }
    }
}
