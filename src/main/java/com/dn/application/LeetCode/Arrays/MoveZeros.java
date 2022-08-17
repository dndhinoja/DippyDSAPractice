package com.dn.application.LeetCode.Arrays;

public class MoveZeros {

    public int[] moveZeros(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length- count; i++) {
            if (arr[i] == 0 && i != arr.length - 1 && (i != arr.length-count-1)) {
                for (int j = i + 1; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                }
                count++;
                arr[arr.length - 1] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        MoveZeros moveZeros = new MoveZeros();
        int[] arr = {0,1,0,3,12,0};
        int[] arr1 = moveZeros.moveZeros(arr);
    }
}
