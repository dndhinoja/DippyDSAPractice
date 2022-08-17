package com.dn.application.junetest;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COpyOnWriteArrayList implements Runnable {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list
                = new CopyOnWriteArrayList<>();

        // Initial Iterator
        Iterator itr = list.iterator();
        list.add("GfG");
        System.out.println("List contains: ");
        while (itr.hasNext())
            System.out.println(itr.next());

        // iterator after adding an element
        itr = list.iterator();
        System.out.println("List contains:");
        while (itr.hasNext())
            System.out.println(itr.next());

        COpyOnWriteArrayList cOpyOnWriteArrayList = new COpyOnWriteArrayList();
        Thread thread = new Thread(cOpyOnWriteArrayList);
        thread.start();
    }

    @Override
    public void run() {

    }
}
