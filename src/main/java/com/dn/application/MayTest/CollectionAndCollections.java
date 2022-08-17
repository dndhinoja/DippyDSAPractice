package com.dn.application.MayTest;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionAndCollections {

    public static void main(String[] args) {
        /*Collection<String> list = new ArrayList<>();
        list.add("Dipali");
        list.add("Hima");
        Collections.addAll(list);
        ConcurrentHashMap<Integer,String> ch = new ConcurrentHashMap<>();
        ch.put(1,"DI");
        ch.put(2,"Nirav");

        Iterator<Map.Entry<Integer,String>> iterator = ch.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> m = iterator.next();
            System.out.println(m.getValue());
        }*/

        String s1 = "Dippy";
        String s2 = new String("Dippy");
        String s3 = s2.intern();

        System.out.println(s1.equals(s2)+"  should false s1&s2");
        System.out.println(s1==s2);
        System.out.println(s2.equals(s3)+" should false s2&s3");
        System.out.println(s2==s3);
        System.out.println(s1.equals(s3)+" should true s1&s3");
        System.out.println(s1==s3);
    }
}
