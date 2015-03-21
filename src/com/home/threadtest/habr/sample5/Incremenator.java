package com.home.threadtest.habr.sample5;

/**
 * Created by vitaliy on 21.03.15.
 */
public class Incremenator extends Thread {

    private volatile boolean isIncrement = true;

    public void changeAction() {
        isIncrement = !isIncrement;
    }

    @Override
    public void run() {
        do {
            if(!Thread.interrupted()) {
                if(isIncrement) {
                    Program.value++;
                } else {
                    Program.value--;
                }

                System.out.print(Program.value + " ");
            } else {
                return;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        } while (true);
    }
}
