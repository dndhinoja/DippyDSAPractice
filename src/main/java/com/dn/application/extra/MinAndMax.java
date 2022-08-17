package com.dn.application.extra;

public class MinAndMax {

    public int max(int[] a){
        int max = a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MinAndMax minAndMax = new MinAndMax();
        int[] a = {1,3,2,6,4};
        int maximum = minAndMax.max(a);
        System.out.println(maximum);
    }
}
