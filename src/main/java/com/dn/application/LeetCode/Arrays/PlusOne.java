package com.dn.application.LeetCode.Arrays;

public class PlusOne {

    public int[] plusOne(int[] arr){
        int mult = 1;
        int number = 0;
        for(int i = 0; i<arr.length; i++){
                number = arr[i] + number * mult;
                if(mult==1)
                    mult = mult * 10;
        }
        number = ++number;
        int newNumber = number;

        int len = 0;
        while(number>0){
            len++;
            //int ele = number%10;
            number = number/10;
            //arr[i] = ele;
            //i--;
        }
        int[] arr1 = new int[len];
        int i =arr1.length-1;
        while (newNumber>0){
            int ele = newNumber%10;
            newNumber = newNumber/10;
            arr1[i] = ele;
            i--;
        }
        return arr1;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] arr = {9};
        int[] out = plusOne.plusOne(arr);
        System.out.println(out.length);
    }
}

