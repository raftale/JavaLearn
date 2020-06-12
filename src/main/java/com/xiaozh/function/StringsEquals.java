package com.xiaozh.function;

public class StringsEquals {
    public static void main(String[] args) {
//        String str = new String("welcome to");
//        str += " here";
//        System.out.println(str);
//        StringBuffer sb = new StringBuffer();
//        sb.append("hello");
//        sb.append("world");
//        System.out.println(sb);
        /**
         * ==：判断两个对象的内存地址值是不是相等；
         *     1. 若==两侧都是基本数据类型，则判断的是左右两边操作数据的值是否相等。
         *
         *  equals在基类中与==是等价的，但在子类基本上都被重写了，重写后的功能是判断两个对象的内容是否相等。
         *      1. 如果创建了两个值相等的对象，==比较的就是它们的对象引用地址，equals重写后就比较的就是它们的值。
         * **/
        String a = new String("ab"); // a 为一个引用
        String b = new String("ab"); // b 为另一个引用，对象的内容一样
        System.out.println("a.hashcode is "+a.hashCode());  //String的value相同则hashCode相同
        System.out.println("b.hashcode is "+b.hashCode());
        String c = a;
        // == 返回的是
        System.out.println("new String a==b is "+(a == b));  //false. 非同一对象，两个new分别在堆中开辟了内存空间，内存地址不同；
        System.out.println("a equals b is "+ a.equals(b));   //true. String的equals是被重写了的，比较的是值。
        System.out.println("c == a is "+ (c == a));          //ture. 指向堆中同一个内存地址

        String aa = "abc";      // 放在常量池中
        String bb = "abc";      // 从常量池中查找
        System.out.println("aa.hashcode is "+aa.hashCode());
        System.out.println("bb.hashcode is "+bb.hashCode());

        System.out.println("aa == bb is "+ (aa==bb));      // true.
        System.out.println("aa equals bb  is "+ aa.equals(bb)); // true.

        int aaa = 10;
        int bbb = 10;
        float ccc = 10.0f;
        double ddd = 10.00;
        System.out.println("aaa == bbb is "+(aaa == bbb));     // true
        System.out.println("aaa == ccc is "+(aaa == ccc));     // true
        System.out.println("bbb == ccc is "+(bbb == ccc));     // true. 这个可能是因为常量池的原因吧
        System.out.println("ddd == aaa is "+ (ddd == aaa));     //true.


        /**
         * */
        String s1 = "abc";
        StringBuffer s2 = new StringBuffer(s1);
        System.out.println("s1 equals s2 is "+s1.equals(s2));      //false. StringBuffer的祖先为CharSequence, 重写的equals会判断s2是否是s1 String的实例，显然两者不是

        StringBuffer s3 = new StringBuffer("abc");
        System.out.println("s3 equals s1 is " + s3.equals(s1));     //false.
        System.out.println("s3 equals abc is "+s3.equals("abc"));   // false

        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1==str2);      // ==：判断两个对象地址是否相等，如果比较的是基本数据类型，则比较的是值。如果是引用数据类型，则比较的是内存地址。
        System.out.println(str1.equals(str2));  //equals一定重写了equals，否则两个String对象内存地址肯定不同。

        Integer i1 = 127;
        Integer i2 = 127;
        Integer i3 = 129;
        Integer i4 = 129;
        System.out.println("i1 == i2 is " + (i1==i2));
        System.out.println("i3 == i4 is " + (i3==i4));
        System.out.println("i1 equals i2 is " + i1.equals(i2));
        System.out.println("i3 equals i4 is " + i3.equals(i4));


        int ia = 200;
        Integer ib = 200;
        System.out.println(ia==ib);
        System.out.println(ib.equals(ia));
        while(true){

        }

    }
}
