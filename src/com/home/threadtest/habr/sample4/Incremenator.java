package com.home.threadtest.habr.sample4;

/**
 * Created by vitaliy on 21.03.15.
 */
public class Incremenator extends Thread {

    private volatile boolean isIncrement = true;
    private volatile boolean finish = false;

    public void changeAction() {
        isIncrement = !isIncrement;
    }

    public void finish() {
        finish = true;
    }

    public void run() {
        do {
            if(!finish) {
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
                e.printStackTrace();
            }
        } while (true);
    }
}
