package com.dn.application.extra;

public class LongestPalindromee {

    public String palindrome(String str){

        int high=0, low =0;
        int palindromeLength = 0;
        int maxLength = 0;
        int strat = 0;
        for(int i = 0; i<str.length(); i++){
            high = i+1;
            low = i-1;
            while(high< str.length() && str.charAt(i)==str.charAt(high)){
                high++;
            }
            while (low >= 0 && str.charAt(i)==str.charAt(low)){
                low--;
            }
            while (high< str.length() && low >= 0 && str.charAt(low)==str.charAt(high)){
                high++;
                low--;
            }

            palindromeLength = high-low-1;
            if(palindromeLength > maxLength){
                maxLength = palindromeLength;
                strat = low+1;
                System.out.println(maxLength);
            }
        }
         return str.substring(strat,strat+maxLength);
    }

    public static void main(String[] args) {
        LongestPalindromee longestPalindromee = new LongestPalindromee();
        String pp = longestPalindromee.palindrome("forgeeksskeegfor");
        System.out.println(pp);
    }
}
