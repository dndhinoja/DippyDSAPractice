package com.dn.application.extra;

import java.util.Random;

public class A implements Runnable{

    @Override
    public void run() {
        Rinterface();
    }

    public void Rinterface(){
        Random random = new Random();
        random.ints().limit(5).forEach(r-> System.out.println("Dipali"+r));
        System.out.println(Thread.currentThread().getId());
        //System.out.println("Hi Dipali");
    }
}
