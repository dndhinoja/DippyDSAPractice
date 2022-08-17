package com.dn.application.extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDemo {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(65);
        Person p2 = new Person();
        p2.setAge(34);
        Person p3 = new Person();
        p3.setAge(67);

        List<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(p1);
        listOfPerson.add(p2);
        listOfPerson.add(p3);

        List<Person> copy = listOfPerson.stream().collect(Collectors.toList());

        Collections.sort(listOfPerson);
        listOfPerson.forEach(person -> System.out.println(person.toString()));
        //System.out.println(listOfPerson.toString());
    }
}
