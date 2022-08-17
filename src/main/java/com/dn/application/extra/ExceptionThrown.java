package com.dn.application.extra;

public class ExceptionThrown {

    static int divideByZero(int a, int b){
        int i = a/b;
        return i;
    }
    static int computeDivision(int a, int b) {
        int res =0;
        try {res = divideByZero(a,b);}
        catch(NumberFormatException ex) {System.out.println("NumberFormatException is occurred");}
        return res;
    }
    public static void main(String args[]){
        int a = 1;
        int b = 0;
        try {
            System.out.println("In code");
            //int i = computeDivision(a,b);
            int i = a/b;
        }
        catch(ArithmeticException ex) {
            System.out.println("Hi I am expetion");
            System.out.println(ex.getMessage());}
    }
}
