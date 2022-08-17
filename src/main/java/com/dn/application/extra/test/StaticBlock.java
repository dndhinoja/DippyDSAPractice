package com.dn.application.extra.Test3;

public class StaticBlock {
    static int i;
    // Case 2: Non-static variable
    int j;

    // Case 3: Static blocks
    static
    {
        i = 10;
        System.out.println("static block called ");
    }

    // Constructor calling
    StaticBlock() { System.out.println("Constructor called"); }

    static
    {
        i = 11;
        System.out.println("static block called ");
    }


    public static void main(String[] args) {

        StaticBlock staticBlock1 = new StaticBlock();
        System.out.println(StaticBlock.i);
    }
}
