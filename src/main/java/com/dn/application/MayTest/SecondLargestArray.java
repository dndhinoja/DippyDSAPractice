package com.dn.application.MayTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestArray {

    public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }

    public static void main(String[] args) {
        int a[]={7,2,5,6,3,1};
        int b[]={44,66,99,77,33,22,55};
        System.out.println("Second Largest: "+getSecondLargest(a,6));
        System.out.println("Second Largest: "+getSecondLargest(b,7));
    }

    public static void secondLargestElement(int[] arr){
        int temp = 0;
        for(int  i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int a  = arr[arr.length-2];
        }
    }
    public static void secondLargestElementt(Integer[] arr){
        List<Integer> list =  Arrays.asList(arr);
        Collections.sort(list);
        int a = list.get(arr.length-2);
    }
}
