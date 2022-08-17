package com.dn.application.extra;

public class MaximumNumberOccurence {

    int[] count = new int[256];
    public char maxOcur(String str){
        for(int i=0;i <str.length();i++){
            char c = str.charAt(i);
            count[c]++;
        }
        int max  = -1;
        char result = ' ';
        for(int i=0;i<str.length();i++){
            if(max<count[str.charAt(i)]){
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MaximumNumberOccurence maximumNumberOccurence = new MaximumNumberOccurence();

        System.out.println(maximumNumberOccurence.maxOcur("abcccdddee"));
    }
}
