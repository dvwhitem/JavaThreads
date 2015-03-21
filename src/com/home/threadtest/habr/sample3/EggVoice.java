package com.home.threadtest.habr.sample3;

/**
 * Created by vitaliy on 20.03.15.
 */
public class EggVoice extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("egg");
        }
    }
}
