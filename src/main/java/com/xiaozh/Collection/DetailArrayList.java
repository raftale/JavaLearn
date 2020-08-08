package com.xiaozh.Collection;

import java.util.ArrayList;

public class DetailArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayLists = new ArrayList<>(1);
        System.out.println(arrayLists.size());
        arrayLists.add(5);
        arrayLists.add(4);
        arrayLists.add(5);

//        for (Integer arrayList:arrayLists) {
//            System.out.println(arrayList);
//        }
        Integer a = 5;
        arrayLists.remove(a);
        for (Integer arrayList:arrayLists) {
            System.out.println(arrayList);
        }

    }
}
