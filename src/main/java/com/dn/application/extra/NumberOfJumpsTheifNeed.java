package com.dn.application.extra;

public class NumberOfJumpsTheifNeed {

    public int jumpCalculation(int[] height){
        int jump = 0;
        for(int i = 0; i<height.length;i++){
            //if(height[i]<10){
                jump++;
            //}
            while (height[i]>10){
                if((height[i] = height[i] - 10 +1)>0)
                jump++;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        NumberOfJumpsTheifNeed numberOfJumpsTheifNeed = new NumberOfJumpsTheifNeed();
        int[] heights = {11,10,10,9};
        System.out.println(numberOfJumpsTheifNeed.jumpCalculation(heights));
    }
}
