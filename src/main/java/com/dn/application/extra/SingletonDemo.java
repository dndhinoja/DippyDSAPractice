package com.dn.application.extra;

public class SingletonDemo {

    private static SingletonDemo instace = null;

    public static SingletonDemo getInstance(){

        if(instace==null){
            synchronized (SingletonDemo.class) {
                if(instace==null)
                    return new SingletonDemo();
            }
        }
        return instace;
    }
}

class Demo{
    public static void main(String[] args) {
     SingletonDemo.getInstance();
    }
}
