package com.dn.application.extra.test;

import java.util.Arrays;

public class SecondMaxNumber {

    public static void main(String[] args) {
        int a[] = {10, 5, 10};
        SecondMaxNumber.secondMaxArray(a);
    }

    public static void secondMaxArray(int[] a){
        Arrays.sort(a);
        for(int i=a.length-2; i>=0; i--){
            if(a[i] != a[a.length-1]){
                System.out.println("Second Largest element:"+a[i]);
                return;

            }
        }
        return;
    }
}
