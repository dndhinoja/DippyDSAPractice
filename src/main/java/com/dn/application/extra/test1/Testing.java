package com.dn.application.extra.test1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Testing {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Dipali");
        map.put(null,"Nirav");
        map.put(2,null);
        map.put(3,null);
        System.out.println(map);


        System.out.println("Now set....");
        HashSet<String> set = new HashSet<>();
        set.add("Dipali");
        set.add(null);
        System.out.println(set);
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hima");
        //treeSet.add(null);
        System.out.println(treeSet);

        StringBuffer sb = new StringBuffer("Hi");
        String str = sb.toString();
        System.out.println(str);
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append("Hello");
        System.out.println(stringBuffer);
    }
}
