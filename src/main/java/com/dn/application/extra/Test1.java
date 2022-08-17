package com.dn.application.extra;
//input a = [3,4,5,6]
//Write a logic that display below.
//Output
//(9,16,25,36)
//(9,16,25)
//(9,16)
//(9)
public class Test1 {

    public int[] square(int[] a){
        int square = 0;
        int[] temp = new int[a.length];
        int length = a.length;
        for(int i = 0; i<length;i++){
            temp = new int[length-i];
            for(int j = 0;j<length-i;j++) {
                square = a[j] * a[j];
                temp[j] = square;
                System.out.println(temp[j]);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println("test dippy");
        Test1 test1 = new Test1();
        int[] a = {3,4,5,6};
        int[] output = test1.square(a);
        for(int j =0;j<output.length;j++){
            System.out.println(output[j]);
        }
    }
}
