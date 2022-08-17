package com.dn.application.LeetCode.Strings;

public class ReverseString {

    public void reverse(String str){
        char[] chars = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = chars.length-1; i>=0; i--){
            stringBuffer.append(chars[i]);
        }
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverse("Hannah");
    }
}
