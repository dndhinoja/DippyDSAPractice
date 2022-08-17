package com.dn.application.extra;

public class MyThread extends Thread{

    //Thread t;

    /*MyThread()
    {
        t = new Thread(this);
        System.out.println("New thread: " + t);
        t.start(); // Starting the thread
    }*/

    // execution of thread starts from run() method
    public void run()
    {
        while (!Thread.interrupted()) {
            System.out.println("Thread is running");
        }
        System.out.println("Thread has stopped.");
    }
}
