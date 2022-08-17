package com.dn.application.extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NDDemo {

    public static void main(String[] args) {

        List<ND> list = new ArrayList<>();
        list.add(new ND(3,"Nirr","3"));
        list.add(new ND(2,"Dipali","4"));

        Collections.sort(list);
        System.out.println(list);
        List<Integer> list1;
        Collections.sort(list,new NDSorting());
        System.out.println(list);

    }
}
