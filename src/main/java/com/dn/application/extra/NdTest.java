package com.dn.application.extra;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NdTest {
    public static void main(String[] args) {

        String sample = "qw{w{rt{12{{er}fd}ddg}2d}grfd}qwe";
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Dipali");
        map.put(2,"Nirr");
        String i = map.put(2,"Panda");
        System.out.println(i);

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One","Dipali.Nir");
        linkedHashMap.put("Two","Nirr.Dipali");
        linkedHashMap.put("Three","Panda");
        System.out.println(linkedHashMap);
        linkedHashMap.put("Four","Panda");
        linkedHashMap.put("Five","Pandi");
        linkedHashMap.put("Six","Pandi");
        linkedHashMap.put("Seven","Pandi");
        linkedHashMap.put("Eight","Pandi");
        System.out.println(linkedHashMap);

        HashMap<String,String> map1 = new HashMap<>();
        map1.put("One","Panda");
        map1.put("Two","Nirr.Dipali");
        map1.put("Three","Panda");
        System.out.println(map1);
        map1.put("Four","vjhv");
        System.out.println(map1);
    }

}
