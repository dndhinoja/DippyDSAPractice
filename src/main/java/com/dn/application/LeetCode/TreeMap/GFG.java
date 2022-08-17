package com.dn.application.LeetCode.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class GFG {
    public static void main(String[] args) {
        Map<Key, String> treemap = new TreeMap<>();
        Map<String, String> treemap1 = new TreeMap<>();

        // Adding the elements in object of TreeMap
        // Custom inputs
        treemap.put(new Key("Key4"), "Alice");
        treemap.put(new Key("Key4"), "Zeya");
        treemap.put(new Key("Key3"), "Geek");
        treemap.put(new Key("Key2"), "Bob");

        treemap1.put("Key4", "Alice");
        treemap1.put("Key1", "Zeya");
        treemap1.put("Key3", "Geek");
        treemap1.put("Key2", "Bob");

        // Iterate over object elements using for-each loop
        for (Map.Entry<Key, String> entry :
                treemap.entrySet())

            // Print elements in TreeMap object
            System.out.println(
                    "[" + entry.getKey().printKey() + " = "
                            + entry.getValue() + "]");

        System.out.println(treemap1);
    }

}

