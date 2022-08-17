package com.dn.application.MayTest;

public class Test2 {

    public void secondLargestNumber(int[] arr){
        for(int i = 0; i<arr.length;i++){
            int temp = 0;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int secondL = arr[arr.length-2];
        System.out.println(secondL);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int[] arr = {4,1,2,45,8,2,3};
        test2.secondLargestNumber(arr);
    }
}
