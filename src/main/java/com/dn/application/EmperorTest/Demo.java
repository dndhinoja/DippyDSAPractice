package com.dn.application.EmperorTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {

    public static void main(String[] args) {
        /*List<Home> homeList = new ArrayList<>();
        homeList.add(new Home(1,""));
        homeList.add(new Home(2,""));

        List<Bill> billList = new ArrayList<>();
        billList.add(new Bill(1,1000L,Month.JAN,));*/

        /*List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        String[] s = {"","","","",""};*/
        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            if(list.get(2).equals("3")){
                System.out.println("Hi");
                list.remove("3");
            }
        }*/
        /*for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String integer = iterator.next();
            if (integer.equals("2")) {
                iterator.remove();
            }
            System.out.println(list);
        }*/

        List<String> marvel
                = new CopyOnWriteArrayList<String>();

        // Adding elements to the above object created
        // Custom input entries
        marvel.add("IronMan");
        marvel.add("BlackWidow");
        marvel.add("Hulk");
        marvel.add("DoctorStrange");
        marvel.add("SpiderMan");

        // Iterating over object created using size() method
        for (int i = 0; i < marvel.size(); i++) {

            // Print and display the object elements
            // using get() method
            System.out.println("Avenger : "
                    + marvel.get(i));

            // Condition check over object elements

            // If specific element is matched
            if (marvel.get(i).equals("BlackWidow")) {
                marvel.remove(i);
                i--;

                // Add this specific element
                marvel.add("CaptianAmerica");
            }
        }

        // Now getting the final total size by checking
        // how many elements are there inside object
        System.out.println("Total Avengers : "
                + marvel.size());
    }
}