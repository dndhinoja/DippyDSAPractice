package com.dn.application.extra;

public class BubbleSort {

    public void sorting(int[] array){
        int temp = 0;

        for(int i = 0; i<array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
    BubbleSort bubbleSort = new BubbleSort();
    int[] a = { 5, 1, 4, 2, 8};
    bubbleSort.sorting(a);
    }
}
