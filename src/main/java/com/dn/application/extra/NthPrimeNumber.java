package com.dn.application.extra;

public class NthPrimeNumber {

    public int nthPrimeNumber(int number){
        int count = 0;
        boolean primeFlag = true;
        if(number>=2)
            count++;
        else
            return 0;

        for(int i = 3; i<=number;i++){
            primeFlag = true;
            for(int j = 2; j<=i/2;j++){
                if(i%j==0){
                    primeFlag = false;
                    break;
                }
            }
            if(primeFlag)
                count++;
        }
    return count;
    }

    public static void main(String[] args) {
        NthPrimeNumber nthPrimeNumber = new NthPrimeNumber();
        System.out.println(nthPrimeNumber.nthPrimeNumber(2));
    }
}
