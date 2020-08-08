package com.xiaozh.basic;

public class ComparableTest implements Comparable<ComparableTest>{
    private String name;
    private int age;

    @Override
    public int compareTo(ComparableTest anotherStudent) {
        int flag = this.name.compareTo(anotherStudent.name);
        if(flag == 0){
            flag = this.age - anotherStudent.age;
        }
        return flag;
    }
}
