package com.xiaozh.basic.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// https://juejin.im/post/5c6d1f08e51d457fbf5de648#comment
public class failFast {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("def");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            stringList.add("ghi");
        }
    }
}
