package com.dn.application.extra;

public class BuildStreet {

    public int waysToStreet(int n){
        int[][] way = new int[2][n+1];

        way[0][1] = 1;
        way[1][1] = 2;

        for(int i = 2; i<=n; i++){

            way[0][i] = way[0][i-1] + way[1][i-1];

            way[1][i] = (2*way[0][i-1]) + way[1][i-1];
        }
        return way[0][n]+way[1][n];
    }

    public static void main(String[] args) {
        BuildStreet buildStreet = new BuildStreet();
        System.out.println(buildStreet.waysToStreet(3));
    }
}
