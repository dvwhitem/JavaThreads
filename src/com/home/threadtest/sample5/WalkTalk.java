package com.home.threadtest.sample5;

/**
 * Created by go1095 on 2/16/15.
 */
public class WalkTalk {
    public static void main(String[] args) {
        TalkThread talkThread = new TalkThread();
        Thread walkThread = new Thread(new WalkRunnable());
        talkThread.start();
        walkThread.start();
        System.out.println("TALK STATE: " + talkThread.getState());
        System.out.println("WALK STATE:  " +walkThread.getState());
    }
}
