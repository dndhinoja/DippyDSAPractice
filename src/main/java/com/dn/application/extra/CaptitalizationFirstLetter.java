package com.dn.application.extra;

import java.util.ArrayList;

public class CaptitalizationFirstLetter {

    public String capitalizationFirstLetter(String str, ArrayList<String> list){
        String[] words = str.split(" ");
        String newString = null;
        for(int i = 0;i< words.length;i++){
            if(list.contains(words[i])){
                words[i] = words[i].substring(0,1).toUpperCase()+words[i].substring(1);
            }
            if(newString==null){
                newString = words[i];
            }
            else {
                newString = newString + " " + words[i];
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        CaptitalizationFirstLetter captitalizationFirstLetter = new CaptitalizationFirstLetter();
        ArrayList<String> list = new ArrayList<>();
        list.add("this");
        list.add("fun");
        System.out.println(captitalizationFirstLetter.capitalizationFirstLetter("this is fun and crazy",list));
    }
}
