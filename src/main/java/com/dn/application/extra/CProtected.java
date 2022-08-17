package com.dn.application.extra;

public class CProtected extends AProtected{

    CProtected(){
        //super();
    }

    public static void main(String[] args) {
       // AProtected aProtected = new AProtected();
        CProtected cProtected = new CProtected();
        System.out.println(cProtected.i);
        //cProtected.Hi();
    }
}
