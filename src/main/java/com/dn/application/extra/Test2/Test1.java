package com.dn.application.extra.Test2;

import java.util.HashMap;

//String test = "This this code is is written by Rahul Rahul".
//o/p - This=1, this=1, code=1, is=2, written=1, by=1, Rahul=2
public class Test1 {


    public void finalize(){

    }
    public void count(String str){
        String[] words = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        int count = 0;
        //int counter[] = new int[words.length];
        int countWordOccurence = 0;

        for(int i = 0; i< words.length; i++){
            if(map.containsKey(words[i])) {
                countWordOccurence++;
            }
            else {
                map.put(words[i], count++);
                countWordOccurence++;
            }
            System.out.println(countWordOccurence);
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.count("This this code is is written by Rahul Rahul");
    }

}
