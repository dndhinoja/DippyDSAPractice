package com.dn.application.extra;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        try {

            Thread.sleep(1);

            // t1 is an object of MyThread
            // which has an object t
            // which is of type Thread

            t1.interrupt();

            Thread.sleep(5);
        }
        catch (InterruptedException e) {
            System.out.println("Caught:" + e);
        }
        System.out.println("Exiting the main Thread");
    }
}
