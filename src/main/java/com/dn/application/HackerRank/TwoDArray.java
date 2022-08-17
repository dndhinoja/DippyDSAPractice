package com.dn.application.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TwoDArray {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[6][6];
        for(int i =0; i<6; i++){
            for(int j = 0; j<6; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        hourGlass(array, 3);
    }
    public static int hourGlass(int[][] arr, int hourGlassLength){
        for(int i = 0; i< arr.length-hourGlassLength+1; i++){
            for(int j = 0; j< arr.length-hourGlassLength+1; j++) {
                sumOfHourGlass(arr, i, j, hourGlassLength);
            }
        }

        return 0;
    }

    private static void sumOfHourGlass(int[][] arr, int l, int k, int hourGlassLength) {
        int sum = 0;
        for(int i = l; i< l+hourGlassLength; i++){
            for(int j = k; j< k+hourGlassLength; j++) {
                int temp1 = l+1;
                int tem2 = k+1;
                    if(i == temp1){
                        if(j==tem2) {
                            sum = arr[i][j] + sum;
                        }
                        continue;
                    }

                    sum = arr[i][j] + sum;
            }
        }
        System.out.println("sum"+sum);
    }

}
