package com.dn.application.extra;

public class ThreadDemo {

    public static void main(String[] args) {
        A a = new A();
        Thread thread = new Thread(a);
        thread.start();
        thread.suspend();
        System.out.println("Suspended");
        thread.resume();
        B b = new B();
        
        b.start();
    }
}
