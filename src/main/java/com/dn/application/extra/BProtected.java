package com.dn.application.extra;

public class BProtected{

    public static void main(String[] args) {
        AProtected aProtected = new AProtected();
        aProtected.Hi();
        System.out.println(aProtected.i);
    }
}
