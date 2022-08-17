package com.dn.application.LeetCode.Arrays;

public class Sudoku {

    public boolean validOrNot(int[][] input) {
        int[] count = new int[9];
        int aaa = input.length;

        for (int i = 0; i < input.length; i++) {
            count = new int[9];
            for (int j = 0; j < input[i].length; j++) {
                int box = input[i][j];
                if ((box - 1) >= 0) {
                    if (check(input[i][j], count[box - 1]))
                        count[input[i][j] - 1]++;
                    else
                        return false;
                } else
                    continue;
            }
        }
        return true;
    }
        /*int j = 0;*/
        /*while (j < input.length){
            count = new int[9];
            for (int i = 0; i < input[j].length; i++) {
                int box = input[i][j];
                if((box-1)>=0) {
                    if (check(input[j][i], count[i]))
                         count[input[j][i]-1]++;
                    else
                        return false;
                }
                else
                    return false;
            j++;
        }
        return true;
        }*/
        public boolean check(int che,int count1){
            if (che >= 1 && che <= 9 || che == 0) {
                if (count1 == 0)
                    return true;
            }
            return false;
        }
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        int[][] input1 =
                {{5,3,0,0,7,0,0,0,0}
                ,{6,0,0,1,9,5,0,0,0}
                ,{0,9,8,0,0,0,0,6,0}
                ,{8,0,0,0,6,0,0,0,3}
                ,{4,0,0,8,0,3,0,0,1}
                ,{7,0,0,0,2,0,0,0,6}
                ,{0,6,0,0,0,0,2,8,0}
                ,{0,0,0,4,1,9,0,0,5}
                ,{0,0,0,0,8,0,0,7,9}};
        Boolean a = sudoku.validOrNot(input1);
        System.out.println(a);
    }
}
