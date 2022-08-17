package com.dn.application.extra.Test2;

public class OverridingDemo {
    static int i;
    static {
        i = 0;
        System.out.println(i);
        System.out.println("Static block..");
    }

    public static void main(String[] args) {
        int l = args.length;
        System.out.println(l);
        Dipali dipali = new Nirav();
        //Nirav.dippy();
        //Dipali.dippy();
        dipali.dippy();
    }
}
class OverrideE extends OverridingDemo{

    public static void main(String[] args){
        System.out.println("Hi");
    }
}

class Dipali{

    public static void dippy(){
        System.out.println("HI I am Dippy..");
    }
    static {
        System.out.println("Static block 2..");
    }
}
class Nirav extends Dipali{

    public static void dippy(){
        System.out.println("Hi I am Nirr..");
    }
}
