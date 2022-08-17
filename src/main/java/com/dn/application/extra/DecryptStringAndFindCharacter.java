package com.dn.application.extra;

public class DecryptStringAndFindCharacter {

    public String DecryptStringAndFindCharacter(String encrypted){
        String newString = null;
        int i = 0;
        while (i<encrypted.length())
            if(encrypted.charAt(i)>='a' && encrypted.charAt(i)<'z'){
                int j  =i+1;
                char repeatation = encrypted.charAt(j);
                int r  = Character.getNumericValue(repeatation);
                newString = repeatation(r, encrypted.charAt(i),newString);
                i = i+2;
            }
        return newString;
        }

    public String repeatation(int repeatation, char a, String newString){
            for(int j = 0; j < repeatation; j++){
                if(newString==null){
                    newString = String.valueOf(a);
                }
                else {
                    newString = newString + a;
                }
            }
            return newString;
        }

    public static void main(String[] args) {
        DecryptStringAndFindCharacter decryptStringAndFindCharacter = new DecryptStringAndFindCharacter();
        System.out.println(decryptStringAndFindCharacter.DecryptStringAndFindCharacter("a2b3c4"));
        String newString = decryptStringAndFindCharacter.DecryptStringAndFindCharacter("a2b3c4");
        for (int i =0; i<newString.length();i++){
            if(i==8){
                char c = newString.charAt(i);
                System.out.println(c);
            }
        }
    }
}
