package com.dn.application.MayTest;

public class JuneTest {

    public static String appendSmallChar(String word1, String word2){

        if(word1==null && word2==null){
            return null;
        }
        else if(word1==null){
            return word2;
        }
        else if(word2==null) {
            return word1;
        }
        else {
            char[] charOfWord1 = word1.toCharArray();
            char[] charOfWord2 = word2.toCharArray();

            StringBuilder stringBuilder = new StringBuilder();

            int j = 0;
            int i = 0;
            while (i < charOfWord1.length && j < charOfWord2.length) {
                if (charOfWord1[i] < charOfWord2[j]) {
                    stringBuilder.append(charOfWord1[i]);
                    i++;
                } else {
                    stringBuilder.append(charOfWord2[j]);
                    j++;
                }
            }
            if (i < charOfWord1.length) {
                while (i < charOfWord1.length) {
                    stringBuilder.append(charOfWord1[i]);
                    i++;
                }
            }
            if (j < charOfWord2.length) {
                while (i < charOfWord2.length) {
                    stringBuilder.append(charOfWord2[j]);
                    j++;
                }
            }

            return stringBuilder.toString();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        String s  =JuneTest.appendSmallChar("dipali","dhinoja");
        System.out.println(s);
    }
}
