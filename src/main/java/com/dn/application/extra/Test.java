package com.dn.application.extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("AB",new Date(1/1/1992)));
        list.add(new Employee("BC",new Date(1/2/1990)));
        list.add(new Employee("CD",new Date(1/3/1991)));
        Collections.sort(list);
        for(Employee e:list){
            System.out.println(e.toString());
        }
    }
}
