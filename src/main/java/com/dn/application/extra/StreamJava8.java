package com.dn.application.extra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamJava8 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(0);

        Random random = new Random();
        random.ints().limit(5).forEach(r-> System.out.println("Random"+r));
        List<Integer> streamList = arrayList.stream()
                .filter(i->i%2==0)
                .sorted(Comparator.reverseOrder())
                .map(i->i*i)
                .limit(2)
                .collect(Collectors.toList());
        arrayList.stream().limit(4).forEach(number-> System.out.println(number));
        arrayList.forEach(number-> System.out.println(number));
        System.out.println(streamList);


        List<String> arrayListString = new ArrayList<String>();
        arrayListString.add("2");
        arrayListString.add("11");
        arrayListString.add("Dipali");
        arrayListString.add("");
        arrayListString.add("NIrr");

        int count = (int) arrayListString.stream().filter(element->element.isEmpty()).count();
        System.out.println("Empty String:"+count);

    }
}
