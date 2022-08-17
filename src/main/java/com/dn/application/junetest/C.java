package com.dn.application.junetest;

import com.dn.application.MayTest.ABC;
import com.dn.application.MayTest.I;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class C {

    public static void main(String[] args) {
        DefaultMethodDemo defaultMethodDemo = new DefaultMethodDemo();
        I.show();
        ABC abc = new ABC();
        abc.A();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.forEach(i-> System.out.println(i));

        Consumer<Integer> cunsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
                return;
            }
        };

        List<String> list1 = Arrays.asList("dipali","nirr","raja");
        list1.forEach(str-> System.out.println(list1.stream().collect(Collectors.toList())) );
        Consumer<Integer> c = i-> System.out.println(i);
    }
}
