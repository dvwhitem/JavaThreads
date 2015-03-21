package com.home.threadtest.habr.sample5;


/**
 * Created by vitaliy on 21.03.15.
 */
public class Program {

    public static int value = 0;

    public static Incremenator incremenator;

    public static void main(String[] args) {

        incremenator =new Incremenator();

        System.out.print("Value: ");

        incremenator.start();

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(i*2*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            incremenator.changeAction();
        }

        incremenator.interrupt();
    }
}
