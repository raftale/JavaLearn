package com.xiaozh.basic.Generic;

//https://www.cnblogs.com/jpfss/p/9928747.html
public class TestObjectPoint {


    public static void main(String[] args) {
        ObjectPoint integerPoint = new ObjectPoint();
        integerPoint.setX(new Integer(100));

        //String stringX = (String) integerPoint.getX(); //强制类型转换，编译期不检查，转换错误也不会报错的
        Integer integerX = (Integer) integerPoint.getX();

        Point<Integer> p = new Point<Integer>();
        p.setX(new Integer(100));
        System.out.println(p.getX());

        Point<Float> p1 = new Point<Float>();
        p1.setX(new Float(100.12f));
        System.out.println(p1.getX());
    }

}
