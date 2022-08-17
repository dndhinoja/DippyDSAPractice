package com.dn.application.extra;

public class DeamonMainMethodClass {

    public static void main(String[] args) throws InterruptedException {

        // Creating threads in the main body
        DeamonThread t1
                = new DeamonThread();
        DeamonThread t2
                = new DeamonThread();
        DeamonThread t3
                = new DeamonThread();

        // Setting thread named 't2' as our Daemon thread

        //t2.setDaemon(true);
        // Starting all 3 threads using start() method
        t1.start();
        t2.start();
        t3.start();

        t1.join(5000);
        System.out.println("main ended");
        // Now start() will automatically
        // invoke run() method
    }
}
