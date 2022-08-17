package com.dn.application.extra;

import java.util.ArrayList;
import java.util.List;

public class SwitchPractice {
    public static void main(String[] args) {
        SwitchPractice switchPractice = new SwitchPractice();
        switchPractice.method("hi");
    }

    public void method(String a){
    List<String> list = new ArrayList<>();
    A aa = new A();
     switch(a){
         case "hey":
             System.out.println("hey");
             break;
         case "hi":
             System.out.println("hi");
             break;
         default:
             System.out.println("");
             throw new IllegalArgumentException("");
     }
    }
}
