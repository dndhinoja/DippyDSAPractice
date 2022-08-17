package com.dn.application.extra.test;

public class PrimeNumber {
    public void primeNumber(int a){
        boolean flag = true;
        if(a==1 || a==0){
            System.out.println("Not");
            flag =false;
            return;
        }
        for(int i =2; i<=a/2; i++){
            if(a%i==0){
                System.out.println("Not");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }
        return;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.primeNumber(7);
    }
}
