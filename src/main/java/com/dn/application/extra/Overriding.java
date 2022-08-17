package com.dn.application.extra;

public class Overriding {


    public static void main(String[] args) {
        Aa a = new Bb();
        a.abc();
    }
}

class Aa{
    public void abc(){
        System.out.println("Hi A");
    }
}
class Bb extends Aa{
    public void abc(){
        System.out.println("Hello B");
    }
}