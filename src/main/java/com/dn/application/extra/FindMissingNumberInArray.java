package com.dn.application.extra;

import java.util.Arrays;

public class FindMissingNumberInArray {

    public boolean findMissingNumber(int[] a){
        Arrays.sort(a);
        boolean flag = true;
        int missigNUmber = 0;
        int previousElement = -1;
        for(int i = 0;i <a.length;i++){
            if(previousElement!=-1){
                if(a[i] != (previousElement+1)){
                    missigNUmber = previousElement+1;
                    System.out.println(missigNUmber);
                    flag = false;
                    break;
                }
            }
            previousElement = a[i];
        }
        return flag;
    }

    public static void main(String[] args) {
        FindMissingNumberInArray findMissingNumberInArray = new FindMissingNumberInArray();
        int[] a= {1, 2, 3, 5};
        System.out.println(findMissingNumberInArray.findMissingNumber(a));
    }
}
