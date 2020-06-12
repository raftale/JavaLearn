package com.xiaozh.basic.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Iteratordelete {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("def");
        stringList.add("def");
        stringList.add("ghi");

//        for (int i = 0; i < stringList.size(); i++) {
//            String str  = stringList.get(i);
//            if("def".equals(str)){
//                stringList.remove(str);
//            }
//        }
//        for (String s: stringList) {
//            System.out.println(s);
//        }
        System.out.println("------------------------------");

        for (int i = stringList.size() - 1; i >= 0; i--) {
            String str  = stringList.get(i);
            if("def".equals(str)){
                stringList.remove(str);
            }
        }
        for (String s: stringList) {
            System.out.println(s);
        }
    }
}
