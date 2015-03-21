package com.home.threadtest.habr.sample3;

/**
 * Created by vitaliy on 20.03.15.
 */
public class ChickenVoice {

    static EggVoice eggVoice;

    public static void main(String[] args) {
        eggVoice = new EggVoice();
        System.out.println("start to argue...");
        eggVoice.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("chicken");
        }

        if(eggVoice.isAlive()) {
            try {
                eggVoice.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Winner egg!");
        } else {
            System.out.println("Winner chicken!");
        }

        System.out.println("finish to argue");
    }
}
