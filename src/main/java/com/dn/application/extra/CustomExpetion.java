package com.dn.application.extra;

public class CustomExpetion extends Exception{
    //CustomExpetion(){}

    CustomExpetion(String name){
        super();
        System.out.println("Hi Excpetion"+name);
    }

    public CustomExpetion() {

    }
}
