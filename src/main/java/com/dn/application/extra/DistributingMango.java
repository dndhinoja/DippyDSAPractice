package com.dn.application.extra;

public class DistributingMango {

    public void distribution(int m, int n){
        int temp = m+n-1;
        int possibleCount = temp*(n-1);
        System.out.println(possibleCount);
    }

    public static void main(String[] args) {
        DistributingMango distributingMango = new DistributingMango();
        distributingMango.distribution(3,3);
    }
}
