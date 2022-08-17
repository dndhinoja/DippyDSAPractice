package com.dn.application.extra;

public class DeamonThread extends Thread{

    public void run()
    {

        // Checking whether the thread is daemon thread or
        // not
        if (Thread.currentThread().isDaemon()) {

            // Print statement when Daemon thread is called
            System.out.println(
                    "I am daemon thread and I am working");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("HI I am deamon");
        }

        else {

            // Print statement whenever users thread is
            // called
            System.out.println(
                    "I am user thread and I am working");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("HI I am deamon");
        }
    }
}
