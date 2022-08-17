package com.dn.application.extra;

import java.util.Random;

public class B extends Thread{

    @Override
    public void run(){
        Random random = new Random();
        random.ints().limit(5).forEach(r-> System.out.println("Nirav"+r));
    }
}
