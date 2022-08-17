package com.dn.application.extra;

public class FifththLargestElement {

    public int[] fifthLargestElement(int[] a, int[] b, int[] c){
        twoElementCompare(a,b);
        return twoElementCompare(twoElementCompare(a,b),c);
    }

    public int[] twoElementCompare(int[] a, int[] b){
        int[] joinedArray = new int[a.length+ b.length];


                if(a[a.length-1]<b[0]){
                    return fillUpArray(a,b);
                }
                //else if(b[b.length-1]>a[0]){
                  //   return fillUpArray(b,a);
                //}
                else {
                    int i = 0;
                    int j = 0;
                    int k = 0;
                    while(j<a.length && k<b.length){
                        if(a[j] < b[k]){
                            joinedArray[i++] = a[j++];
                            if(j==a.length){joinedArray[i] = b[k];}
                        }
                        else if(a[j] >= b[k]){
                            joinedArray[i++] = b[k++];
                            if(k==b.length){joinedArray[i] = a[j];}
                        }
                    }
                    return joinedArray;
                }
    }

    private int[] fillUpArray(int[] array1, int[] array2) {
        //int[] joint = Arrays.stream(array1).toArray();
        int[] joint = new int[array1.length+array2.length];
        int j = 0;
        for(int i = 0; i<array1.length;i++){
            joint[i] = array1[j++];
        }
        int k = 0;
        for(int i = array1.length; i< array1.length+array2.length;i++){
            joint[i]  = array2[k++];
        }
        return joint;
    }

    public static void main(String[] args) {
        FifththLargestElement fifththLargestElement = new FifththLargestElement();
        int[] a = {1,5,10};
        int[] b = {4,5,6};
        int[] c  = {7,8,9};
        int[] result = fifththLargestElement.fifthLargestElement(a,b,c);
        System.out.println("Hi");
    }
}
