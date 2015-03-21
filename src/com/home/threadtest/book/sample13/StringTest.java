package com.home.threadtest.book.sample13;

/**
 * Created by go1095 on 3/17/15.
 */
public class StringTest {
    public static void main(String[] args) {
        System.out.println(getStringOut());
    }

    private static String getStringOut() {
        String out = "Some text";
        int count = 100;
        for (int i = 0; i < count; i++) {
            out += i;
        }
        return out;
    }
}
