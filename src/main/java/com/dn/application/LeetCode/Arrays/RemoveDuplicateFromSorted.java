package com.dn.application.LeetCode.Arrays;

import java.util.*;

public class RemoveDuplicateFromSorted {

    public void removeDuplicate(Integer[] arr){
        List<Integer> list = Arrays.asList(arr);
        Set<Integer> set = new HashSet<Integer>(list);
        System.out.println(set);
    }

    public Integer[] removeDuplicateManual(Integer[] arr){
        int k = 0;
        for(int i = 0; i< arr.length; i++){
            int j = i+1;
            while(j<(arr.length-k))
                if((arr[i] == arr[j])){
                    k++;
                    int l = j;
                    while(l!=arr.length-1) {
                        arr[l] = arr[l + 1];
                        l++;
                    }
                    arr[arr.length-1] = Integer.valueOf('_');
                }
                else if(arr[i]!=arr[j]){
                    break;
                }
            }
    return arr;
    }

    public static void main(String[] args) {
        RemoveDuplicateFromSorted removeDuplicateFromSorted = new RemoveDuplicateFromSorted();
        Integer[] arr = {1,1,1,2,2,3,3,4};
        removeDuplicateFromSorted.removeDuplicate(arr);

        Integer[] arr1 = {0,1,1,1,2,2,3,3,4};
        Integer[] a = removeDuplicateFromSorted.removeDuplicateManual(arr1);
        System.out.println(a);
    }
}
