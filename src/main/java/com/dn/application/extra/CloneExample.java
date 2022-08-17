package com.dn.application.extra;

public class CloneExample implements Cloneable{

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
