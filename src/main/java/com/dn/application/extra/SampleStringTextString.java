package com.dn.application.extra;

public class SampleStringTextString {

    public boolean matchingChar(String textString,String sampleString){
        int j = 0;
        for(int i = 0; i<textString.length();i++){
            if((textString.charAt(i) == sampleString.charAt(j)) && (j<sampleString.length())){
                j++;
            }
            if(j==sampleString.length()-1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SampleStringTextString sampleStringTextString = new SampleStringTextString();

        boolean b = sampleStringTextString.matchingChar("abghfhjNkjehIfwjekjbAkjhV","NIRAV");
        System.out.println(b);
    }
}
