package com.xiaozh.Collection;

import java.util.ArrayList;
import java.util.List;

public class SubListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>(){{
            add("hollis1");
            add("hollis2");
            add("hollis3");
        }};
        List strings = names.subList(0, 2);
        System.out.println(strings);
        System.out.println("and test github connection");
    }
}
