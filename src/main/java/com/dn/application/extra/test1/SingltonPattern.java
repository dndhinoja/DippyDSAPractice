package com.dn.application.extra.test1;

public class SingltonPattern {

    public static void main(String[] args) {
        SingletonClass.getInstance();
    }
}

class SingletonClass{
    private static SingletonClass instance;

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if(instance==null){
            synchronized (SingletonClass.class) {
                if(instance==null)
                return new SingletonClass();
            }
        }
        return instance;
    }
}


