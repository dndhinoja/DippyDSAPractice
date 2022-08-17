package com.dn.application.junetest;

import java.util.TreeMap;

public class Test1 {

    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(4,"Raj");
        map.put(2,"Dipali");
        map.put(3,"Nirr");
        System.out.println(map);
        int a = map.floorKey(1);
        System.out.println(a);
    }
}
