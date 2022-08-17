package com.dn.application.extra.Test3;

public class SuperThis {
    public static void main(String[] args) {
        B b = new B();
    }

}

class A{
    public A(){
        System.out.println("Inside A");
    }
}
class B extends A{
    public B(){
        System.out.println("Inside B");
    }
}
