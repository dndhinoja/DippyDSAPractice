package com.dn.application.extra;

import java.util.Comparator;

public class NDSorting implements Comparator<ND> {
    @Override
    public int compare(ND o1, ND o2) {
        return o1.name.compareTo(o2.name);
    }
}
