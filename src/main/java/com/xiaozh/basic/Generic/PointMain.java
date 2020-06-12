package com.xiaozh.basic.Generic;

public class PointMain {
    public static void main(String[] args) {
        Point<Integer> p = new Point<>();
        p.setX(new Integer(100));
//        p.setX(new Float(100.12f)); //wrong
        System.out.println(p.getX());

        Point<Float> pf = new Point<>();
        pf.setX(new Float(100.19f));

    }
}
