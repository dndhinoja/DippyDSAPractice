package com.dn.application.junetest;

public class SingletonExa {
    private static SingletonExa instance;

    private SingletonExa(){}

    public static SingletonExa getInstance(){
        if(instance==null){
            synchronized (SingletonExa.class) {
                if(instance==null)
                return new SingletonExa();
            }
        }
        return instance;
    }
}
