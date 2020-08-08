package com.xiaozh.basic.Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class erase {
    public static void main(String[] args) {
        Class<? extends ArrayList> class1 = new ArrayList<String>().getClass();
        Class<? extends ArrayList> class2 = new ArrayList<Integer>().getClass();
        System.out.println(Arrays.toString(class1.getTypeParameters() ));
        System.out.println(Arrays.toString(class2.getTypeParameters() ));
        System.out.println(class1.equals(class2));

    }
}
