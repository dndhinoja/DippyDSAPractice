package com.dn.application.extra;

public class BinarySearchAlgo {

    public int binarySearch(int[] a,int strt, int last, int x){
        int middleElementIndex = strt+(last-strt)/2;

        if(last >= 1) {
            if (a[middleElementIndex] == x) {
                return middleElementIndex;
            } else if (a[middleElementIndex] > x) {
                return binarySearch(a, strt, middleElementIndex - 1, x);
            } else {
                return binarySearch(a, middleElementIndex + 1, last, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchAlgo binarySearchAlgo = new BinarySearchAlgo();
        int[] a =  { 2, 3, 4, 5, 10, 40, 100, 120 };
        System.out.println(binarySearchAlgo.binarySearch(a,0, a.length-1 , 10));
    }
}
