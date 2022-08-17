package com.dn.application.junetest;

import com.dn.application.MayTest.I;
import com.dn.application.MayTest.J;

public class DefaultMethodDemo implements I, J {

    public void insideClass(){
        System.out.println("D");
    }

}
