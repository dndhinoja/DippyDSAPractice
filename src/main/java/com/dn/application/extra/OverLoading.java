package com.dn.application.extra;

public class OverLoading {

    public static void main(String[] args) {
        Meena meena = new Meena();
        System.out.println(meena.add(2,1,9));
    }
}

class Meena{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}