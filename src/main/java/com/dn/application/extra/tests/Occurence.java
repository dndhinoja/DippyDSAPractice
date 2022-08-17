package com.dn.application.extra.tests;

import java.util.HashMap;

public class Occurence {

    public void occurence(String str) {
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int[] count = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                count[i] = map.get(chars[i]);
                map.put(chars[i], count[i] + 1);

            } else {
                map.put(chars[i], 1);
            }
            System.out.println("Occurence of "+chars[i]+":"+(++count[i]));
        }
    }

    public static void main(String[] args) {
           Occurence occurence = new Occurence();
           Class c = occurence.getClass();
           System.out.println(c.getName());
           occurence.occurence("DIPALI");
    }
}
