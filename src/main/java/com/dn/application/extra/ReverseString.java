package com.dn.application.extra;

public class ReverseString {

    public void reverseString(String str){
        String newString = null;
        for(int i = str.length()-1; i>=0; i--){
            char c = str.charAt(i);
            if(newString==null)
                newString = String.valueOf(c);
            else {
            newString  = newString + c;}
        }
        System.out.println(newString);
        return;
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString("Hiiii Dipali");
    }
}
