package com.dn.application.extra.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class HashMapExample {

    public void hi(HashMap<Integer,Integer> map){
        map.entrySet().stream().forEach(i-> System.out.println(i.getKey()+i.getValue()));
        Iterator iterator = map.values().iterator();
        while (iterator.hasNext()){
            int str = (int) iterator.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        //HashMap<String,String> map = new HashMap<String,String>(){{
          //  put("","");
        //}};
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for(int i = 0;i<8;i++){
            //executor.submit(new Pool(i));
        }


        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        IntStream.range(0,100).forEach(i->map.put(i,0));
        HashMapExample hashMapExample = new HashMapExample();
        hashMapExample.hi(map);
    }
}
