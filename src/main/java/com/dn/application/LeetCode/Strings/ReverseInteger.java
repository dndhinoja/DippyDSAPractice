package com.dn.application.LeetCode.Strings;

public class ReverseInteger {

    public void reverseInt(int num){
        int newNum = 0;

        if(num>=100 && num<1000) {
            int div = 100;
            while (num > 0) {
                int mod = num % 10;
                newNum = mod * div + newNum;
                div = div / 10;
                num = num / 10;
            }
        }
        System.out.println(newNum);
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        reverseInteger.reverseInt(321);
    }

}
