package com.dn.application.extra;

public class FindMoreOccurenceWord {

    public String occurenceCounting(String str){
        String[] words = str.split(" ");
        int[] count = new int[words.length];
        int maxCount = 0;
        String maxOccurString = null;
        //count[0] = 1;
        for(int i = 0 ; i< words.length; i++){
            count[i]++;
            for(int j = 0; j<=i-1;j++) {
                if (words[i].equals(words[j]))
                    count[j]++;
                if(count[j]>maxCount){
                    maxCount = count[j];
                    maxOccurString = words[i];
                }
            }

        }
        return maxOccurString;
    }

    public static void main(String[] args) {
        FindMoreOccurenceWord findMoreOccurenceWord = new FindMoreOccurenceWord();
        findMoreOccurenceWord.occurenceCounting("one two five one four five one two five two five two five");
    }
}
