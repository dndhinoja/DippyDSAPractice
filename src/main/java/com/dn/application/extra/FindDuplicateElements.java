package com.dn.application.extra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicateElements {

    public Integer[] duplicateElements(int[] array){

        HashMap<Integer, String> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<array.length; i++){
            if(map.containsKey(array[i])){
                set.add(array[i]);
            }
            else {
                map.put(array[i],"dummy");
            }
        }
        Integer[] arr1 = set.toArray(new Integer[set.size()]);
    return   arr1;
    }

    public static void main(String[] args) {
        FindDuplicateElements findDuplicateElements = new FindDuplicateElements();
        int[] a = {2,1,3,4,3,1,6};
        Integer[] b = findDuplicateElements.duplicateElements(a);
        System.out.println(Arrays.toString(b));
    }
}
