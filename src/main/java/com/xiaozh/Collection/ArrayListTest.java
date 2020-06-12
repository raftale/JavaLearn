package com.xiaozh.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {


    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        for (Integer s: arrlist) {
            System.out.println(s);
        }

        List<Integer> list = new ArrayList<>();
        Integer[] num=new Integer[3];
        num = arrlist.toArray(num);
        for(Integer str: num){
            System.out.print(str+" ");
        }



//        arrlist.
    }
}
