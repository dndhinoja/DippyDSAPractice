package com.dn.application.LeetCode.CollectionSorting;

import com.dn.application.LeetCode.CollectionSorting.FruitComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitSortingComparable {

        public static void main(String[] args){
            List<FruitComparable> fruitComparableList = new ArrayList<FruitComparable>();
            FruitComparable apple = new FruitComparable(3,"banana","red");
            FruitComparable orange = new FruitComparable(2,"orange","orange");
            FruitComparable banana = new FruitComparable(1,"apple","yellow");

            fruitComparableList.add(orange);
            fruitComparableList.add(apple);
            fruitComparableList.add(banana);

            Collections.sort(fruitComparableList);

            for(FruitComparable fruitComparable : fruitComparableList){
                System.out.println(fruitComparable.getFruitName());
            }
        }
}
