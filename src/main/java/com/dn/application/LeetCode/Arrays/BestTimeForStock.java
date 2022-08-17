package com.dn.application.LeetCode.Arrays;

public class BestTimeForStock {

    public int MaxProfit(int[] arr){
        int max = 0;
        for(int i = 0; i< arr.length-1; i++){
            for(int j = i+1 ; j< arr.length; j++) {
                int c = arr[j] - arr[i];
                if (c > 0) {
                    if (max < c)
                        max = c;
                }
            }
        }

        int max1 = 0;
        for(int j = 0; j< arr.length-2; j++){
            int a = arr[j+1]-arr[j];
            if(a>0) {
                int k = j+1;
                while(k<arr.length-1){
                    int b = arr[k + 1] - arr[k];
                    if(b>0) {
                        if (max1 < a + b)
                            max1 = a + b;
                    }
                    k++;
                }
            }
        }
        if(max>max1)
            return max;
        else
            return max1;
    }
    public static void main(String[] args) {
        BestTimeForStock bestTimeForStock = new BestTimeForStock();
        int[] price = {1,2,3,4,5};
        System.out.println(bestTimeForStock.MaxProfit(price));
    }
}
