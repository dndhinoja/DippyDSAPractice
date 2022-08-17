package com.dn.application.extra.test1;

import java.util.ArrayList;
import java.util.List;

public class PBVR {

    int a;

    public static void makeCall(String a){
        a = "Nirr";
    }
    public static void makeCallRef(List<Integer> list){
        list.add(10);
    }
    public static void makeCallRef1(Dipali dipali){
        dipali.laptop = 1+2;
    }

    public static void main(String[] args) {
        String a = "Hima";
        System.out.println(a);
        PBVR.makeCall(a);
        System.out.println(a);
        List<Integer> list = new ArrayList<>();
        list.add(2);list.add(3);
        System.out.println(list);
        PBVR.makeCallRef(list);
        System.out.println(list);
        Dipali dipali = new Dipali();
        System.out.println(dipali.laptop);
        PBVR.makeCallRef1(dipali);
        System.out.println(dipali.laptop);
    }
}
