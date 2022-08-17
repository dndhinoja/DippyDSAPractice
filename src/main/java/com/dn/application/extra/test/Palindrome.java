package com.dn.application.extra.Test3;

public class Palindrome {

    public int palindrome(String arr){
        char[] chars = arr.toCharArray();
        int high = 0;
        int low = 0;
        int maxLength = 0;
        for(int i = 0; i<chars.length; i++) {
            high = i + 1;
            low = i - 1;

            while (high < arr.length() && (chars[high] == chars[i])) {
                high++;
            }
            while(low>=0 && chars[low]==chars[i]){
                low--;
            }
            while (high < arr.length() && low >= 0 && (chars[high] == chars[low])) {
                high++;
                low--;
            }

            int palindromeLength = high - low - 1;
            if (palindromeLength > maxLength) {
                maxLength = palindromeLength;
                System.out.println(maxLength);
            }
        }
        return maxLength;
    }

    public String longestPalindrome(String[] palindromes){
        int longest = 0;
        int length = 0;
        String longestString = null;
        for(int i = 0; i<palindromes.length; i++){
            length = palindrome(palindromes[i]);
            if(longest<length) {
                longest = length;
                longestString = palindromes[i];
            }
        }
        return longestString;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String[] strings = {"aba", "cabmadambac", "hihihih"};
        System.out.println(palindrome.longestPalindrome(strings));
        //palindrome.palindrome("forgeeksskeegfor");
    }
}
