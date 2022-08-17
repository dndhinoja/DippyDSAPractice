package com.dn.application.extra;

public class DearrangementPermutation {
    public int dearrangementPermutation(int n){
        int a = 0;
        int b = 1;
        int count = 0;

        if(n==1 || n==2){
            return n-1;
        }
        for(int i = 3;i<=n;i++){
            count = (i-1)*(a+b);
            a = b;
            b= count;
        }
        return count;
    }

    public static void main(String[] args) {
        DearrangementPermutation dearrangementPermutation = new DearrangementPermutation();
        System.out.println(dearrangementPermutation.dearrangementPermutation(6));
    }
}
