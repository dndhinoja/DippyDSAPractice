package com.dn.application.extra.Test2;

class A{
    int x;
    int y;
}
class B implements Cloneable{
    int a;
    int b;
    A aObj = new A();

    public B clone() throws CloneNotSupportedException {
        //return super.clone();
        B b = (B)super.clone();
        b.aObj = new A();
        b.aObj.x = aObj.x;
        b.aObj.y = aObj.y;
        return b;
    }
}

public class ObjectCloningDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        B bObj = new B();
        bObj.a = 10;
        bObj.b = 20;
        bObj.aObj.x = 100;
        bObj.aObj.y = 200;

        //B bObj1 = (B) bObj.clone();
        B bObj1 = bObj.clone();

        bObj1.a = 1000;
        bObj1.aObj.x  = 1000;

        System.out.println("a: "+bObj.a+"  B: "+bObj.b+"  X: "+bObj.aObj.x+"  Y: "+bObj.aObj.y);
        System.out.println("a: "+bObj1.a+"  B: "+bObj1.b+"  X: "+bObj1.aObj.x+"  Y: "+bObj1.aObj.y);
    }
}
