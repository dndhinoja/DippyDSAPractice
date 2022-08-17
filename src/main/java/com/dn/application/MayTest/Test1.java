package com.dn.application.MayTest;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test1 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Dipali","Dipali");
        map.put("Nirr","Nirr");
        map.put("Panda","Panda");
        System.out.println(map);
        map.put("Pandi","Pandi");
        map.put("Pandii","Pandii");
        map.put("Panddaa","Panddaa");
        map.put("nirr","nirr");
        map.put("dipali","dipali");
        map.put("Dipalid","Dipali");
        System.out.println(map);

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Dipali","Dipali");
        linkedHashMap.put("Nirr","Nirr");
        linkedHashMap.put("Panda","Panda");
        System.out.println(linkedHashMap);
        linkedHashMap.put("Pandi","Pandi");
        linkedHashMap.put("Pandii","Pandii");
        linkedHashMap.put("Panddaa","Panddaa");
        linkedHashMap.put("nirr","nirr");
        linkedHashMap.put("dipali","dipali");
        linkedHashMap.put("Dipalid","Dipali");
    }
}
