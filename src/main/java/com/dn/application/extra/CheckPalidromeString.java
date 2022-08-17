package com.dn.application.extra;

public class CheckPalidromeString {

    public boolean checkPalindromeString(String str){

        int i = 0, j = str.length()-1;

        while (i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPalidromeString checkPalidromeString = new CheckPalidromeString();
        System.out.println(checkPalidromeString.checkPalindromeString("abbacbba"));
    }
}
