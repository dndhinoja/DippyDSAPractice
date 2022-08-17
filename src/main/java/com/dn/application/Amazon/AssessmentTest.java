package com.dn.application.Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AssessmentTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,56);
        Integer[] arr = list.toArray(new Integer[0]);

        //Consumer<Integer> c = integer -> System.out.println(integer);

        list.forEach(i-> System.out.println(i));
    }
}
