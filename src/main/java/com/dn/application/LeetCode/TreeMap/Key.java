package com.dn.application.LeetCode.TreeMap;

public class Key implements Comparable<Key>{

    final int data = 112;
    private String key;

    // Constructor of this class
    public Key(String key)
    {
        // Super keyword refers immediate parent class
        // object
        super();

        // This keyword is a reference variable
        // referring to current object
        this.key = key;
    }

    // Print Key method
    public String printKey() { return this.key; }

    // Override compareTo method
    @Override
    public int compareTo(Key obj)
    {
        return key.compareTo(obj.key);
    }
}
