package com.home.threadtest.book.sample12;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by go1095 on 3/16/15.
 */
public class Resource {

    private FileWriter fileWriter;

    public Resource(String file) throws IOException{
        fileWriter = new FileWriter(file, true);
    }

    public synchronized void writing(String str, int i) {
        try {
            fileWriter.append(str + i);
            System.out.print(str + i);
            Thread.sleep((long) (Math.random() * 50));
            fileWriter.append("->" + i + " ");
            System.out.println("->" + i + " ");
        } catch (InterruptedException e) {
            System.out.println("file error: " + e);
        } catch (IOException e) {
            System.out.println("thread error: " + e);
        }
    }

    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("error close file: " + e);
        }
    }
}
