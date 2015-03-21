package com.home.threadtest.habr.sample4;

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
                Thread.sleep(i*3*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            incremenator.changeAction();
        }

        incremenator.finish();
    }
}
